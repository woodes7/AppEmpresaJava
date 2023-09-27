package Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import Entidad.Empleado;

public class ImplementFile implements InterfaceFile {

	@Override
	public void EscribirFichero(Empleado empleado,String ruta) {
		// TODO Auto-generated method stub
		
		 try {
	            FileWriter writer = new FileWriter(ruta);
	            // Aquí defines cómo deseas formatear y escribir los datos del empleado en el archivo
	            String empleadoString = empleado.getDni() + ", " + empleado.getNombre() + ", " + empleado.getApellidos() + ", " + empleado.getFechaNacimiento() + ", " + empleado.getTitulaciónAlta() + ".";
	            writer.write(empleadoString + "\n");

	            writer.close();
	            System.out.println("Datos del empleado exportados exitosamente al archivo " + ruta);
	        } catch (IOException e) {
	            System.err.println("Error al exportar los datos del empleado: " + e.getMessage());
	        }
	}
}

