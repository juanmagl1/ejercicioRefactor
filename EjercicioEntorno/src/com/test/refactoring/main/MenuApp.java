package com.test.refactoring.main;

import java.util.Random;
import java.util.Scanner;

import com.test.refactoring.Business.Camion;
import com.test.refactoring.Business.Coche;
import com.test.refactoring.utils.Utils;

public class MenuApp {

	public static void main(String[] args) {
		// cambio de nombre de sc a teclado para identificar mejor a esa variable
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();

		mostrarPresentacion();

		System.out.println("Introduce tu nombre: ");
		String nombre = teclado.nextLine();
		System.out.println("Introduce tu primer apellido: ");
		String primerApellido = teclado.nextLine();

		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*** BIENVENIDO/A " + nombre + " " + primerApellido);
		System.out.println("/*** " + Utils.fecha_actual());
		System.out.println("/*** " + Utils.hora_actual());
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");

		System.out.println("Introduce el n�mero de coches : ");
		int numCoches = teclado.nextInt();
		Coche[] listaCoches = new Coche[numCoches];
		for (int i = 0; i < numCoches; i++) {
			listaCoches[i] = new Coche();
			listaCoches[i].acelerar(random.nextInt(-10, 200));
		}

		System.out.println("Introduce el n�mero de camiones : ");
		int numCamiones = teclado.nextInt();
		Camion[] listaCamiones = new Camion[numCamiones];
		for (int i = 0; i < numCamiones; i++) {
			listaCamiones[i] = new Camion();
			listaCamiones[i].acelerar(random.nextInt(-10, 200));
		}

		detenerVehiculos(listaCoches);
		detenerVehiculos(listaCamiones);

		teclado.close();

	}

	private static void mostrarPresentacion() {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/***     VAMOS A REFACTORIZAR...HAY QUE ELIMINAR LOS MALOR OLORES YA!!       ***/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}

	private static void detenerVehiculos(Coche[] listaCoches) {
		for (int i = 0; i < listaCoches.length; i++) {
			listaCoches[i].detener();
		}
	}

	private static void detenerVehiculos(Camion[] listaCamiones) {
		for (int i = 0; i < listaCamiones.length; i++) {
			listaCamiones[i].detener();
		}
	}

}
