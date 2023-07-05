/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete001.Persona;
import paquete003.Pago;

/**
 *
 * @author reroes
 */
public class PagoLuzElectrica extends Pago {

    
    @Override
    public void calcularPago() {
        double tarifaBase = 10.20;
        double kilovatiosConsumidos = 80;
        double costoKilovatio = 0.5;
        String ciudad = "Loja";
        if (ciudad.equals("Loja")) {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }

        
    }
    public double obtenerPago() {
        return pago;
    }
    
    @Override
    public String toString() {

        String mensaje = String.format("\tLuz Electrica\n"
                + "Pago LuzElectrica: %.2f\n", 
                obtenerPago());

        return mensaje;
        
    }
}
