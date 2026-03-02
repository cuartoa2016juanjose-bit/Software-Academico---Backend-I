
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

    }

}