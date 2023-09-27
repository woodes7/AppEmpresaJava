package Service;

import java.util.List;

import Entidad.Empleado;

/**
 * 
 * @author PabloRG
 * 
 * Interfaz que define los metodos que dan servicio a la gestión de empleados
 */
public interface InterfaceEmpleado {

	/**
	 * Registra a los empleados
	 */
	public void RegistarEmpleado (List<Empleado> listaEmpleado,String ruta);
	/**
	 * Modificar empleados
	 * @param listaEmpleado
	 * @param ruta
	 */
	public void ModificarEmpleado (List<Empleado> listaEmpleado, String ruta);
	/**
	 * 
	 * @param listaEmpleado
	 * @param ruta
	 */
		
	public void ExportarFichero(List<Empleado> listaEmpleado, String ruta);
}
