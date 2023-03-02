
package mx.uamex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.Profesor;

/**
 *
 * @author jorge
 */
public class ProfesorDao {
    List<Profesor> listProfesor = new ArrayList <>();

    public void Agregar( Profesor profesor) {
      listProfesor.add(profesor);

    }

    public void Eliminar( Profesor profesor) {
      listProfesor.remove(profesor);

    }

    public void Consultar(Profesor profesor) {

        for (int i = 0; i < listProfesor.size(); i++) {
         
        }
        System.out.println("Nombre"+"\t\t"+"NumeroCuenta");
        System.out.println(profesor.getNombre()+"\t\t\t"+profesor.getNumeroEmpleado());
    }

    public void Imprimir (ArrayList<Profesor> lista){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
         
       

    }
    
}
    

