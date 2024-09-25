/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronFactory;

import Dominio.Paquete;
import Dominio.Sobre;
import Interfaces.IFactoryPaquete;

/**
 *
 * @author Chris
 */
public class FactorySobre implements IFactoryPaquete {

    @Override
    public Paquete crearPaquete() {
        return new Sobre();
    }
}
