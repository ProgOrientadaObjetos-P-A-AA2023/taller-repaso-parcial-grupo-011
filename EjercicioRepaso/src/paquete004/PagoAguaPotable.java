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
public class PagoAguaPotable extends Pago {

    private String tipoPagoAguaPotable;
    private double tarifaFija;
    private double metrosCubicosConsumo;
    private double costoConsumoCubicos ;

    public void setTipoPagoAguaPotable(String tP) {
        tipoPagoAguaPotable = tP;
    }

    public String getTipoPagoAguaPotable() {
        return tipoPagoAguaPotable;
    }

    @Override
    public void calcularPago() {

        if (tipoPagoAguaPotable.equals("comercial")) {
            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15;
        } else {

            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos);
        }

    }

    public double obtenerPago() {
        return pago;
    }

    @Override
    public String toString() {

        String mensaje = String.format("\tAgua Potable\n"
                + "Tipo: %s\n"
                + "Pago Agua Potable: %.2f\n"
                + "", getTipoPagoAguaPotable(), obtenerPago());

        return mensaje;

    }
}
