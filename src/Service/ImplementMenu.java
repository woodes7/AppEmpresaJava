package Service;

public class ImplementMenu implements InterfaceMenu {

	@Override
	public void MenuPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("Elige un opción de Menu");
		System.out.println("---------Menu--------------");
		System.out.println("1. Registrar empleado");
		System.out.println("2. Modificar empleado");		
		System.out.println("3. Exportar a fichero");
		System.out.println("0. Cerrar");
	}
	

	

}
