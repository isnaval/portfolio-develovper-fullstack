package java_oop.basics.student_system_1;

public abstract class MiembroUPV extends Persona {

	private String carnet;

	public MiembroUPV(String nombre, int edad, String carnet) {
		super(nombre, edad);
		this.carnet = carnet;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public void menuIntranet() {
	}
}
