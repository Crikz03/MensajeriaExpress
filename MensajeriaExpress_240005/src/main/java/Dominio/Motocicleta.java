/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Chris
 */
public class Motocicleta extends Transporte {

    public Motocicleta() {
        super(45, 15); // Capacidad de pasajeros y carga predeterminada
    }

    @Override
    public String toString() {
        return "Motocicleta";
    }
}
