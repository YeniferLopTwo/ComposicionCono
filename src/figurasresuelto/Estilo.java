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
/**
 * 
 */
    public Estilo() {
        this.color = "sin color";
        this.grosor = "sin grosor";
    }
/**
 * 
 * @param color definidp
 * @param grosor definido
 */
    public Estilo(String color, String grosor) {
        this.color = color;
        this.grosor = grosor;
    }
/**
 * 
 * @return obtiene color
 */
    public String getColor() {
        return color;
    }
/**
 * 
 * @param color lo muestra
 */
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
