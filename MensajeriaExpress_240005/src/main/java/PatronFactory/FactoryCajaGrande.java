/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronFactory;

import Dominio.CajaGrande;
import Dominio.Paquete;
import Interfaces.IFactoryPaquete;

/**
 *
 * @author Chris
 */
public class FactoryCajaGrande implements IFactoryPaquete {

    @Override
    public Paquete crearPaquete() {
        return new CajaGrande();
    }
}
