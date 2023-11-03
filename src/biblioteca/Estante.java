
package biblioteca;

import java.util.ArrayList;

public class Estante {
    
    private int numeroEstante;
    private String nombreEstante;
    private ArrayList<Libro> libros = new ArrayList();
   
    public Estante(int numeroEstante, String nombreEstante) {
        this.nombreEstante = nombreEstante;
        this.numeroEstante = numeroEstante;
    }
    
    public void agregarLibro(Libro libro){
        
        libros.add(libro);
               
    }

    public String getNombreEstante() {
        return nombreEstante;
    }

    public void setNombreEstante(String nombreEstante) {
        this.nombreEstante = nombreEstante;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    public void agregarLibroEnEstante(Libro libro){
        
        libros.add(libro);
    }
    
    public Libro buscarLibro(String isbn){
        
        System.out.println("Ejecutanto buscalibro");
        
        Libro libroAux= null;
        
        for(int i = 0; i < libros.size(); i++){
               
            if(libros.get(i).getIsbn().equals(isbn)){
                
               libros.get(i).setPrestado(true);
               
               libroAux = libros.get(i);
               
                System.out.println("Cambio de estado");  
            }            
        }
        return libroAux;
    }

    @Override
    public String toString() {
        
        return "Estante{" + "nombreEstante=" + nombreEstante + ", libros=" + libros + '}';
        
    }

}
