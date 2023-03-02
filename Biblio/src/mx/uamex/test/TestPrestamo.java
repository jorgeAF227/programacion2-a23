package mx.uamex.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.uamex.dao.AlumnoDao;
import mx.uamex.dao.LibroDao;
import mx.uamex.dao.PrestamoDao;
import mx.uamex.dao.ProfesorDao;
import mx.uamex.dto.Alumno;
import mx.uamex.dto.Libro;
import mx.uamex.dto.Prestamo;
import mx.uamex.dto.Profesor;

/**
 *
 * @author jorge
 */
public class TestPrestamo {
    //variables esaticas por su alcanze

    static Libro libro;
    static Alumno alumno;
    static Profesor profesor;
    static Prestamo prestamo;
    static boolean salir = false;
    static int idAlumno = 0;
    static Scanner leer = new Scanner(System.in);
    static LibroDao metodosL = new LibroDao();
    static AlumnoDao metodosA = new AlumnoDao();
    static ProfesorDao metodosP = new ProfesorDao();
    static PrestamoDao metodosPr = new PrestamoDao();
    static List<Alumno> lista = new ArrayList<>();
    static List<Libro> listLibro = new ArrayList<>();
    static List<Profesor> listProfesor = new ArrayList<>();
    static int opc;

    public static void main(String[] args) {

        do { //bucle para regresar al menu

            //menu 
            System.out.println("----------------------------------------");
            System.out.println("            Menu                        ");
            System.out.println("----------------------------------------");
            System.out.println("Que desea hacer");
            System.out.println("1.- registro");
            System.out.println("2.- consultar alumno");
            //System.out.println("3.- eliminar alumno");
            //System.out.println("4.- salir");
            //System.out.println("Elija una opcion");
            opc = leer.nextInt();

            switch (opc) {
                case 1 -> {
                    System.out.println("----------------------------------------");
                    System.out.println("            Menu                        ");
                    System.out.println("----------------------------------------");
                    System.out.println("Que desea registra");
                    System.out.println("1.- Libro");
                    System.out.println("2.- Alumno");
                    System.out.println("3.- Profesor");
                    //System.out.println("4.- prestamo");
                    System.out.println("Elija una opcion");
                    opc = leer.nextInt();
                    menu2(opc);

                }
                case 2 -> {
                    metodosA.Consultar(lista, alumno);
                }
                case 3 -> {
                    
                }
                case 4 -> {
                    salir = true;
                }

            }
        } while (!salir);
        metodosA.Imprimir((ArrayList<Alumno>) lista);
        metodosL.Imprimir((ArrayList<Libro>) listLibro);
        System.out.println("FIN");
    }

    //metodo swicth de ingresos de datos
    public static void menu2(int opc) {
        boolean Bandera = true;
        switch (opc) {
            case 1 -> {
                while (Bandera) {

                    libro = new Libro();
                    System.out.println("Ingrese el titulo del libro");
                    libro.setNombre(leer.next());
                    System.out.println("Ingrese el isbn");
                    libro.setIsbn(leer.nextInt());
                    System.out.println("Ingrese la editorial");
                    libro.setEditorial(leer.next());
                    System.out.println("Ingres la categoria");
                    libro.setCategoria(leer.next());
                    System.out.println("Ingrese el stock ");
                    libro.setStock(leer.nextInt());
                    metodosL.Agregar(listLibro, libro);

                    System.out.println("\nDesea ingresar otro libro? \n\n1.- para si \n0.- volver al principal menu");
                    opc = leer.nextInt();
                    // condicion para el bucle de bandera
                    if (opc != 1) {
                        Bandera = (false);

                    }
                }
            }

            case 2 -> {
                while (Bandera) {
                    alumno = new Alumno();
                    System.out.println("Ingrese el numero de cuenta");
                    alumno.setNumeroCuenta(leer.nextInt());
                    System.out.println("Ingrese el nombre");
                    alumno.setNombre(leer.next());
                    System.out.println("Ingrese el apellido paterno");
                    alumno.setApellidoPaterno(leer.next());
                    System.out.println("Ingres el apellido materno");
                    alumno.setApellidoMaterno(leer.next());
                    System.out.println("Ingrese el genero");
                    alumno.setGenero(leer.next());
                    alumno.setId(idAlumno);
                    idAlumno = idAlumno + 1;

                    metodosA.Agregar(lista, alumno);

                    System.out.println("\nDesea ingresar otro alumno? \n\n1.- para si \n0.- volver al principal menu");
                    opc = leer.nextInt();
                    // condicion para el bucle de bandera
                    if (opc != 1) {
                        Bandera = (false);

                    }
                }
            }

            case 3 -> {
                while (Bandera) {
                    profesor = new Profesor();
                    System.out.println("Ingrese el numero de empleado");
                    profesor.setNumeroEmpleado(leer.nextInt());
                    System.out.println("Ingrese el nombre");
                    profesor.setNombre(leer.next());
                    System.out.println("Ingrese el apellido paterno");
                    profesor.setApellidoPaterno(leer.next());
                    System.out.println("Ingres el apellido materno");
                    profesor.setApellidoMaterno(leer.next());
                    System.out.println("Ingrese el genero");
                    profesor.setGenero(leer.next());
                    metodosP.Agregar(profesor);
                    System.out.println("\nDesea ingresar otro Profesor? \n\n1.- para si \n0.- volver al principal menu");
                    opc = leer.nextInt();
                    // condicion para el bucle de bandera
                    if (opc != 1) {
                        Bandera = (false);

                    }
                }

            }
            case 4 -> {
                prestamo = new Prestamo();
                System.out.println("Ingrese el folio");
                prestamo.setFolio(leer.nextInt());

            }

        }
    }
}
