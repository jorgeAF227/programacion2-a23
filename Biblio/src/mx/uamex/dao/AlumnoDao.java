
package mx.uamex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.Alumno;

/**
 *
 * @author jorge
 */
public class AlumnoDao {
     
    

    public void Agregar(List lista, Alumno alumno) {
        lista.add(alumno);

    }

    public void Eliminar(List lista, Alumno alumno) {
        lista.remove(alumno);
    }

    public void Consultar( List lista, Alumno alumno) {
        
        System.out.println("Nombre"+"\t\t"+"NumeroCuenta");
        for (int i = 0; i < lista.size(); i++) {
            
            alumno = (Alumno)lista.get(i);
            System.out.println(alumno.getNombre()+"\t\t\t"+alumno.getNumeroCuenta());
        }
     
    }

    public void clean(List lista, Alumno alumno) {
        lista.clear();
    }

    public void Imprimir (ArrayList<Alumno> lista){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
         
       

    }
    
}
