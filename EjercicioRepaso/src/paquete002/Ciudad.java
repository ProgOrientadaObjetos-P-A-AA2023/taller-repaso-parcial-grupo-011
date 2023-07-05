/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;

/**
 *
 * @author reroes
 */
public class Ciudad {
   private String nombreCiudad;

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public void establecerNombreCiudad(String c) {
        nombreCiudad = c;
    }

    public Ciudad(String c) {
       nombreCiudad= c;
    }
}
