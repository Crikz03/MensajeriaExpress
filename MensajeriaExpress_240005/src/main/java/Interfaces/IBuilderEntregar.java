/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Dominio.Entrega;
import Dominio.Paquete;
import Dominio.Servicio;
import Dominio.Transporte;

/**
 *
 * @author Chris
 */
public interface IBuilderEntregar {

    public void builderServicio(Servicio service);

    public void builderTransporte(Transporte transport);

    public void builderPaquete(Paquete packageType);

    public void addCosto(double costo);

    public Entrega getProducto();

    public void builderDistancia(double distancia);

    public void builderTiempoEstimado(double TiempoEstimado);

    public void restaurar();
}
