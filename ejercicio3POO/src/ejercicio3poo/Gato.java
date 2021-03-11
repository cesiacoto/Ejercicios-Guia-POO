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
public class Gato extends Animal {

    String color_ojos;

    public Gato(String nombre, String alimento, int edad, String color_ojos) {
        super(nombre, alimento, edad);
        this.color_ojos = color_ojos;
    }

    public String getColor_ojos() {
        return color_ojos;
    }

    public void setColor_ojos(String color_ojos) {
        this.color_ojos = color_ojos;
    }

    public void mostrar() {
        System.out.println(getNombre() + "-" + getAlimento() + "-" + getEdad() + "-" + getColor_ojos());
    }
}
