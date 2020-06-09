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
public final class Estilo {

    private String color, grosor;

    public Estilo() {
        this.color = "sin color";
        this.grosor = "sin grosor";
    }

    public Estilo(String color, String grosor) {
        this.color = color;
        this.grosor = grosor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGrosor() {
        return grosor;
    }

    public void setGrosor(String grosor) {
        this.grosor = grosor;
    }
}
