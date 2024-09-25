/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Dominio.Entrega;
import Dominio.Transporte;

/**
 *
 * @author Chris
 */
public interface IManageEntrega {

    public Entrega crearEntrega(String servicio, double distancia, String tipoPaquete);

    public double getDistancia(double distancia);

    public void setServicio(String servicio);

    public void setTransporte(String servicio, double distancia, String tipoPaquete);

    public void setPaquete(String tipoPaquete);

    public void setDistancia(double distancia);

    public double getCosto(Entrega entrega);

    public double getTiempoEstimado(double distancia, Transporte transport);
}
