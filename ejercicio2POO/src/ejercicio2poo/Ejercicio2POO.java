/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2poo;

import java.util.Scanner;
import Calculadora1.CalculadoraBasica;
import Calculadora2.CalculadoraAvanzada;

/**
 *
 * @author Cesia Coto
 */
public class Ejercicio2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int op;
        CalculadoraBasica cBasica = new CalculadoraBasica();
        CalculadoraAvanzada cAvanzada = new CalculadoraAvanzada();
        System.out.println("CALCULADORA");
        System.out.println("MENU DE OPCIONES");
        System.out.println("1-SUMA");
        System.out.println("2-RESTA");
        System.out.println("3-MULTIPLICACION");
        System.out.println("4-DIVISION");
        System.out.println("5-POTENCIA");
        System.out.println("6-OPUESTO");
        System.out.println("7-FACTORIAL");
        System.out.print("Digite el numero de la opcion que desea: ");
        op = scn.nextInt();
        switch (op) {
            case 1:
                //suma
                cBasica.Suma();
                break;
            case 2:
                //resta
                cBasica.Resta();
                break;
            case 3:
                //multiplicacion
                cBasica.Multiplicacion();
                break;
            case 4:
                //division
                cBasica.Division();
                break;
            case 5:
                //potencia
                cAvanzada.Potencia();
                break;
            case 6:
                //opuesto
                cAvanzada.Opuesto();
                break;
            case 7:
                //factorial
                cAvanzada.Factorial();
                break;
            default:
                System.out.println("Error, opcion elegida no valida.");
                break;
        }
    }

}
