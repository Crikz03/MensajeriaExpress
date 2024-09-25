/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Dominio.Estandar;
import Dominio.Express;
import Dominio.Paquete;
import Dominio.Transporte;

/**
 *
 * @author Chris
 */
public interface IFactoryManager {

    public Paquete crearSobre();

    public Paquete crearCajaChica();

    public Paquete crearCajaMediana();

    public Paquete crearCajaGrande();

    public Estandar getEstandar();

    public Express servicioExpress();

    public Transporte crearDron();

    public Transporte crearBicicleta();

    public Transporte crearMotocicleta();

    public Transporte crearCarro();
}
