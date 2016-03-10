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
public class Familia {
  private Persona[] integrantes;
  private String apellido;

    public Familia(Persona[] integrantes, String apellido) {
        this.integrantes = integrantes;
        this.apellido = apellido;
    }

    public Persona[] getIntegrantes() {
        return integrantes;
    }

    public String getApellido() {
        return apellido;
    }


   
  
    
    
  
  
    
}
