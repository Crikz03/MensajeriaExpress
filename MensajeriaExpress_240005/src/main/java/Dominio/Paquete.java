/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Chris
 */
public abstract class Paquete {

    private double costo;

    public Paquete(double costo) {
        this.costo = costo;
    }

    public double getCostoAdicional() {
        return costo;
    }

    public void setCostoAdicional(double costoAdicional) {
        this.costo = costoAdicional;
    }
}
