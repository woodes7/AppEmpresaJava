package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidad.Empleado;

public class ImplementEmpleado implements InterfaceEmpleado {
	private InterfaceFile implFile = new ImplementFile();
	private int numeroActual = 10; // Inicializa el número de empleado

	@Override
	public void RegistarEmpleado(List<Empleado> listaEmpleado, String ruta) {
		try {
			Scanner entradaValor = new Scanner(System.in);
			System.out.println("Ingresa nuevo empleado");

			System.out.println("Escribe el dni del empleado: ");
			String Dni = entradaValor.next();

			// Verificar si el empleado ya existe
			for (Empleado empleado : listaEmpleado) {
				if (Dni.equals(empleado.getDni())) {
					System.out.println("No puedes ingresar un empleado que ya está registrado");
					return; // Salir del método si ya existe
				}
			}

			// Si el empleado no existe, continuar con la creación
			Empleado nuevoEmpleado = new Empleado();
			nuevoEmpleado.setDni(Dni);

			System.out.println("Escribe el nombre del empleado: ");
			String nombre = entradaValor.next();
			nuevoEmpleado.setNombre(nombre);

			System.out.println("Escribe el apellido del empleado: ");
			String apellidos = entradaValor.next();
			nuevoEmpleado.setApellidos(apellidos);

			System.out.println("Escribe la fecha de nacimiento (en formato dd/MM/yyyy): ");
			String fechaNacimiento = entradaValor.next();
			nuevoEmpleado.setFechaNacimiento(fechaNacimiento);

			System.out.println("Escribe la titulación más alta del empleado: ");
			String titulacion = entradaValor.next();
			nuevoEmpleado.setTitulaciónAlta(titulacion);

			System.out.println("Escribe el número de la seguridad social del empleado: ");
			String numSS = entradaValor.next();
			nuevoEmpleado.setNumeroSeguridadSocial(numSS);

			System.out.println("Escribe el número de la cuenta bancaria: ");
			String numCB = entradaValor.next();
			nuevoEmpleado.setNumeroCuenta(numCB);

			// Generar el número de empleado
			try {
				nuevoEmpleado.setNumEmpleado(numeroActual++);
				System.out.println("Número de empleado generado correctamente: " + nuevoEmpleado.getNumEmpleado());
			} catch (Exception e) {
				System.err.println("Error al generar el número de empleado: " + e.getMessage());
			}

			// Agregar el nuevo empleado a la lista
			listaEmpleado.add(nuevoEmpleado);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void ModificarEmpleado(List<Empleado> listaEmpleado, String ruta) {
		try {
			MostrarEmpleados(listaEmpleado);

			Scanner entradaValor = new Scanner(System.in);
			System.out.println("¿Qué empleado deseas modificar? Ingresa el número de empleado:");
			int nEmpleado = entradaValor.nextInt();
			boolean empleadoEncontrado = false;

			for (Empleado empleado : listaEmpleado) {
				if (empleado.getNumEmpleado() == nEmpleado) {
					empleadoEncontrado = true;
					OpcionesModificacion(empleado);

					break; // Sal del bucle una vez que se ha encontrado el empleado
				}
			}

			if (!empleadoEncontrado) {
				System.out.println("No se encontró ningún empleado con el número especificado: " + nEmpleado);
			}

		} catch (Exception e) {
			System.out.println("Se produjo un error: " + e.getMessage());
			e.printStackTrace();
		}
	}

	// Opciones de modificacion de menu
	public void OpcionesModificacion(Empleado empleado) {
		Scanner entradaValor = new Scanner(System.in);

		int opcion;
		boolean opcionValida = false;

		do {
			try {
				// Mostramos el menú
				MostraMenuModificacion();

				opcion = entradaValor.nextInt();
				entradaValor.nextLine(); // Consumir la nueva línea después de la entrada numérica

				switch (opcion) {
				case 1:
					System.out.println("Escribe el nuevo DNI del empleado: ");
					String nuevoDni = entradaValor.next();
					empleado.setDni(nuevoDni);
					break;
				case 2:
					System.out.println("Escribe el nuevo nombre del empleado: ");
					String nuevoNombre = entradaValor.next();
					empleado.setNombre(nuevoNombre);
					break;
				case 3:
					System.out.println("Escribe el nuevo apellido del empleado: ");
					String nuevosApellidos = entradaValor.next();
					empleado.setApellidos(nuevosApellidos);
					break;
				case 4:
					System.out.println("Escribe la nueva fecha de nacimiento (en formato dd/MM/yyyy): ");
					String nuevaFechaNacimiento = entradaValor.next();
					empleado.setFechaNacimiento(nuevaFechaNacimiento);
					break;
				case 5:
					System.out.println("Escribe la nueva titulación más alta del empleado: ");
					String nuevaTitulacion = entradaValor.next();
					empleado.setTitulaciónAlta(nuevaTitulacion);
					break;
				case 6:
					System.out.println("Escribe el nuevo número de la seguridad social del empleado: ");
					String nuevoNumSS = entradaValor.next();
					empleado.setNumeroSeguridadSocial(nuevoNumSS);
					break;
				case 7:
					System.out.println("Escribe el nuevo número de cuenta bancaria del empleado: ");
					String nuevoNumCB = entradaValor.next();
					empleado.setNumeroCuenta(nuevoNumCB);
					break;
				case 8:
					System.out.println("Saliendo del Menú de Modificación.");
					opcionValida = true;
					break;
				default:
					System.out.println("Opción inválida. Por favor, introduce un número válido.");
					break;
				}
			} catch (java.util.InputMismatchException e) {
				System.out.println("Error: Debes introducir un número válido.");
				entradaValor.nextLine(); // Limpiar la entrada incorrecta
			} catch (Exception e) {
				System.out.println("Se produjo un error: " + e.getMessage());
			}
		} while (!opcionValida);
	}

	// Muestra el menu de modificar empleado para que podamos elegir lo que queramos modificar
	public void MostraMenuModificacion() {
		// Mostramos el menú
		System.out.println("Menú de Modificación de Empleado:");
		System.out.println("1. Modificar DNI");
		System.out.println("2. Modificar Nombre");
		System.out.println("3. Modificar Apellidos");
		System.out.println("4. Modificar Fecha de Nacimiento");
		System.out.println("5. Modificar Titulación más Alta");
		System.out.println("6. Modificar Número de Seguridad Social");
		System.out.println("7. Modificar Número de Cuenta Bancaria");
		System.out.println("8. Salir");
	}

	@Override
	public void ExportarFichero(List<Empleado> listaEmpleado, String ruta) {
		
		MostrarEmpleados(listaEmpleado);
		System.out.println("Dime el número de empleado que quieres exportar");
		Scanner entradaValor = new Scanner(System.in);
		int nEmpleado = entradaValor.nextInt();
		try {
			if (!listaEmpleado.isEmpty()) {
				for (int i = 0; i < listaEmpleado.size(); i++) {
					Empleado empleado = listaEmpleado.get(i);

					// Verifica si el número de empleado coincide
					if (empleado.getNumEmpleado() == nEmpleado) {
						// Llama al método para escribir este empleado en el archivo
						implFile.EscribirFichero(empleado, ruta); 	
						System.out.println("Empleado exportado correctamente al archivo " + ruta);
						return; // Termina el bucle ya que hemos encontrado el empleado
					}
				}				
				System.out.println("No se encontró ningún empleado con el número especificado: " + nEmpleado);
			} else {
				System.out.println("La lista de empleados está vacía.");
			}
		} catch (Exception e) {
			System.out.println("Error al exportar el empleado: " + e.getMessage());
			e.printStackTrace();
		}
	}

//Muestra lista de los empleados mediante ToString
	public void MostrarEmpleados(List<Empleado> listaEmpleado) {
		try {
			if (!listaEmpleado.isEmpty()) {

				for (int i = 0; i < listaEmpleado.size(); i++) {
					System.out.println(listaEmpleado.get(i).toString());
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
