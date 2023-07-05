/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;

import java.util.ArrayList;
import paquete001.Persona;
import paquete002.Ciudad;


/**
 *
 * @author reroes
 */
public  class BilleteraPagos {
    public Persona persona;
   public Ciudad ciudad;
   public ArrayList<Pago> listaPagos;

    public BilleteraPagos(Persona p, Ciudad c, ArrayList<Pago> lP) {
        persona = p;
        ciudad = c;
        listaPagos = lP;
    }
    
    
    
    @Override
    public String toString(){
        /*
            Se debe presentar el reporte que incluya
            información correspondiente oportuna
        */
        
        String cadena = String.format("\tBilletera de Pagos\n"
                + "Usuario: %s\n"
                + "Ciudad: %s\n"
                +"Lista de pagos: \n", 
                persona,
                ciudad);
        double suma=0;
        
        for (int i = 0; i < listaPagos.size(); i++) {
            listaPagos.get(i).calcularPago();
            suma = suma + listaPagos.get(i).obtenerPago();
            cadena= String.format("%s\n", listaPagos.get(i).obtenerPago() );
            
        }
        
        
        
        return cadena;
    }
    
}
