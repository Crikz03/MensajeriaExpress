/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronFacades;

import Dominio.Entrega;
import Dominio.Transporte;
import Interfaces.IManageEntrega;
import PatronBuilder.BuilderEntrega;
import PatronIterator.IteratorEntrega;

/**
 *
 * @author Chris
 */
public class DeliveryManager implements IManageEntrega{

    private FactoryManager factoryManager;
    private BuilderEntrega builderEntrega;

    /**
     * Constructor de la clase ManagerEntrega. Inicializa el BuilderEntrega y el
     * ManagerFactory.
     */
    public DeliveryManager() {
        this.builderEntrega = new BuilderEntrega();
        this.factoryManager = new FactoryManager();
    }

    /**
     * Método para crear una entrega con los parámetros especificados.
     *
     * @param servicio El servicio de entrega.
     * @param distancia La distancia de la entrega.
     * @param tipoPaquete El tipo de paquete a entregar.
     * @return La entrega creada.
     */
    @Override
    public Entrega crearEntrega(String servicio, double distancia, String tipoPaquete) {
        builderEntrega.restaurar();
        setServicio(servicio);
        setTransporte(servicio, distancia, tipoPaquete);
        setDistancia(distancia);
        setPaquete(tipoPaquete);
        builderEntrega.builderTiempoEstimado(getTiempoEstimado(distancia, builderEntrega.getProducto().getTransporte()));
        builderEntrega.addCosto(getDistancia(distancia));
        builderEntrega.addCosto(getCosto(builderEntrega.getProducto()));
        return builderEntrega.getProducto();
    }

    /**
     * Constructor de la clase ManagerEntrega que recibe un ManagerFactory y un
     * BuilderEntrega.
     *
     * @param factoryManager El ManagerFactory a utilizar.
     * @param builderEntrega El BuilderEntrega a utilizar.
     */
    public DeliveryManager(FactoryManager factoryManager, BuilderEntrega builderEntrega) {
        this.factoryManager = factoryManager;
        this.builderEntrega = builderEntrega;
    }

    /**
     * Método para calcular el costo adicional basado en la distancia.
     *
     * @param distancia La distancia a calcular el costo adicional.
     * @return El costo adicional calculado.
     */
    @Override
    public double getDistancia(double distancia) {
        if (distancia > 10) {
            return (distancia - 10) * 5;
        }
        return 0;
    }

    /**
     * Método para establecer el servicio de entrega.
     *
     * @param servicio El servicio de entrega a establecer.
     */
    @Override
    public void setServicio(String servicio) {
        if (servicio.equalsIgnoreCase("Express")) {
            builderEntrega.builderServicio(factoryManager.servicioExpress());
        } else {
            builderEntrega.builderServicio(factoryManager.getEstandar());
        }
    }

    /**
     * Método para establecer el transporte de entrega.
     *
     * @param servicio El servicio de entrega.
     * @param distancia La distancia de la entrega.
     * @param tipoPaquete El tipo de paquete a entregar.
     */
    @Override
    public void setTransporte(String servicio, double distancia, String tipoPaquete) {
        if (distancia <= 1) {
            if (servicio.equalsIgnoreCase("Express")) {
                builderEntrega.builderTransporte(factoryManager.crearDron());
            } else {
                builderEntrega.builderTransporte(factoryManager.crearBicicleta());
            }
        } else {
            if (servicio.equalsIgnoreCase("Express")) {
                builderEntrega.builderTransporte(factoryManager.crearMotocicleta());
            } else {
                builderEntrega.builderTransporte(factoryManager.crearBicicleta());
            }
        }
    }

    /**
     * Método para establecer el paquete de entrega.
     *
     * @param tipoPaquete El tipo de paquete a establecer.
     */
    @Override
    public void setPaquete(String tipoPaquete) {
        if (tipoPaquete.equalsIgnoreCase("Caja Grande")) {
            builderEntrega.builderPaquete(factoryManager.crearCajaGrande());
        } else {
            if (tipoPaquete.equalsIgnoreCase("Envelope")) {
                builderEntrega.builderPaquete(factoryManager.crearSobre());
            } else {
                if (tipoPaquete.equalsIgnoreCase("Small Box")) {
                    builderEntrega.builderPaquete(factoryManager.crearCajaChica());
                } else {
                    builderEntrega.builderPaquete(factoryManager.crearCajaMediana());
                }
            }
        }
    }

    /**
     * Método para establecer la distancia de entrega.
     *
     * @param distancia La distancia de entrega a establecer.
     */
    @Override
    public void setDistancia(double distancia) {
        builderEntrega.builderDistancia(distancia);
    }

    /**
     * Método para calcular el costo total de la entrega.
     *
     * @param entrega La entrega de la cual se desea calcular el costo.
     * @return El costo total de la entrega.
     */
    @Override
    public double getCosto(Entrega entrega) {
        IteratorEntrega iterator = new IteratorEntrega(entrega);
        double cost = 0;
        while (iterator.hasNext()) {
            cost += iterator.getNext();
        }
        return cost;
    }

    /**
     * Método para obtener el tiempo estimado de entrega.
     *
     * @param distance La distancia de la entrega.
     * @param transport El transporte utilizado en la entrega.
     * @return El tiempo estimado de entrega.
     */
    @Override
    public double getTiempoEstimado(double distance, Transporte transport) {
        return distance * 60 / transport.getVelocidadPromedio();
    }
}
