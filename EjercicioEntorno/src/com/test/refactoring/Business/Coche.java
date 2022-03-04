package com.test.refactoring.Business;

public class Coche extends Vehiculo implements FuncionCoche {
	/**
	 * La clase coche que hereda de la clase vehiculo y tenemos implementada
	 * la interfaz con los métodos acelerar y frenar y el atributo numero de plazas
	 */
	private Integer numPlazas;
	/**
	 * Creamos los constructores uno a vacío y otro con los parametros del padre más el atributo número de plazas
	 * que tenemos como parámetros
	 */

	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coche(String matricula, String color, String combustible, String nombreConductor, String dniConductor,
			Integer numPlazas) {
		super(matricula, color, combustible, nombreConductor, dniConductor);
		this.numPlazas = numPlazas;
	}
/**
 * Metodos para consultar el número de plazas o para mofidicar el número de las plazas del coche
 * @return el numero de las plazas del coche
 */
	public Integer getNumPlazas() {
		return numPlazas;
	}
/**
 * Este método lo que hace es cambiar el número de plazas del coche 
 * @param numPlazas el número de las plazas que va a tener el coche
 */
	public void setNumPlazas(Integer numPlazas) {
		this.numPlazas = numPlazas;
	}
/**
 * Los métodos para acelerar y frenar el coche progresivamente 
 */
	public void acelerar(Integer velocidad) {
		if (velocidad > 0 && velocidad < 120) {
			System.out.println("El coche está acelerando y llegará la velocidad de " + velocidad.intValue() + " km/h");
		} else {
			System.out.println("La velocidad indicada no está permitida en un coche según la DGT");
		}
	}

	public void detener() {
		System.out.println("El coche se detendrá en breve, asegúrese de buscar un lugar adecuado para estacionar");
	}

	@Override
	public String toString() {
		return super.toString() + ", numPlazas=" + numPlazas;
	}

}
