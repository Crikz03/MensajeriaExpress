/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronFacades;

import PatronFactory.FactoryBicicleta;
import PatronFactory.FactoryCajaChica;
import PatronFactory.FactoryCajaGrande;
import PatronFactory.FactoryCajaMediana;
import PatronFactory.FactoryCarro;
import PatronFactory.FactoryDron;
import PatronFactory.FactoryMotocicleta;
import PatronFactory.FactorySobre;
import Dominio.Estandar;
import Dominio.Express;
import Dominio.Paquete;
import Dominio.Transporte;
import Interfaces.IFactoryManager;

/**
 *
 * @author Chris
 */
public class FactoryManager implements IFactoryManager {

    private FactorySobre crearSobre;
    private FactoryCajaChica crearCajaChica;
    private FactoryCajaMediana crearCajaMediana;
    private FactoryCajaGrande crearCajaGrande;
    private Estandar servicioEstandar;
    private Express servicioExpress;
    private FactoryDron crearDron;
    private FactoryBicicleta crearBicicleta;
    private FactoryMotocicleta crearMotocicleta;
    private FactoryCarro crearCarro;

    public FactoryManager() {
        this.crearSobre = new FactorySobre();
        this.crearCajaChica = new FactoryCajaChica();
        this.crearCajaMediana = new FactoryCajaMediana();
        this.crearCajaGrande = new FactoryCajaGrande();
        this.servicioEstandar = new Estandar();
        this.servicioExpress = new Express();
        this.crearDron = new FactoryDron();
        this.crearBicicleta = new FactoryBicicleta();
        this.crearMotocicleta = new FactoryMotocicleta();
        this.crearCarro = new FactoryCarro();
    }

    @Override
    public Paquete crearSobre() {
        return crearSobre.crearPaquete();
    }

    @Override
    public Paquete crearCajaChica() {
        return crearCajaChica.crearPaquete();
    }

    @Override
    public Paquete crearCajaMediana() {
        return crearCajaMediana.crearPaquete();
    }

    @Override
    public Paquete crearCajaGrande() {
        return crearCajaGrande.crearPaquete();
    }

    @Override
    public Estandar getEstandar() {
        return servicioEstandar;
    }

    @Override
    public Express servicioExpress() {
        return servicioExpress;
    }

    @Override
    public Transporte crearDron() {
        return crearDron.crearTransporte();
    }

    @Override
    public Transporte crearBicicleta() {
        return crearBicicleta.crearTransporte();
    }

    @Override
    public Transporte crearMotocicleta() {
        return crearMotocicleta.crearTransporte();
    }

    @Override
    public Transporte crearCarro() {
        return crearCarro.crearTransporte();
    }
}
