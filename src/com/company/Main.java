package com.company;

import java.util.Scanner;

import clases.CapacidadEndedudamiento;
import constants.Constantes;

public class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String read2;
		int ingMesuales;
		int gastosFijos;
		int gastosVariables;
		CapacidadEndedudamiento datos = new CapacidadEndedudamiento();

		System.out.println(Constantes.ING_MENSUAL.getLista());
		read2 = read.next().toString();
		read2 = Validacion(read2, read);

		if (isNumeric(read2)) {
			ingMesuales = Integer.parseInt(read2);
			datos.setIngresosTotales(ingMesuales);
		}

		System.out.println(Constantes.ING_FIJO.getLista());
		read2 = read.next().toString();
		if (isNumeric(read2)) {
			gastosFijos = Integer.parseInt(read2);
			datos.setGastosFijos(gastosFijos);
		}

		read2 = Validacion(read2, read);
		if (isNumeric(read2)) {
			gastosFijos = Integer.parseInt(read2);
			datos.setGastosFijos(gastosFijos);
		}

		System.out.println(Constantes.ING_VARIABLE.getLista());
		read2 = read.next().toString();
		if (isNumeric(read2)) {
			gastosVariables = Integer.parseInt(read2);
			datos.setGastoVaribales(gastosVariables);
		}

		read2 = Validacion(read2, read);
		if (isNumeric(read2)) {
			gastosVariables = Integer.parseInt(read2);
			datos.setGastoVaribales(gastosVariables);
		}

		System.out.println(datos.Calcular());
		read.close();
	}

	public static boolean isNumeric(String value) {

		try {
			double valor = Double.parseDouble(value);
			if (valor > 0) {
				return true;
			}
		} catch (Exception e) {
			e.getMessage();
		}

		return false;

	}

	// Este método se utiliza para realizar la validación de que se ingrese siempre
	// un valor numérico de lo contrario siempre va a pedir nuevamente el valor o
	// salir del ciclo con la palabra Exit
	public static String Validacion(String valor, Scanner read) {
		String read2 = valor;
		while (!isNumeric(read2)) {
			System.out.println(Constantes.MENSAJE.getLista());
			read2 = read.next().toString();
			if (read2.equals("Exit")) {
				System.exit(0);
				break;
			}
		}
		return read2;
	}
}
