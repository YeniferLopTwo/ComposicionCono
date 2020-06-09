/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasresuelto;

/**
 *
 * @author YENIFER LOPEZ
 */
public final class Linea extends Figura {

    private int x1, y1, x2, y2;

    public Linea() {
        super("rojo", "ancho");
        this.x1 = 25;
        this.y1 = 40;
        this.x2 = 25;
        this.y2 = 96;
    }

    public boolean esUnaRecta() {
        if (this.x1 == this.x2 || this.y1 == this.y2) {
            return true;
        } else {
            return false;
        }
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void imprimir() { // redefine el método abstracto imprimir del padre
        System.out.println("LINEA:");
        System.out.println(" Color: " + this.estilo.getColor());
        System.out.println(" Grosor: " + this.estilo.getGrosor());
        System.out.println(" Punto 1: (" + this.x1 + "," + this.y1 + ")");
        System.out.println(" Punto 2: (" + this.x2 + "," + this.y2 + ")");
        System.out.println();
    }
}
