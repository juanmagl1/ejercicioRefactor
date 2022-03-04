package com.test.refactoring.Business;
/**
 * 
 * @author juanma
 * @version 1.0
 * Con esta clase lo que hacemos es los métodos que están en común los extraemos en una
 * interfaz y en las clases de los vehiculos los implementamos
 */

public interface FuncionCoche {
/**
 * En este métdodo se nos pasa por paramétro la velocidad del vehiculo, y 
 * progresivamente se aumentará la velocidad hasta llegar a la velocidad establecida en el método
 * @param velocidad
 */
	void acelerar(Integer velocidad);
/**
 * En el método detener el vehículo se irá deteniendo progresivamente hasta pararse del
 * todo
 */
	void detener();

}