/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Main;

import PatronFacades.DeliveryManager;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class Main {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DeliveryManager managerEntrega = new DeliveryManager();
        String tipoPaquete, servicio;
        double distancia;
        System.out.println("Bienvenido al servicio de mensajeria");
        System.out.println("Selecciona el tipo de paquete: (Sobre, CajaChica, CajaMediana, CajaGrande)");
        tipoPaquete = tec.nextLine();
        System.out.println("Selecciona el tipo de envio: (estandar, express)");
        servicio = tec.nextLine();
        System.out.println("Favor de ingresar la distancia: ");
        distancia = tec.nextDouble();

        System.out.println("\n\n" + managerEntrega.crearEntrega(servicio, distancia, tipoPaquete) + "\n\n");
    }
}
