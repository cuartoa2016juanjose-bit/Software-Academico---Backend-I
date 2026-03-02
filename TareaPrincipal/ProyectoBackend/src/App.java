
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

        do {
            opciones = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO AL SOFTWARE INSTITUCIONAL ACADEMICO \n"
                    + "1. iniciar sesion \n"
                    + "2. registrarse \n"
                    + "3. salir"));
            switch (opciones) {
                case 1:
                    do {
                        opcion1 = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO INICIO DE SESION \n"
                                + "Elija una de las siguientes opciones: \n"
                                + "1. iniciar sesion \n"
                                + "2. salir..."));
                        switch (opcion1) {
                            case 1:
                                boolean encontrado = false;
                                Id_delregistro = JOptionPane.showInputDialog("Ingrese su ID:");
                                contraseña_delregistro = JOptionPane.showInputDialog("Ingrese su contraseña:");
                                for (registro comprobar : registroList) {
                                    if (comprobar.getPersonaladiministrativoId().equals(Id_delregistro)
                                            && comprobar.getContraseña_personaladiministrativo().equals(
                                                    contraseña_delregistro)) {
                                        encontrado = true;
                                        break;
                                    }
                                }
                                if (encontrado) {
                                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
                                } else {
                                    JOptionPane.showMessageDialog(null, "ID o contraseña incorrectos");
                                }
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Gracias por usar el software");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "ERROR, solo pueden numero del 1 al 2");
                                break;

                        }
                    } while (opcion1 != 2);
                    break;
                case 2:
                    nombre_delregistro = JOptionPane.showInputDialog("Ingrese su nombre:");
                    telefono_delregistro = JOptionPane.showInputDialog("Ingrese su telefono:");
                    correo_delregistro = JOptionPane.showInputDialog("Ingrese su correo:");
                    Id_delregistro = JOptionPane.showInputDialog("Ingrese su ID:");
                    contraseña_delregistro = JOptionPane.showInputDialog("Ingrese su contraseña:");
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