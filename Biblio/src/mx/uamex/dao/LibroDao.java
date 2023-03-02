package mx.uamex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.Libro;

/**
 *
 * @author jorge
 */
public class LibroDao {
     
   

    public void Agregar(List listLibro, Libro libro) {
        
      listLibro.add(libro);
      

    }

    public void Eliminar( List listLibro, Libro libro) {
      listLibro.remove(libro);

    }

    public void Consultar(List listLibro, Libro libro) {

       for (int i = 0; i < listLibro.size(); i++) {
         
        }
        System.out.println("Nombre"+"\t\t"+"NumeroCuenta");
        System.out.println(libro.getNombre());
    }

    public void Imprimir (ArrayList<Libro> listLibro){
       for (int i = 0; i < listLibro.size(); i++) {
           System.out.println(listLibro.get(i).toString());
       
        } 
         
       

    }
    
}