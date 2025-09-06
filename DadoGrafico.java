/**
 * Dibuja un dado.
 *
 * @author (EM)
 * @version (27/8/2025)
 */
public class DadoGrafico
{
    private Square cuadrado;
    private Circle c1;
    private Circle c2;
    private Circle c3;
    private Circle c4;
    private Circle c5;
    private Circle c6;
    private int caraActual;
    
    public DadoGrafico(){
        cuadrado = new Square(100,10,20,"yellow",true);
        c1 = new Circle(20,0,0,"green");
        c2 = new Circle(20,0,0,"green");
        c3 = new Circle(20,0,0,"green");
        c4 = new Circle(20,0,0,"green");
        c5 = new Circle(20,0,0,"green");
        c6 = new Circle(20,0,0,"green");
        cuadrado.makeVisible();
        caraActual = 1;
    }
    
    public void dibujarCara(int cara) {
        caraActual = cara;
        cuadrado.makeVisible();
        c1.makeInvisible();
        c2.makeInvisible();
        c3.makeInvisible();
        c4.makeInvisible();
        c5.makeInvisible();
        c6.makeInvisible();
    
        switch(cara) {
            case 1:
                moverCirculo(c1, 2, 2);
                c1.makeVisible();
                break;
            case 2:
                moverCirculo(c1, 1, 1);
                moverCirculo(c2, 3, 3);
                c1.makeVisible();
                c2.makeVisible();
                break;
            case 3:
                moverCirculo(c1, 1, 1);
                moverCirculo(c2, 2, 2);
                moverCirculo(c3, 3, 3);
                c1.makeVisible();
                c2.makeVisible();
                c3.makeVisible();
                break;
            case 4:
                moverCirculo(c1, 1, 1);
                moverCirculo(c2, 1, 3);
                moverCirculo(c3, 3, 1);
                moverCirculo(c4, 3, 3);
                c1.makeVisible();
                c2.makeVisible();
                c3.makeVisible();
                c4.makeVisible();
                break;
            case 5:
                moverCirculo(c1, 1, 1);
                moverCirculo(c2, 1, 3);
                moverCirculo(c3, 3, 1);
                moverCirculo(c4, 3, 3);
                moverCirculo(c5, 2, 2);
                c1.makeVisible();
                c2.makeVisible();
                c3.makeVisible();
                c4.makeVisible();
                c5.makeVisible();
                break;
            case 6:
                moverCirculo(c1, 1, 1);
                moverCirculo(c2, 2, 1);
                moverCirculo(c3, 3, 1);
                moverCirculo(c4, 1, 3);
                moverCirculo(c5, 2, 3);
                moverCirculo(c6, 3, 3);
                c1.makeVisible();
                c2.makeVisible();
                c3.makeVisible();
                c4.makeVisible();
                c5.makeVisible();
                c6.makeVisible();
                break;
        }
    }

    public void moverCirculo(Circle c, int fila, int col) {
        int ladoDado = cuadrado.getSize();
        int tamPunto = c.getDiameter();
        int borde = 20;
        
        int espacioDisponible = ladoDado - (2 * borde);
        int celda = espacioDisponible / 2;
        
        int baseX = cuadrado.getXposition() + borde + (col - 1) * celda;
        int baseY = cuadrado.getYposition() + borde + (fila - 1) * celda;
        
        int destinoX = baseX - tamPunto / 2;
        int destinoY = baseY - tamPunto / 2;
        
        c.moveHorizontal(destinoX - c.getXposition());
        c.moveVertical(destinoY - c.getYposition());
    }
    
    public void moverDado(int dx) {
        cuadrado.moveHorizontal(dx);
        
        dibujarCara(caraActual);
    }
}
