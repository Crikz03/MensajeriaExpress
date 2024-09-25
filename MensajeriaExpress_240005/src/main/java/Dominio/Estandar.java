/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Chris
 */
public class Estandar extends Servicio {

    public Estandar() {
        super(30); // Tiempo de entrega predeterminado de 30 unidades
    }

    @Override
    public String toString() {
        return "Estandar";
    }
}
