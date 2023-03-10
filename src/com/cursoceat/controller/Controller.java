package com.cursoceat.controller;

import java.util.Scanner;

import com.cursoceat.model.DiasSemana;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiasSemana d = null;
		Scanner input = new Scanner(System.in);
		int opcion;
		
		System.out.print("Indique el dia de la semana [1]Lunes...[7]Domingo: ");
		opcion = input.nextInt();
		switch (opcion) {
		case 1 -> d = DiasSemana.LUNES;
		case 2 -> d = DiasSemana.MARTES;
		case 3 -> d = DiasSemana.MIÉRCOLES;
		case 4 -> d = DiasSemana.JUEVES;
		case 5 -> d = DiasSemana.VIERNES;
		case 6 -> d = DiasSemana.SÁBADO;
		case 7 -> d = DiasSemana.DOMINGO;
		default -> System.out.println("Entrada no válida");
		}
		/****************************Métodos que se pueden usar on un Enum****************************/
		System.out.println("Método .name() -> " + d.name());
		System.out.println("Método .toString() -> " + d.toString());
		System.out.println("Método .ordinal() -> " + d.ordinal());
		System.out.println("Método .value() + foreach -> ");
		for (DiasSemana dM : DiasSemana.values()) {
			System.out.print(dM + " ");
		}
		System.out.println();

		// Vamos a declarar otro día
		System.out.print("Indique otro dia de la semana [1]Lunes...[7]Domingo: ");
		opcion = input.nextInt();
		// Si tenemos muchas opciones o nuestro Enum es muy extenso...
		DiasSemana otroDia = DiasSemana.values()[opcion - 1];
		System.out.println("El otro día es: " + otroDia.name());
		
		// Lunes.....Domingo compareTo
		System.out.println("Método .compareTo() -> " + d.compareTo(otroDia));
		if (d.compareTo(otroDia) > 0)
			System.out.println("El " + d.toString() + " va después del " + otroDia.toString());
		else 
			System.out.println("El " + otroDia.toString() + " va después del " + d.toString());
		
		if (d.equals(DiasSemana.VIERNES))
			System.out.println("¡Por fin es viernes!");
		if (otroDia.equals(DiasSemana.LUNES))
			System.out.println("¡Comenzamos la semana, a por ellos, que son pocos y cobardes...!");
		
		
		
		input.close();
	}

}
