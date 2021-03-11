/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3poo;

/**
 *
 * @author Cesia Coto
 */
public class main {

    public static void main(String[] args) {
        //llenar datos
        Perro perro = new Perro("Bocky", "Dogchow", 4, "Cafe");
        Gato gato = new Gato("Juanito", "Pescado", 5, "negro");
        Gallo gallo = new Gallo("Cornelio", "Maiz", 1, "Rojo");
        Hamster hamster = new Hamster("Riqui", "Birutas", 3, 2);
        //-->Mostrar detalles del objeto
        perro.mostrar();
        gato.mostrar();
        gallo.mostrar();
        hamster.mostrar();
    }
}
