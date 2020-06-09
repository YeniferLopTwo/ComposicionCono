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
public abstract class Figura {

    protected static int ID = 0;
    protected Estilo estilo;

    public Figura() {
        Figura.ID++;
        this.estilo = new Estilo(); // es una composición
    }

    public Figura(String color, String grosor) {
        Figura.ID++;
        this.estilo = new Estilo(); // es una composición
        this.estilo.setColor(color);
        this.estilo.setGrosor(grosor);
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Figura.ID = ID;
    }

    public Estilo getEstilo() {
        return estilo;
    }

    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }
    /*
    @overide
    */
    public abstract void imprimir();
}
