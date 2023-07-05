/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete001.Persona;
import paquete002.Propiedad;
import paquete003.Pago;

/**
 *
 * @author reroes
 */
public class PagoPredial extends Pago {
    
    
    @Override
    public void calcularPago(){
        double valorPropiedad = 56000;
        double porcentaje = 10;
        pago = valorPropiedad - ((valorPropiedad*porcentaje)/100);
        
    }
    
    @Override
    public double obtenerPago() {
        return pago;
    }
    
     @Override
    public String toString() {

        String mensaje = String.format("\tPredial\n"
                + "Pago Predial: %.2f\n", 
                obtenerPago());

        return mensaje;
        
    }
}
