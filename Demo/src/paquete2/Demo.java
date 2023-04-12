/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import static paquete1.Mensaje.obtenerFrase;
import static paquete3.Valor.obtenerHabitantes;


/**
 *
 * @author reroes
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje = obtenerFrase();
        int valor = obtenerHabitantes();
        System.out.printf("%s con %d\n", mensaje, valor);
    }
    
}
