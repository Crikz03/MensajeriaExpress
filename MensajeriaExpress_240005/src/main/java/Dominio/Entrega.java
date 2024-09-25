/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Chris
 */
public class Entrega {

    private Servicio servicio;
    private Transporte transporte;
    private Paquete tipoPaquete;
    private double distancia;
    private double costoFinal;
    private double tiempoLlegada;

    public Entrega() {
    }

    public Entrega(Servicio servicio, Transporte transporte, Paquete tipoPaquete, double distancia) {
        this.servicio = servicio;
        this.transporte = transporte;
        this.tipoPaquete = tipoPaquete;
        this.distancia = distancia;
        costoFinal = 0;
    }

    public double getTiempoLlegada() {
        return tiempoLlegada;
    }

    public void setTiempoLlegada(double tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Paquete getTipoPaquete() {
        return tipoPaquete;
    }

    public void setTipoPaquete(Paquete tipoPaquete) {
        this.tipoPaquete = tipoPaquete;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public void setCostoFinal(double costoFinal) {
        this.costoFinal = costoFinal;
    }

    @Override
    public String toString() {
        return "Entrega{" + "servicio=" + servicio + ", transporte=" + transporte + ", tipoPaquete=" + tipoPaquete + ", distancia=" + distancia + ", costoFinal=" + costoFinal + ", tiempoLlegada=" + tiempoLlegada + '}';
    }
}
