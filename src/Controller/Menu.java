package Controller;

import java.io.File;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Entidad.Empleado;
import Service.ImplementEmpleado;
import Service.ImplementFile;
import Service.ImplementMenu;
import Service.InterfaceEmpleado;
import Service.InterfaceFile;
import Service.InterfaceMenu;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceEmpleado empleado = new ImplementEmpleado();
		InterfaceMenu implMenu = new ImplementMenu();
		InterfaceFile implFile = new ImplementFile();

		// Creamos variables que vamos a usar
		int opcion;
		boolean opcionValida = false;
		Scanner entradaOpcion = new Scanner(System.in);
		String archivoRuta= "bin/BasedeDatosPacientes.txt";
		// Lista de Paciente
		List<Empleado> listaEmpleado = new ArrayList<>();
		
		
	
				int y = 0;
				//Menu donde elgimos la opcion  y mandara mensaje segum lo que suceda
				do {
					try {
						// Mostramos el menú
						implMenu.MenuPrincipal();

						opcion = Integer.parseInt(entradaOpcion.nextLine());
						System.out.println("[INFO] - Has seleccionado la opcion " + opcion);

						switch (opcion) {

						case 1:
							 empleado.RegistarEmpleado(listaEmpleado, archivoRuta);
							break;
						case 2:
							 empleado.ModificarEmpleado(listaEmpleado, archivoRuta);

							break;
						case 3:
							 empleado.ExportarFichero(listaEmpleado, archivoRuta);

							break;
						case 4:
							System.out.println("Slaiendo del Progrma. Adios...");
							opcionValida = true;
						default:
							break;
						}
						//si la opcio no es valida mandara el mensaje
					} catch (NumberFormatException e) {
						System.out.println("Error: Opción inválida. Por favor, introduce un número válido.");
					} catch (InputMismatchException e) {
						//mandara mensaje segun que suceda
						
					} catch (Exception e) {
						System.out.println("Se produjo un error" + e.getMessage());
					}
					//salimos del Menu
				} while (!opcionValida);
				//nos aseguramos de cerrar  entradaOpciones 
				entradaOpcion.close();
			}
	
}
