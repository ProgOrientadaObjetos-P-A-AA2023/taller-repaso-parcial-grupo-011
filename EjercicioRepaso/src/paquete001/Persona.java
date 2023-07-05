package paquete001;
import paquete002.Ciudad;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author reroes
 */
public class Persona {
    public String nombre;
    public String apellido;
    public int edad;
    public String cedula;
    public Ciudad ciudad;

    public Persona(String n, String a, int e, String c, Ciudad ci) {
        nombre = n;
        apellido = a;
        edad = e;
        cedula = c;
        ciudad = ci;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public int obtenerEdad() {
        return edad;
    }

    public void establecerEdad(int e) {
        edad = e;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(Ciudad ci) {
        ciudad = ci;
    }
    
    
}
