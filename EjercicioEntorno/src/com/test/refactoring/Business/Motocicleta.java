package com.test.refactoring.Business;

/**
 * La clase motocicleta que hereda de la clase vehiculo y tenemos implementada
 * la interfaz con los métodos acelerar y frenar y el atributo de tipo carnet
 */
public class Motocicleta extends Vehiculo implements FuncionCoche {

	private Integer cilindrada;

	/**
	 * Creamos los constructores uno a vacío y otro con los parametros del padre más
	 * el atributo que tenemos como parámetros
	 */
	public Motocicleta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motocicleta(String matricula, String color, String combustible, String nombreConductor, String dniConductor,
			Integer cilindrada) {
		super(matricula, color, combustible, nombreConductor, dniConductor);
		this.cilindrada = cilindrada;
	}
/**
 * Metodos para obtener y modificar las cilindradas de la motocicleta 
 * @return
 */
	public Integer getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}

	/**
	 * Son metodos abstractos que nos permiten acelerar y frenar el camión
	 * progresivamente
	 */
	@Override
	public void acelerar(Integer velocidad) {
		// TO DO
	}

	@Override
	public void detener() {
		// TO DO
	}

	@Override
	public String toString() {
		return super.toString() + ", cilindrada=" + cilindrada;
	}

}
