package com.test.refactoring.Business;

public class Camion extends Vehiculo implements FuncionCoche {
/**
 * La clase camión que hereda de la clase vehiculo y tenemos implementada la interfaz 
 * con  los metdos acelerar y frenar y el atributo de tipo carnet
 */
	private String tipoCarnet;
/**
 * Creamos los constructores uno a vacío y otro con los parametros del padre más el atributo 
 * que tenemos como parámetros
 */
	public Camion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Camion(String matricula, String color, String combustible, String nombreConductor, String dniConductor,
			String tipoCarnet) {
		super(matricula, color, combustible, nombreConductor, dniConductor);
		this.tipoCarnet = tipoCarnet;
	}
/**
 * Aquí podemos mirar el tipo de carnet que tenemos
 * @return tipoCarnet
 */
	public String getTipoCarnet() {
		return tipoCarnet;
	}
/**
 * Con este metodo modificamos el tipo de carnet de la clase
 * @param tipoCarnet
 */
	public void setTipoCarnet(String tipoCarnet) {
		this.tipoCarnet = tipoCarnet;
	}
/**
 * Son metodos abstractos que nos permiten acelerar y frenar el camión 
 * progresivamente 
 */
	public void acelerar(Integer velocidad) {
		System.out.println("La aceleración del camión se realizará progresivamente para conservar sus neumáticos");

		// TO DO
		// Incluir lógica de movimiento
	}

	public void detener() {
		System.out
				.println("CUIDADO!! La detención de un vehículo de gran tamaño puede ocasionar accidentes de tráfico");
	}

	@Override
	public String toString() {
		return super.toString() + ", tipoCarnet=" + tipoCarnet;
	}

}
