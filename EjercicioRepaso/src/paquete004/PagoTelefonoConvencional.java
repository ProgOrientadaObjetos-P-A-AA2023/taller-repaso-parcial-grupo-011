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
public class PagoTelefonoConvencional extends Pago {
    
    
    
    @Override
    public void calcularPago(){
        double tarifa = 6.20;
        double minutosConsumidos = 100;
        double costoMinuto = 0.2;
        pago = tarifa + (minutosConsumidos * costoMinuto);
        
    }

   
    
    
    
  
     @Override
    public String toString() {

        String mensaje = String.format("\tTelefono Convencional\n"
                + "Pago Telefono Convencional: %.2f\n", 
                obtenerPago());

        return mensaje;
        
    }
    
}
