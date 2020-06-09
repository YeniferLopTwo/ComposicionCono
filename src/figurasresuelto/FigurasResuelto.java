/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasresuelto;

import java.util.Random;

/**
 *
 * @author YENIFER LOPEZ
 */
public class FigurasResuelto {
    private static Figura crearFiguraAleatoriamente() {
        int valor = new Random().nextInt(2);
        if (valor == 0) 
            return new Punto();
         else 
            return new Linea();
    }
         
    public static void main(String[] args) {
        Figura figura1, figura2, figura3;
        figura1 = crearFiguraAleatoriamente();
        figura2 = crearFiguraAleatoriamente();
        figura3 = crearFiguraAleatoriamente();
        figura1.imprimir();
        figura2.imprimir();
        figura3.imprimir();
    }
}
