package Service;

import java.util.List;

import Entidad.Empleado;

/**
 * 
 * @author PabloRG
 *
 */
public interface InterfaceFile {
	/**	
	 *  Escribe en un fichero log.txt
	 * @param ruta	 * 
	 */
	public void EscribirFichero(Empleado empleado,String ruta);
}
