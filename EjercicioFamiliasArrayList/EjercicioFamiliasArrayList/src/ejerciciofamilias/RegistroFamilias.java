/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofamilias;

/**
 *
 * @author Julian
 */
import java.util.*;
public class RegistroFamilias {
    private Familia[] familias;

    public RegistroFamilias(Familia[] familias) {
      this.familias=familias;
    }
    
    public static String imprimirFamilia(ArrayList<Persona> familiares){ 
      String os = "Familia " + familiares.get(0).getApellido() + "\n";
      for(int i=0; i< familiares.size(); i++){
        os+= familiares.get(i).getMiembroFamilia() + "\n";
        os+= "Sexo: " + familiares.get(i).getSexo();
        os+= "Nombre: " + familiares.get(i).getNombre() + " " + familiares.get(i).getApellido() + "\n";
        os+= "Edad: " + familiares.get(i).getEdad() + "\n";
      }
      return os;
    }
    
    public static int buscarSubIndiceNombre(ArrayList<Persona> A, String buscarNombre){
      for(int i=0; i<A.size(); i++){
        if(A.get(i).getNombre().equals(buscarNombre)){      
          return i;
        }    
      } 
      return -1;
    }
    
    public static String imprimirFamiliaNombreEncontrado(ArrayList<Persona> A, String buscarNombre){
      int n= buscarSubIndiceNombre(A,buscarNombre);
      String os = "Familia " + A.get(0).getApellido() + "\n";      
      os+= A.get(n).getMiembroFamilia() + "\n";
      os+= "Sexo: " + A.get(n).getSexo();
      os+= "Nombre: " + A.get(n).getNombre() + " " + A.get(n).getApellido() + "\n";
      os+= "Edad: " + A.get(n).getEdad() + "\n";
      for(int i=0; i< A.size(); i++){
        if(i!=n){
          os+= A.get(i).getMiembroFamilia() + "\n";
          os+= "Sexo: " + A.get(i).getSexo() + "\n";
          os+= "Nombre: " + A.get(i).getNombre() + " " + A.get(i).getApellido() + "\n";
          os+= "Edad: " + A.get(i).getEdad() + "\n";    
        }
      }
      return os;  
           
    }
    
}
