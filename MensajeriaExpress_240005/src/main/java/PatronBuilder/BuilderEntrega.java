/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronBuilder;

import Dominio.Entrega;
import Dominio.Paquete;
import Dominio.Servicio;
import Dominio.Transporte;
import Interfaces.IBuilderEntregar;

/**
 *
 * @author Chris
 */
public class BuilderEntrega implements IBuilderEntregar {

    private Entrega entrega;

    public BuilderEntrega() {
        this.entrega = new Entrega();
    }

    public BuilderEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    @Override
    public void builderServicio(Servicio service) {
        entrega.setServicio(service);
    }

    @Override
    public void builderTransporte(Transporte transport) {
        entrega.setTransporte(transport);
    }

    @Override
    public void builderPaquete(Paquete packageType) {
        entrega.setTipoPaquete(packageType);
    }

    @Override
    public void addCosto(double costo) {
        entrega.setCostoFinal(entrega.getCostoFinal() + costo);
    }

    @Override
    public Entrega getProducto() {
        return entrega;
    }

    @Override
    public void builderDistancia(double distancia) {
        entrega.setDistancia(distancia);
    }

    @Override
    public void builderTiempoEstimado(double TiempoEstimado) {
        entrega.setTiempoLlegada(TiempoEstimado);
    }

    @Override
    public void restaurar() {
        this.entrega = new Entrega();
    }
}
