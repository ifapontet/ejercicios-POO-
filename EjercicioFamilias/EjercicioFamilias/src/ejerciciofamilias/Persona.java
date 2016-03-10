/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofamilias;

/**
 *
 * @author Estudiante
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String miembroFamilia;

    public Persona(String nombre, String apellido, int edad, String sexo, String miembroFamilia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.miembroFamilia = miembroFamilia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getMiembroFamilia() {
        return miembroFamilia;
    }        
}
