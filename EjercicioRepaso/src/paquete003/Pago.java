/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;



/**
 *
 * @author SALA H
 */
public abstract class Pago {
    
    protected double pago;

    // abstract
    public abstract void calcularPago();

    public double obtenerPago() {
        return pago;
    }

}
