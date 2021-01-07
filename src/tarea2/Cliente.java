package tarea2;


/* Creacion de la clase cliente con los parámetros que se pide */
public class Cliente {
	
	private String dni;
	private String nombre;
	private String direccion;
	
	
	public Cliente() {
		
		dni = "";
		nombre = "";
		direccion = "";
		
	}
	
	public Cliente (String d, String n, String di) {
		
		this.dni = d;
		this.nombre = n;
		this.direccion = di;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	
	
	

}
