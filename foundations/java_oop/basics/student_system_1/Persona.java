package java_oop.basics.student_system_1;

public class Persona {

	protected String nombre;
	private int edad;

	public Persona(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [name=" + nombre + ", edad=" + edad + "]";
	}

}
