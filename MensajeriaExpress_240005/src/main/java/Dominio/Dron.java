/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Chris
 */
public class Dron extends Transporte {

    public Dron() {
        super(60, 20); // Capacidad de pasajeros y carga predeterminada
    }

    @Override
    public String toString() {
        return "Dron";
    }
}
