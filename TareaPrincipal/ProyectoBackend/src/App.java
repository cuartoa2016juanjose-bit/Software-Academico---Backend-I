
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


    }

}