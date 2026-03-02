
//Importamos los modelos
import models.mantenimientoderecursos;
import models.participantes;
import models.patrocinio;
import models.proyectos;
import models.recursos;
import models.registro;

// importamos el array
import java.util.ArrayList;
//salida de datos, consola o ventana emergente, en este caso usaremos una ventana emergente.
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Creamos un ArrayList para cada modelo
        // esto es como un invenatario para cada modelo, donde guardaremos los objetos
        // creados de cada clase
        ArrayList<proyectos> proyectosList = new ArrayList<>();
        ArrayList<participantes> participantesList = new ArrayList<>();
        ArrayList<recursos> recursosList = new ArrayList<>();
        ArrayList<patrocinio> patrocinioList = new ArrayList<>();
        ArrayList<mantenimientoderecursos> mantenimientoList = new ArrayList<>();
        ArrayList<registro> registroList = new ArrayList<>();

        // CREACION DE VARIABLES PARA PROYECTOS
        /*
         * creamos variables temporales para cada atributo de cada modelo.
         * cuando hagamos el " new Xmodelo" le pasaremos los datos temporales a cada
         * cosntructor de cada clase
         * y despues agregaremos el objeto creado a su inventario propio, osea a los
         * ArrayList.
         */

        // registro

        String Id_delregistro = " ";
        String nombre_delregistro;
        String telefono_delregistro = " ";
        String correo_delregistro;
        String contraseña_delregistro = " ";

        // mantenimiento de recursos
        String Id_mantenimientoderecursos = " ";
        String nombre_mantenimientoderecursos;
        String categoria_mantenimientoderecursos;
        String estado_mantenimientoderecursos;
        String ubicacion_mantenimientoderecursos;
        String fechadeingreso_mantenimientoderecursos = " ";

        // parcipantes
        String Id_delosparticipantes = " ";
        String nombre_delosparticipantes;
        String ubicacion_delosparticipantes;
        String correo_delosparticipantes;
        String rol_delosparticipante;

        // patrocinio
        String Id_delpatrocinador = " ";
        String nombre_delpatrocinador;
        String contacto_delpatrocinador = " ";
        String tipo_depatrocinador;
        String aporte_delpatrocinador = " ";

        // proyectos
        String Id_delproyecto = " ";
        String nombre_delproyecto;
        String tipo_delproyecto;
        String descripcion_delproyecto;
        String fechaInicio_delproyecto = " ";
        String fechaFin_delproyecto = " ";
        String estado_delproyecto;

        // recursos
        String Id_delrecurso = " ";
        String nombre_delrecurso;
        String categoria_delrecurso;
        String estado_delrecurso;
        String ubicacion_delrecurso;

        // MENUS
        /*
         * usamos opciones para el menu principal, y opcion1, opcion2, opcion3, opcion4,
         * opcion5, opcion6 para los submenus de cada modelo.
         */
        int opciones = 0, opcion1 = 0, opcion2 = 0, opcion3 = 0, opcion4 = 0, opcion5 = 0, opcion6 = 0;

        // MENU PRINCIPAL
        do {
            opciones = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO AL SOFTWARE INSTITUCIONAL ACADEMICO \n"
                    + "1. iniciar sesion \n"
                    + "2. registrarse \n"
                    + "3. salir"));
            switch (opciones) {
                case 1:

                    // SUBMENU DE INICIO DE SESION, para que el usuario quiera o no iniciar sesion
                    do {
                        opcion1 = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO INICIO DE SESION \n"
                                + "Elija una de las siguientes opciones: \n"
                                + "1. iniciar sesion \n"
                                + "2. salir..."));
                        switch (opcion1) {
                            case 1:
                                // creamos una variable booleana para saber si se encontro el ID y la contraseña
                                // ingresados
                                boolean encontrado = false;
                                // pedimos datos
                                Id_delregistro = JOptionPane.showInputDialog("Ingrese su ID:");
                                contraseña_delregistro = JOptionPane.showInputDialog("Ingrese su contraseña:");

                                // for each para comparar los datos ingresados con los datos guardados en el
                                // ArrayList de registro
                                for (registro comprobar : registroList) {
                                    // comparamos el ID y la contraseña
                                    if (comprobar.getPersonaladiministrativoId().equals(Id_delregistro)
                                            && comprobar.getContraseña_personaladiministrativo().equals(
                                                    contraseña_delregistro)) {
                                        encontrado = true;
                                        break;
                                    }
                                } // si se encontro el ID y la contraseña, deja pasar al usuario
                                if (encontrado) {
                                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");

                                    // MENU DE TODAS LAS CLASES
                                    do {
                                        opcion2 = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL \n"
                                                + "1. Proyectos \n"
                                                + "2. Participantes \n"
                                                + "3. Recursos \n"
                                                + "4. Patrocinio \n"
                                                + "5. Mantenimiento de recursos \n"
                                                + "6. Cerrar sesión"));
                                        switch (opcion2) {
                                            case 1:
                                                // aqui iria el submenu de proyectos
                                                break;
                                            case 2:
                                                // aqui iria el submenu de participantes
                                                break;
                                            case 3:
                                                // aqui iria el submenu de recursos
                                                break;
                                            case 4:
                                                // aqui iria el submenu de patrocinio
                                                break;
                                            case 5:
                                                // aqui iria el submenu de mantenimiento de recursos
                                                break;
                                            case 6:
                                                JOptionPane.showMessageDialog(null, "Cerrando sesión...");
                                                break;
                                            default:
                                                JOptionPane.showMessageDialog(null,
                                                        "ERROR, solo pueden numero del 1 al 6");
                                                break;
                                        }
                                    } while (opcion2 != 6);
                                } else {
                                    JOptionPane.showMessageDialog(null, "ID o contraseña incorrectos"); // si no, error
                                }
                                break;
                            case 2:
                                // si no quiere iniciar sesion, lo devuelve al menu principal
                                JOptionPane.showMessageDialog(null, "Devuelta al menu principal");
                                break;
                            // se ingresa un numero diferente a 1 o 2, error
                            default:
                                JOptionPane.showMessageDialog(null, "ERROR, solo pueden numero del 1 al 2");
                                break;

                        }
                    } while (opcion1 != 2);
                    break;

                // resgistro de usuario,
                case 2:
                    // pedimos datos
                    nombre_delregistro = JOptionPane.showInputDialog("Ingrese su nombre:");
                    telefono_delregistro = JOptionPane.showInputDialog("Ingrese su telefono:");
                    correo_delregistro = JOptionPane.showInputDialog("Ingrese su correo:");
                    Id_delregistro = JOptionPane.showInputDialog("Ingrese su ID:");
                    contraseña_delregistro = JOptionPane.showInputDialog("Ingrese su contraseña:");
                    // los pasamos al constructor de la clase registro, y lo agregamos a su
                    // inventario, osea al ArrayList de registro
                    registroList.add(new registro(Id_delregistro, contraseña_delregistro, nombre_delregistro,
                            telefono_delregistro, correo_delregistro));
                    JOptionPane.showMessageDialog(null, "registrado exitosamente");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el software");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERROR, solo pueden numero del 1 al 3");
                    break;
            }
        } while (opciones != 3);

    }

}