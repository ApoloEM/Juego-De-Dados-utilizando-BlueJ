import java.util.Random;

/**
 * Modela un dado.
 *
 * @author (EM)
 * @version (27/08/2025)
 */
public class Dado
{
    private int caras;
    private String colorDado;
    private String colorPuntos;
    private int caraActual;
    DadoGrafico caraDibujada;
    
    public Dado(){
        caras=6;
    }
        
    public Dado(int cantidadCaras){
        caras=cantidadCaras;
    }
    
    public int getCaras(){
        return caras;
    }
    
    public int lanzar(){
        Random rmd= new Random ();
        caraActual=rmd.nextInt(6)+1;

        return caraActual;
    }
    
    public int getCaraActual(){
        return caraActual;
    }
    
    public void dibujar(){
        caraDibujada = new DadoGrafico();
        caraDibujada.dibujarCara(getCaraActual());
    }
    
    public void mover(int dx) {
        caraDibujada.moverDado(dx);
    }
    
    public String toString() {
        return "Dado = " + caraActual;
    }
}

