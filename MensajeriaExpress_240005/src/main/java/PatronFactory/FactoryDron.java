/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronFactory;

import Dominio.Dron;
import Dominio.Transporte;
import Interfaces.IFactoryTransporte;

/**
 *
 * @author Chris
 */
public class FactoryDron implements IFactoryTransporte {

    @Override
    public Transporte crearTransporte() {
        return new Dron();
    }
}
