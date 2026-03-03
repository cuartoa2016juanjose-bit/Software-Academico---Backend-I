
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
		String ubicacion_participante = " ";
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
		int opciones = 0, opcion1 = 0, opcion2 = 0, opcionrecursos = 0, opcionproyectos = 0,
				opcionParticipantes = 0,
				opcionpatrocinio = 0, opcionmantenimiento = 0;

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
								boolean encontrado = false;
								// pedimos datos
								Id_delregistro = JOptionPane
										.showInputDialog("Ingrese su ID:");
								contraseña_delregistro = JOptionPane.showInputDialog(
										"Ingrese su contraseña:");
								// for each para comparar los datos ingresados con los guardados en el array
								for (registro comprobar : registroList) {
									// comparamos el ID y la contraseña
									if (comprobar.getPersonaladiministrativoId().equals(Id_delregistro)
											&& comprobar.getContraseña_personaladiministrativo().equals(contraseña_delregistro)) {
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
											// MENU DE PROYECTOS
											// JHON STIVEN
											case 1:
												// menu de proyectos
												break;
											// MENU DE PARTICPANTES
											// JOHAN GONZALES
											case 2:
												// sub menu de participantes
												do {
													opcionParticipantes = Integer.parseInt(JOptionPane.showInputDialog("PARTICIPANTES \n"
															+ "1. Registrar participante \n"
															+ "2. lista de todos los participantes \n"
															+ "3. Buscar participante por ID \n"
															+ "4. Actualizar participante \n"
															+ "5. Eliminar participante \n"
															+ "6. volver al menu principal"));
													switch (opcionParticipantes) {
														case 1:
															Id_delosparticipantes = JOptionPane.showInputDialog("Ingrese el ID del participante:");
															boolean existeparticipante = false; // apagado
															for (participantes comprobarIDparticipante : participantesList) {
																if (comprobarIDparticipante.getParticipanteId().equals(Id_delosparticipantes)) {
																	existeparticipante = true;
																	break;
																}
															}
															if (existeparticipante) {
																JOptionPane.showMessageDialog(
																		null,
																		"ese ID ya existe");
															} else {
																nombre_delosparticipantes = JOptionPane
																		.showInputDialog("Ingrese el nombre del participante:");
																ubicacion_participante = JOptionPane
																		.showInputDialog("Ingrese la ubicacion del participante:");
																correo_delosparticipantes = JOptionPane
																		.showInputDialog("Ingrese el correo del participante:");
																rol_delosparticipante = JOptionPane.showInputDialog("Ingrese el rol del participante:");

																participantesList
																		.add(new participantes(Id_delosparticipantes, nombre_delosparticipantes,
																				ubicacion_participante, correo_delosparticipantes, rol_delosparticipante));
																JOptionPane.showMessageDialog(null, "Participante registrado exitosamente");
															}
															break;
														case 2:
															if (participantesList.isEmpty()) {
																JOptionPane.showMessageDialog(null, "No hay participantes registrados");
															} else {
																String hojadepapeldos = "";
																for (participantes mostrarlistaparticipante : participantesList) {
																	hojadepapeldos += "------ \n"
																			+ "ID: " + mostrarlistaparticipante.getParticipanteId() + "\n"
																			+ "nombre: " + mostrarlistaparticipante.getNombre_participante() + "\n"
																			+ "ubicacion: " + mostrarlistaparticipante.getUbicacion_participante() + "\n"
																			+ "correo: " + mostrarlistaparticipante.getCorreo_participante() + "\n"
																			+ "rol: " + mostrarlistaparticipante.getRol_participante();
																}
																JOptionPane.showMessageDialog(null, "LISTA DE PARTICIPANTES \n" + hojadepapeldos);
															}
															break;
														case 3:
															Id_delosparticipantes = JOptionPane
																	.showInputDialog("Ingrese el ID del participante que desea buscar");
															boolean participanteencontrado = false;
															for (participantes buscarparti : participantesList) {
																if (buscarparti.getParticipanteId().equals(Id_delosparticipantes)) {
																	String hojadepapeltres;
																	hojadepapeltres = "PARTICIPANTE \n"
																			+ "ID: " + buscarparti.getParticipanteId() + "\n"
																			+ "nombre: " + buscarparti.getNombre_participante() + "\n"
																			+ "ubicacion: " + buscarparti.getUbicacion_participante() + "\n"
																			+ "correo: " + buscarparti.getCorreo_participante() + "\n"
																			+ "rol: " + buscarparti.getRol_participante();
																	// Mostramos participante
																	JOptionPane.showMessageDialog(null, hojadepapeltres);
																	participanteencontrado = true;
																	break;
																}
															}
															if (!participanteencontrado) {
																JOptionPane.showMessageDialog(null, "Este ID no existe");
															}
															break;
														case 4:
															Id_delosparticipantes = JOptionPane
																	.showInputDialog("Ingrese el ID del participante que desea actualizar");
															boolean seencontro = false;
															for (participantes actualizarparticipante : participantesList) {
																if (actualizarparticipante.getParticipanteId().equals(Id_delosparticipantes)) {
																	seencontro = true;
																	nombre_delosparticipantes = JOptionPane
																			.showInputDialog("Ingrese el nuevo nombre del participante");
																	ubicacion_participante = JOptionPane
																			.showInputDialog("Ingrese la nueva ubicacion del participante");
																	correo_delosparticipantes = JOptionPane
																			.showInputDialog("Ingrese el nuevo correo del participante");
																	rol_delosparticipante = JOptionPane
																			.showInputDialog("Ingrese el nuevo rol del participante");

																	actualizarparticipante.setNombre_participante(nombre_delosparticipantes);
																	actualizarparticipante.setUbicacion_participante(ubicacion_participante);
																	actualizarparticipante.setCorreo_participante(correo_delosparticipantes);
																	actualizarparticipante.setRol_participante(rol_delosparticipante);
																	JOptionPane.showMessageDialog(null, "Actualizacion hecha");
																	break;
																}
															}
															if (!seencontro) {
																JOptionPane.showMessageDialog(null, "Este ID no existe pri");
															}
															break;
														case 5:
															Id_delosparticipantes = JOptionPane
																	.showInputDialog("Ingrese el ID del participante que desea eliminar:");
															boolean sepuedeeliminar = false;
															for (int i = 0; i < participantesList.size(); i++) {
																if (participantesList.get(i).getParticipanteId().equals(Id_delosparticipantes)) {
																	participantesList.remove(i);
																	sepuedeeliminar = true;
																	JOptionPane.showMessageDialog(null, "Participante eliminado exitosamente");
																	break;
																}
															}
															if (!sepuedeeliminar) {
																JOptionPane.showMessageDialog(null, "ID no encontrado");
															}
															break;
														case 6:
															JOptionPane.showMessageDialog(null, "Devuelta al menu principal");
															break;
													}
												} while (opcionParticipantes != 6);
												break;

											// MENU DE RECURSOS
											// DAVE PAEZ
											case 3:
												// aqui iria el submenu
												// de recursos
												do {
													opcionrecursos = Integer.parseInt(JOptionPane.showInputDialog("RECURSOS \n"
															+ "1. Ver todos los recursos \n"
															+ "2. Registrar algun recurso  \n"
															+ "3. Actualizar recurso \n"
															+ "4. Eliminar recurso \n"
															+ "5. volver al menu principal"));
													switch (opcionrecursos) {
														case 1:
															if (recursosList.isEmpty()) {
																JOptionPane.showMessageDialog(null, "No hay recursos registrados");
															} else {
																String hojadepapel = " ";
																for (recursos mostrarlista : recursosList) {
																	hojadepapel += "------"
																			+ "ID: " + mostrarlista.getRecursoId() + "\n"
																			+ "nombre: " + mostrarlista.getNombre_delrecurso() + "\n"
																			+ "categoria: " + mostrarlista.getCategoria_delrecurso() + "\n"
																			+ "estado: " + mostrarlista.getEstado_delrecurso() + "\n"
																			+ "ubicacion:" + mostrarlista.getUbicacion_delrecurso();
																}
																JOptionPane.showMessageDialog(null, "LISTA DE RECURSOS \n" + hojadepapel);
															}
															break;
														case 2:
															Id_delrecurso = JOptionPane.showInputDialog("Ingrese el ID del recurso:");
															boolean IDyaexiste = false; // apagado
															for (recursos comprobarIDrecurso : recursosList) {
																if (comprobarIDrecurso.getRecursoId().equals(Id_delrecurso)) {
																	IDyaexiste = true;
																	break;
																}
															}
															if (IDyaexiste) {
																JOptionPane.showMessageDialog(null, "ese ID ya existe");
															} else {
																nombre_delrecurso = JOptionPane.showInputDialog("Ingrese el nombre del recurso:");
																categoria_delrecurso = JOptionPane.showInputDialog("Ingrese la categoria del recurso:");
																estado_delrecurso = JOptionPane.showInputDialog("Ingrese el estado del recurso:");
																ubicacion_delrecurso = JOptionPane.showInputDialog("Ingrese la ubicacion del recurso:");
																recursosList.add(new recursos(Id_delrecurso, nombre_delrecurso, categoria_delrecurso,
																		estado_delrecurso, ubicacion_delrecurso));
																JOptionPane.showMessageDialog(null, "Recurso registrado exitosamente");
															}
															break;
														case 3:
															Id_delrecurso = JOptionPane
																	.showInputDialog("Ingrese el ID del recurso que desea actualizar:");
															boolean IDencontrado = false; // apagado
															for (recursos actualizar : recursosList) {
																if (actualizar.getRecursoId().equals(Id_delrecurso)) {
																	IDencontrado = true;
																	nombre_delrecurso = JOptionPane
																			.showInputDialog("Ingrese el nuevo nombre del recurso:");
																	categoria_delrecurso = JOptionPane
																			.showInputDialog("Ingrese la nueva categoria del recurso:");
																	estado_delrecurso = JOptionPane
																			.showInputDialog("Ingrese el nuevo estado del recurso:");
																	ubicacion_delrecurso = JOptionPane
																			.showInputDialog("Ingrese la nueva ubicacion del recurso:");
																	actualizar.setNombre_delrecurso(nombre_delrecurso);
																	actualizar.setCategoria_delrecurso(categoria_delrecurso);
																	actualizar.setEstado_delrecurso(estado_delrecurso);
																	actualizar.setUbicacion_delrecurso(ubicacion_delrecurso);
																	JOptionPane.showMessageDialog(null, "Recurso actualizado exitosamente");
																	break;
																}
															}
															if (!IDencontrado) {
																JOptionPane.showMessageDialog(null, "ID no encontrado");
															}
															break;
														case 4:
															Id_delrecurso = JOptionPane
																	.showInputDialog("Ingrese el ID del recurso que desea eliminar:");
															boolean iddelrecursoencontrado = false;
															for (int i = 0; i < recursosList.size(); i++) {
																if (recursosList.get(i).getRecursoId().equals(Id_delrecurso)) {
																	recursosList.remove(i);
																	iddelrecursoencontrado = true;
																	JOptionPane.showMessageDialog(null, "Recurso eliminado exitosamente");
																	break;
																}
															}
															if (!iddelrecursoencontrado) {
																JOptionPane.showMessageDialog(null, "ID no encontrado");
															}
															break;
														case 5:
															JOptionPane.showMessageDialog(null, "Devuelta al menu principal");
															break;
														default:
															JOptionPane.showMessageDialog(null, "ERROR, solo pueden numero del 1 al 5");
															break;
													}
												} while (opcionrecursos != 5);
												break;
											// MENU DE PATROCINIO
											// JUAN DUARTE
											case 4:
												// Menu de patrocinio
												break;
											// MENU DE MANTENIMIENTO DE
											// RECURSOS
											// SAMUEL GONZALES
											case 5:
												// Menu de mantenimiento
												break;
											case 6:
												JOptionPane.showMessageDialog(null, "Cerrando sesión...");
												break;
											default:
												JOptionPane.showMessageDialog(null, "ERROR, solo pueden numero del 1 al 6");
												break;
										}
									} while (opcion2 != 6);
								} else {
									JOptionPane.showMessageDialog(null, "ID o contraseña incorrectos");
								}
								break;
							case 2:
								// si no quiere iniciar sesion, lo devuelve al menu principal
								JOptionPane.showMessageDialog(null,
										"Devuelta al menu principal");
								break;
							// se ingresa un numero diferente a 1 o 2, error
							default:
								JOptionPane.showMessageDialog(null,
										"ERROR, solo pueden numero del 1 al 2");
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
					registroList.add(new registro(Id_delregistro, contraseña_delregistro,
							nombre_delregistro,
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