/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronIterator;

import Dominio.Entrega;
import Interfaces.IPatronIterator;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chris
 */
public class IteratorEntrega implements IPatronIterator {

    private List<Double> coleccion;
    private int index;

    public IteratorEntrega(Entrega entrega) {
        coleccion = new ArrayList<>();
        coleccion.add(entrega.getTipoPaquete().getCostoAdicional());
        coleccion.add(entrega.getTransporte().getCosto());
        coleccion.add(entrega.getServicio().getCosto());
        index = 0;
    }

    /**
     * Método para obtener el siguiente elemento en la secuencia.
     *
     * @return El siguiente elemento en la secuencia.
     */
    @Override
    public double getNext() {
        double d = coleccion.get(index);
        index++;
        return d;
    }

    /**
     * Método para verificar si hay más elementos en la secuencia.
     *
     * @return true si hay más elementos en la secuencia, false de lo contrario.
     */
    @Override
    public boolean hasNext() {
        return coleccion.size() > index;
    }
}
