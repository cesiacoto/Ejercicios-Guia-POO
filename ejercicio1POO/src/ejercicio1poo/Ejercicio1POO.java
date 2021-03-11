/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1poo;

import Estudiante.Estudiante;

/**
 *
 * @author Cesia Coto
 */
public class Ejercicio1POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante persona1;
        persona1 = new Estudiante();
        persona1.Datos();
        System.out.println("");
        persona1.Materias();
        persona1.imprimir_datos();
    }

}
