package Ejercicio_En_Grupo;

import java.util.Scanner;

public class Ejercicio_grupal_completadoV2 {

	public static void main(String[] args) {
		// DECLARACION DE VARIABLES
		Scanner scan = new Scanner(System.in);
		final int EMPLEADOS = 50;
		int sector;
		int cantCasosGral = 0;
		int cantEmpleadosSector, cantEmpleados = 0, cantCasosSector;

		for (int i = 1; i <= 3; i++) {
			System.out.println("\nIngrese sector a evaluar:");
			sector = scan.nextInt();
			scan.nextLine();
			if (i == 3) {
				cantEmpleadosSector = EMPLEADOS - cantEmpleados;
			} else {
				cantEmpleadosSector = (int) (Math.random() * (20)) + 1;
				cantEmpleados += cantEmpleadosSector;
			}

			cantCasosSector = 0;

			for (int j = 1; j <= cantEmpleadosSector; j++) {
				System.out.println("Ingrese la temperatura:");
				double temperatura = (int) (Math.random() * (40 - 35) + 35);
				System.out.println("La temperatura es de: " + temperatura);

				if (temperatura > 37.5) {
					cantCasosSector++;
				}
			}
			cantCasosGral += cantCasosSector;

			double porcentajeSector = ((cantCasosSector * 100) / cantEmpleadosSector);

			System.out.println(
					"\nSector: " + sector + "\nCantidad de empleados: " + cantEmpleadosSector + "\nCantidad de casos: "
							+ cantCasosSector + "\nPorcentaje de casos sospechosos: " + porcentajeSector + "%");

			if (cantCasosSector > 0) {
				System.out.println("\nEl sector " + sector + " debe aislarse");
			}

		}
		System.out.println("\nCantidad de casos generales: " + cantCasosGral);

		double porcentajeFabrica = ((cantCasosGral * 100) / EMPLEADOS);
		System.out.println("\nEl porcentaje de casos sopechosos en la f�brica es de: " + porcentajeFabrica + "%");

	}

}
