/**
 * Juego de dados. Se tiran los tres dados.
 * Gana el jugador que tiene 3 valores iguales o la suma
 * de los dados es mayor a 14.
 *
 * @author EM
 * @version 3/9/12025
 */
public class JuegoDeDados
{
    private Dado dado1;
    private Dado dado2;
    private Dado dado3;
    
    public JuegoDeDados(){
        dado1 = new Dado();
        dado2 = new Dado();
        dado3 = new Dado();
    }

    public void lanzar3Dados(){
        dado1.lanzar();
        dado2.lanzar();
        dado3.lanzar();
    }
    
    public boolean sonLos3Iguales(){
        return dado1.getCaraActual()==dado2.getCaraActual()&&dado1.getCaraActual()==dado3.getCaraActual();
    }
    
    public int suma3Dados(){
        return dado1.getCaraActual()+dado2.getCaraActual()+dado3.getCaraActual();
    }
    
    public boolean seGano(){
        if(suma3Dados()>14 || sonLos3Iguales()){
            return true;
        }
        return false;
    }
    
    public void dibujarDadosLanzados(){
        dado1.dibujar();
        dado2.dibujar();
        dado3.dibujar();
        
        dado2.mover(120);
        dado3.mover(240);
    }
    
    public void jugar(){
        lanzar3Dados();
        dibujarDadosLanzados();
        
        System.out.println("Tu dado1 dio: " + dado1);
        System.out.println("Tu dado2 dio: " + dado2);
        System.out.println("Tu dado3 dio: " + dado3);
        System.out.println("La suma de los dados es: " + suma3Dados());
        
        if(seGano()){
            System.out.println("Ganasteeee!!!");
        }
        else{
            System.out.println("Perdiste :(");
        }
    }
}
