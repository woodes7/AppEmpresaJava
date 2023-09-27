package Entidad;

import java.util.Date;

public class Empleado {
	//Attributes
	private String Dni;
	private String nombre;		
	private String apellidos;
	private String fechaNacimiento;	
	private String titulaciónAlta;
	private String numeroSeguridadSocial;
	private String numeroCuenta;
	private int numEmpleado;;

	
	//Builder
		public Empleado(String dni, String nombre, String apellidos, String fechaNacimiento, String titulaciónAlta,
				String numeroSeguridadSocial, String numeroCuenta, int numEmpleado) {
			super();
			Dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.fechaNacimiento = fechaNacimiento;
			this.titulaciónAlta = titulaciónAlta;
			this.numeroSeguridadSocial = numeroSeguridadSocial;
			this.numeroCuenta = numeroCuenta;
			this.numEmpleado = numEmpleado;
		
		}
		public Empleado() {
			// TODO Auto-generated constructor stub
		}
		
//Getters & Setters	
	
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getTitulaciónAlta() {
		return titulaciónAlta;
	}
	public void setTitulaciónAlta(String titulaciónAlta) {
		this.titulaciónAlta = titulaciónAlta;
	}
	public String getNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}
	public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public int getNumEmpleado() {
		return numEmpleado;
	}
	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	
	@Override
	public String toString() {
	    return "Empleado [\n" +
	           "Dni=" + Dni + "\n" +
	           "nombre=" + nombre + "\n" +
	           "apellidos=" + apellidos + "\n" +
	           "fechaNacimiento=" + fechaNacimiento + "\n" +
	           "titulaciónAlta=" + titulaciónAlta + "\n" +
	           "numeroSeguridadSocial=" + numeroSeguridadSocial + "\n" +
	           "numeroCuenta=" + numeroCuenta + "\n" +
	           "numEmpleado=" + numEmpleado + "\n" +
	           "]";
	}
	
	
}
