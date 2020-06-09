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
public final class Punto extends Figura {

    private int x, y;

    public Punto() {
        super("azul", "fino");
        this.x = 0;
        this.y = 0;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void imprimir() { // redefine el método abstracto imprimir del padre
        System.out.println("PUNTO:");
        System.out.println(" Color: " + this.estilo.getColor());
        System.out.println(" Grosor: " + this.estilo.getGrosor());
        System.out.println(" X: " + this.x);
        System.out.println(" Y: " + this.y);
        System.out.println();
    }
}