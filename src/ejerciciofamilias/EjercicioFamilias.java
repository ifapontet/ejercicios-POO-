/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofamilias;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public class EjercicioFamilias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      java.util.Scanner lectura= new java.util.Scanner(System.in);
      int numFamilias;
      int numIntegrantes;
      String miembroFamPersona;
      String nomPersona;
      int edadPersona;
      String sexoPersona; 
      System.out.println("Bienvenido al registro de familias");
      System.out.println();
      System.out.print("Ingrese el numero de familias que va a registrar: ");
      numFamilias= lectura.nextInt();
      ArrayList<Familia> familias= new ArrayList<Familia>();
      System.out.println();
      System.out.print("Ingrese el numero de integrantes que va a registrar: ");
      numIntegrantes= lectura.nextInt();      
      for(int h=0; h<numFamilias; h++){
        ArrayList<Persona> integrantes= new ArrayList<Persona>();
        String apellido;
        System.out.println("Datos de la familia " );
        System.out.println();
        System.out.print("Ingrese el apellido de la familia: ");
        apellido = lectura.next();
          for(int i=0; i<numIntegrantes; i++){
            System.out.println();
            System.out.print("Ingrese el rol de el miembro " + (i+1) + " de la familia : ");
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
            integrantes.add(persona);
           }
        Familia familia= new Familia(integrantes , apellido);
        familias.add(familia);
      }
      HashMap<String, ArrayList<Persona>> buscarApellido= new HashMap<String, ArrayList<Persona>>();  
      for(int i=0; i<familias.size(); i++){
        buscarApellido.put(familias.get(i).getApellido(), familias.get(i).getIntegrantes());
      }
      HashMap<String, Persona> nombreClave = new HashMap<String, Persona>();
      for(int j=0;j<familias.size();j++){
        int n= familias.get(0).getIntegrantes().size();
          for(int k=0;k<n;k++){
            nombreClave.put(familias.get(j).getIntegrantes().get(k).getNombre(), familias.get(j).getIntegrantes().get(k));
          }
      }
      System.out.println();
      int menu;
      do{System.out.println("Digite 1 para buscar una familia por apellido, 2 para buscar a una persona por nombre y 0 para salir");
      menu= lectura.nextInt();
      if(menu==1){   
        String apellidoBuscar;
        ArrayList<Persona> familiaEncontrada;
        ArrayList<Persona> bandera= null;
        do{System.out.println();
        System.out.println("Ingrese el apellido de la familia que quiere buscar: ");
        apellidoBuscar= lectura.next();
        familiaEncontrada=  buscarApellido.get(apellidoBuscar);
        bandera= familiaEncontrada;
        if(bandera == null){
          System.out.println("Apellido " + apellidoBuscar + " no encontrado" );
          System.out.println();
        }
        }while(bandera==null);
          String imprimir= RegistroFamilias.imprimirFamilia(familiaEncontrada);
          System.out.println(imprimir);
          System.out.println();    
        }
      if(menu==2){
        Persona bandera= null;
        Persona nombreEncontrado;
        String nombreBuscar;
        do{System.out.println("Ingrese el Nombre de la persona que quiere buscar: ");
        nombreBuscar = lectura.next();
        nombreEncontrado= nombreClave.get(nombreBuscar);
        bandera= nombreEncontrado;
        if(bandera == null){
          System.out.println("Nombre " + nombreBuscar + " no encontrado" );
          System.out.println();
        }
        }while(bandera==null);  
        ArrayList<Persona> familiaEncontradaNombre= buscarApellido.get(nombreEncontrado.getApellido()); 
        System.out.println(RegistroFamilias.buscarSubIndiceNombre(familiaEncontradaNombre, nombreBuscar));
        String imprimir2= RegistroFamilias.imprimirFamiliaNombreEncontrado(familiaEncontradaNombre, nombreBuscar);
        System.out.println(imprimir2);
        System.out.println();
      }
     }while(menu!=0);  
    }
    
}
