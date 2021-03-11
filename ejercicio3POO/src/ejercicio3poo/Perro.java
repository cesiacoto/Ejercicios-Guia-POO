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
public class Perro extends Animal {

    private String color_pelaje;

    public Perro(String nombre, String alimento, int edad, String color_pelaje) {
        super(nombre, alimento, edad);
        this.color_pelaje = color_pelaje;
    }

    public String getColor_pelaje() {
        return color_pelaje;
    }

    public void setColor_pelaje(String color_pelaje) {
        this.color_pelaje = color_pelaje;
    }

    public void mostrar() {
        System.out.println(getNombre() + "-" + getAlimento() + "-" + getEdad() + "-" + getColor_pelaje());
    }
}
