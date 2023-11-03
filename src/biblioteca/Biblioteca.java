
package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    
    private static ArrayList<Estante> estantes = new ArrayList ();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("1. Agregar libro: ");
            System.out.println("2. Prestar Libro: ");
            System.out.println("3. Mostrar estante más solicitado: ");
            System.out.println("4. Salir");
            
            opcion = sc.nextInt();
            
        switch(opcion){
            
         case 1:
             System.out.println("inserte ISBN");
             String dato1 = sc.next();
                     
                        
             System.out.println("inserte Nombre");
             String dato2 = sc.next();
             
             Libro libro = new Libro (dato1, dato2, false);
             
             int numEstante = 0;
           
             String nombreEstante="";
             
             if(estantes.isEmpty()){
                 numEstante = 0; 
                 System.out.println("Ingreso nombre de estante: ");
                 nombreEstante = sc.next();
             }else{
                 for(int i=0; i<estantes.size(); i++){
                     System.out.println(i + " -> " + estantes.get(i).getNombreEstante());
                 }
                 
                 System.out.println("seleccione numero de estante: ");     
                 numEstante = sc.nextInt();
                 
                 if(numEstante >= estantes.size()){
                      System.out.println("Ingrese nombre del estante: ");   
                      sc.nextLine();
                      nombreEstante = sc.nextLine();
                 }

             }
              agregarLibro(numEstante,nombreEstante,libro);
              
             break;
             
             
         case 2:            
             
             System.out.println("Ingrese ISBN del libro:");
             
             sc.nextLine();
             
             String isbn = sc.nextLine();
             System.out.println("isbn = " + isbn);
            
            for (int i = 0 ; i < estantes.size(); i++){
                System.out.println(estantes.get(i));
                
                if(estantes.get(i).buscarLibro(isbn)!= null){
                    
                    System.out.println("Se ha encontrado el libro");
                    
                }else{
                    
                    System.out.println("no se ha encontrado el Libro");
                    
                }
                
            }
           
             break;
             
         case 3:
             
             break;
             
         case 4:
             
             System.exit(0);
             break;    
         
         default:
             System.out.println("No disponibel");
             break;                     
        }     
    }while(opcion !=4);   
}// cierre Main
    
    public static void agregarLibro(int numeroEstante, String nombreEstante, Libro libro){
        
        if(numeroEstante < estantes.size()){
            
            estantes.get(numeroEstante).agregarLibroEnEstante(libro);
            
        }else{
            Estante estante1 = new Estante (numeroEstante,nombreEstante);
            estante1.agregarLibroEnEstante(libro);
            estantes.add(estante1);
        }
        System.out.println(estantes);
        for(int i=0; i<estantes.size(); i++){
            System.out.println(estantes.get(i));
            
        }        
        
    }
    public static void prestarLibro(){
        
    }
    public static void mostrarEstante(){
        
    }
    
}