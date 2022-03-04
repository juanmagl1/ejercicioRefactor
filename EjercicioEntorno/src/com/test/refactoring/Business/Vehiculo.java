package com.test.refactoring.Business;

/**
 * @version 1.0
 * @author juanma Creamos la clase vehiculo con los siguientes atributos
 */

public class Vehiculo {
	protected String matricula;
	protected String color;
	protected String combustible;
	protected String nombreConductor;
	protected String dniConductor;

	/**
	 * Creamos los constructores, uno a vacío
	 */
	public Vehiculo() {
		super();
	}

	/**
	 * Este constructor tiene como parametros los atributos que tiene la clase
	 * 
	 * @param matricula       le pasamos la matricula que va a tener el vehiculo
	 * @param color           el color que será nuestro vehiculo
	 * @param combustible     el tipo de combustible que tendrá nuestro vehiculo
	 * @param nombreConductor una cadena con el nombre
	 * @param dniConductor    una cadena con el dni del dueño del vehiculo
	 */
	public Vehiculo(String matricula, String color, String combustible, String nombreConductor, String dniConductor) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.combustible = combustible;
		this.nombreConductor = nombreConductor;
		this.dniConductor = dniConductor;
	}

	/**
	 * 
	 * @return Este método devuelve el nombre del conductor
	 */

	public String getNombreConductor() {
		return nombreConductor;
	}

	/**
	 * Con este método le pasamos por parámetro el nombre del conductor y se le
	 * modifica el nombre antiguo por el que le hemos pasado por parametro
	 * 
	 * @param nombreConductor
	 */
	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	/*
	 * Con este método nos muestra el dni del conductor
	 */
	public String getDniConductor() {
		return dniConductor;
	}

	/**
	 * Con este método le pasamos por parámetro el dni del conductor y se le
	 * modifica el dni que teniamos por el que le hemos pasado por parametro no nos
	 * devuelve nada el método
	 * 
	 * @param dniConductor
	 */

	public void setDniConductor(String dniConductor) {
		this.dniConductor = dniConductor;
	}

	/*
	 * Con este método nos muestra la matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Con este método le pasamos por parámetro la matricula del vehiculo y se le
	 * modifica la matricula que tenía por el que le hemos pasado por parametro Él
	 * método no nos devuelve nada
	 * 
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/*
	 * Muestra el color
	 */
	public String getColor() {
		return color;
	}
/**
	 * Con este método le pasamos por parámetro el color del vehiculo y se le
	 * modifica el color que tenía por el que le hemos pasado por parametro
	 *  Él método no nos devuelve nada 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Muestra el combustible
	 * 
	 * @return el tipo de combustible que tiene
	 */
	public String getCombustible() {
		return combustible;
	}
/**
 * El metodo sirve para cambiarle el color al combustible pasandole un combustible por paramétro
 * @param combustible el tipo de combustible que le pasamos
 */
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
/**
 * Muestra la información del vehículo
 */
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible
				+ ", nombreConductor=" + nombreConductor + ", dniConductor=" + dniConductor + "]";
	}

}
