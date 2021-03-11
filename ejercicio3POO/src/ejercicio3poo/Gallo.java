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
public class Gallo extends Animal {

    String color_plumas;

    public Gallo(String nombre, String alimento, int edad, String color_plumas) {
        super(nombre, alimento, edad);
        this.color_plumas = color_plumas;
    }

    public String getColor_plumas() {
        return color_plumas;
    }

    public void setColor_plumas(String color_plumas) {
        this.color_plumas = color_plumas;
    }

    public void mostrar() {
        System.out.println(getNombre() + "-" + getAlimento() + "-" + getEdad() + "-" + getColor_plumas());
    }
}
