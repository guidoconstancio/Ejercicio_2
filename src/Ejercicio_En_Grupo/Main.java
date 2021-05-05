package Ejercicio_En_Grupo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final int EMPLEADOS = 10;

		Scanner scan = new Scanner(System.in);

		int cantEmpleadosSector1 = 0, cantCasosSector1 = 0;
		int cantEmpleadosSector2 = 0, cantCasosSector2 = 0;
		int cantEmpleadosSector3 = 0, cantCasosSector3 = 0;
		int cantCasosGral = 0;

		for (int i = 1; i <= EMPLEADOS; i++) {
			System.out.println("\nIngrese sector:");
			int sector = scan.nextInt();
			scan.nextLine();

			System.out.println("Ingrese la temperatura:");
			double temperatura = (int) (Math.random() * (40 - 35) + 35);
			System.out.println("La temperatura es de: " + temperatura);

			switch (sector) {
			case 1:
				cantEmpleadosSector1++;
				if (temperatura > 37.5) {
					System.out.println("Este sector debe aislarse");
					cantCasosSector1++;
					cantCasosGral++;
				}
				break;
			case 2:
				cantEmpleadosSector2++;
				if (temperatura > 37.5) {
					System.out.println("Este sector debe aislarse");
					cantCasosSector2++;
					cantCasosGral++;
				}
				break;
			case 3:
				cantEmpleadosSector3++;
				if (temperatura > 37.5) {
					System.out.println("Este sector debe aislarse");
					cantCasosSector3++;
					cantCasosGral++;
				}
				break;
			default:
				System.out.println("Valores válidos: 1, 2 y 3");
				break;
			}

		}

		System.out.println("Sector 1\nCantidad de empleados: " + cantEmpleadosSector1 + "\nCantidad de casos: "
				+ cantCasosSector1 + "\nPorcentaje de casos sospechosos: "
				+ ((cantCasosSector1 / cantEmpleadosSector1) * 100) + "%");

		System.out.println("\nSector 2\nCantidad de empleados: " + cantEmpleadosSector2 + "\nCantidad de casos: "
				+ cantCasosSector2 + "\nPorcentaje de casos sospechosos: "
				+ ((cantCasosSector2 / cantEmpleadosSector2) * 100) + "%");

		System.out.println("\nSector 3\nCantidad de empleados: " + cantEmpleadosSector3 + "\nCantidad de casos: "
				+ cantCasosSector3 + "\nPorcentaje de casos sospechosos: "
				+ ((cantCasosSector3 / cantEmpleadosSector3) * 100) + "%");

		System.out.println("\nCantidad de casos generales: " + cantCasosGral);

	}

}
