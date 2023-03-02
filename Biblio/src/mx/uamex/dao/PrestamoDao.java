
package mx.uamex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.Prestamo;

/**
 *
 * @author jorge
 */
public class PrestamoDao {
      List<Prestamo> listPrestamo = new ArrayList <>();
    public void Agregar(  Prestamo prestamo) {
       listPrestamo.add(prestamo);

    }

    public void Eliminar( List lista, Prestamo prestamo) {
      listPrestamo.remove(prestamo);

    }

    public void Consultar(Prestamo prestamo) {

        for (int i = 0; i < listPrestamo.size(); i++) {
         
        }
        System.out.println("Nombre"+"\t\t"+"NumeroCuenta");
        System.out.println(prestamo.getFechainicio()+"\t\t\t"+prestamo.getFechaentrega());
    }

    public void Imprimir (ArrayList<Prestamo> lista){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
         
       

    }
    
}