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
public class RegistroFamilias {
    private Familia[] familias;

    public RegistroFamilias(Familia[] familias) {
      this.familias=familias;
    }
    
    public static String imprimirFamilia(Persona[] familiares){ 
      String os = "Familia " + familiares[0].getApellido() + "\n";
      for(int i=0; i< familiares.length; i++){
        os+= familiares[i].getMiembroFamilia() + "\n";
        os+= "Sexo: " + familiares[i].getSexo() + "\n";
        os+= "Nombre: " + familiares[i].getNombre() + " " + familiares[i].getApellido() + "\n";
        os+= "Edad: " + familiares[i].getEdad() + "\n";
      }
      return os;
    }
    
    public static int buscarSubIndiceNombre(Persona[] A, String buscarNombre){
      for(int i=0; i<A.length; i++){
        if(A[i].getNombre().equals(buscarNombre)){
          return i;  
        }    
      }
      return -1;  
    }
    
    public static String imprimirFamiliaNombreEncontrado(Persona[] A, String buscarNombre){
      int n= buscarSubIndiceNombre(A,buscarNombre);
      String os = "Familia " + A[0].getApellido() + "\n";
      os+= A[n].getMiembroFamilia() + "\n";
      os+= "Sexo: " + A[n].getSexo() + "\n";
      os+= "Nombre: " + A[n].getNombre() + " " + A[n].getApellido() + "\n";
      os+= "Edad: " + A[n].getEdad() + "\n";
      for(int i=0; i< A.length; i++){
        if(i!=n){
          os+= A[i].getMiembroFamilia() + "\n";
          os+= "Sexo: " + A[i].getSexo() + "\n";
          os+= "Nombre: " + A[i].getNombre() + " " + A[i].getApellido() + "\n";
          os+= "Edad: " + A[i].getEdad() + "\n";    
        } 
      }
      return os;
 
    }
    
}
