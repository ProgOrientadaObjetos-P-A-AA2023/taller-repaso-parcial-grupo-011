/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete005;

import java.util.ArrayList;
import paquete001.Persona;
import paquete002.Ciudad;
import paquete002.Propiedad;
import paquete003.BilleteraPagos;
import paquete003.Pago;
import paquete004.*;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        ArrayList<Pago> listaPagos = new ArrayList<>();

        Pago aguaCasa = new PagoAguaPotable(30, 6, 7, "Casa");
        Pago aguaComercio = new PagoAguaPotable(35, 4, 7, "Comercial");

        Ciudad ciudad1 = new Ciudad("Loja");
        Pago luzCasa = new PagoLuzElectrica(50, 324, 4, ciudad1);

        Ciudad ciudad2 = new Ciudad("Quito");
        Pago luzComercio = new PagoLuzElectrica(50, 324, 4, ciudad2);

        Propiedad propiedad1 = new Propiedad(10000);
        Pago casa1 = new PagoPredial(propiedad1, 10);

        Propiedad propiedad2 = new Propiedad(2000);
        Pago casa2 = new PagoPredial(propiedad2, 15);

        Pago telefonoCasa = new PagoTelefonoConvencional(20, 2000, 0.3);

        Pago telefonoFinca = new PagoTelefonoConvencional(19, 2100, 0.4);

        listaPagos.add(aguaCasa);
        listaPagos.add(aguaComercio);
        listaPagos.add(luzCasa);
        listaPagos.add(luzComercio);
        listaPagos.add(casa1);
        listaPagos.add(casa2);
        listaPagos.add(telefonoCasa);
        listaPagos.add(telefonoFinca);

        for (Pago lista1 : listaPagos) {
            lista1.calcularPago();
        }

        Ciudad ciudad = new Ciudad("Loja");
        Persona p = new Persona("Luis", "Vasquez", 18, "11500", ciudad);
 
        BilleteraPagos pago = new BilleteraPagos(p, "12", listaPagos);

        System.out.println(pago);

    }
}
