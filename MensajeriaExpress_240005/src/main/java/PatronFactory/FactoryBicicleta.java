/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronFactory;

import Dominio.Bicicleta;
import Dominio.Transporte;
import Interfaces.IFactoryTransporte;

/**
 *
 * @author Chris
 */
public class FactoryBicicleta implements IFactoryTransporte {

    @Override
    public Transporte crearTransporte() {
        return new Bicicleta();
    }
}
