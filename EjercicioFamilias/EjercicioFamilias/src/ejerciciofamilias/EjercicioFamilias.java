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
import java.util.*;
public class EjercicioFamilias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      java.util.Scanner lectura= new java.util.Scanner(System.in);
      int numFamilias;
      System.out.println("Bienvenido al registro de familias");
      System.out.println();
      System.out.print("Ingrese el numero de familias que va a registrar (Maximo 5): ");
      numFamilias= lectura.nextInt();
      Familia[] familias= new Familia[numFamilias];
      System.out.println();
      for(int h=0; h<numFamilias; h++){
        Persona[] integrantes= new Persona[4];
        String apellido;
        System.out.println("Datos de la familia " );
        System.out.println();
        System.out.print("Ingrese el apellido de la familia: ");
        apellido = lectura.next();
          for(int i=0; i<4; i++){
            String miembroFamPersona;
            String nomPersona;
            int edadPersona;
            String sexoPersona; 
            System.out.println();
            System.out.print("Ingrese el rol que cumple el miembro " + (i+1) + " de la familia : ");
            miembroFamPersona= lectura.next();
            System.out.println();
            System.out.print("Ingrese el sexo: ");
            sexoPersona= lectura.next(); 
            System.out.print("Ingrese el nombre: ");
            nomPersona = lectura.next();
            System.out.print("Ingrese la edad: ");
            edadPersona = lectura.nextInt();
            System.out.println();
            Persona persona= new Persona(nomPersona, apellido, edadPersona, sexoPersona, miembroFamPersona);
            integrantes[i]=persona;
           }
        Familia familia= new Familia(integrantes , apellido);
        familias[h]= familia;
      }
      HashMap<String, Persona[]> buscarApellido= new HashMap<String, Persona[]>();  
      for(int i=0; i<familias.length; i++){
        buscarApellido.put(familias[i].getApellido(), familias[i].getIntegrantes());
      }
      HashMap<String, Persona> nombreClave = new HashMap<String, Persona>();
      for(int j=0;j<familias.length;j++){
        int n= familias[0].getIntegrantes().length;
          for(int k=0;k<n;k++){
            nombreClave.put(familias[j].getIntegrantes()[k].getNombre(), familias[j].getIntegrantes()[k]);
          }
      }
      System.out.println();
      int menu;
      do{System.out.println("Digite 1 para buscar una familia por apellido, 2 para buscar a una persona por nombre y 0 para salir");
      menu= lectura.nextInt();
      if(menu==1){
        Persona[] bandera= null;
        String apellidoBuscar;
        Persona[] familiaEncontrada;
        do{System.out.println("Ingrese el apellido de la familia que quiere buscar: ");
        apellidoBuscar= lectura.next();
        familiaEncontrada=  buscarApellido.get(apellidoBuscar);
        bandera=familiaEncontrada;
        if(bandera==null){
          System.out.println("Apellido " + apellidoBuscar + " no fue encontrado" );
          System.out.println();
        }
        }while(bandera==null);
        String imprimir= RegistroFamilias.imprimirFamilia(familiaEncontrada);
        System.out.println(imprimir);
        System.out.println();
      }
      if(menu==2){        
        Persona bandera= null;
        String nombreBuscar;
        Persona nombreEncontrado;
        do{System.out.println("Ingrese el Nombre de la persona que quiere buscar: ");
        nombreBuscar = lectura.next();
        nombreEncontrado= nombreClave.get(nombreBuscar);
        bandera=nombreEncontrado;
        if(bandera==null){
          System.out.println("Nombre " + nombreBuscar + " no encontrado" );
          System.out.println();
        }
        }while(bandera==null);
        Persona[] familiaEncontradaNombre= buscarApellido.get(nombreEncontrado.getApellido());
        String imprimir2= RegistroFamilias.imprimirFamiliaNombreEncontrado(familiaEncontradaNombre, nombreBuscar);
        System.out.println(imprimir2);    
      }
      }while(menu!=0);    

    }
    
}
