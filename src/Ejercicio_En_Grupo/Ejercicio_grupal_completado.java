package Ejercicio_En_Grupo;

import java.util.Scanner;

public class Ejercicio_grupal_completado {

	public static void main(String[] args) {
		final int EMPLEADOS = 10;

		Scanner scan = new Scanner(System.in);

		double cantEmpleadosSector1 = 0, cantCasosSector1 = 0;
		double cantEmpleadosSector2 = 0, cantCasosSector2 = 0;
		double cantEmpleadosSector3 = 0, cantCasosSector3 = 0;
		double cantCasosGral = 0;

		for (int i = 1; i <= EMPLEADOS; i++) {
			System.out.println("\nIngrese sector:");
			int sector = scan.nextInt();
			scan.nextLine();

			System.out.println("Ingrese la temperatura:");
			double temperatura = (int) (Math.random() * (40 - 35) + 35);
			System.out.println("La temperatura es de: " + temperatura);

			if (temperatura > 37.5) {

				switch (sector) {
				case 1:
					System.out.println("Este sector debe aislarse");
					cantCasosSector1++;
					break;
				case 2:
					System.out.println("Este sector debe aislarse");
					cantCasosSector2++;
					break;
				case 3:
					System.out.println("Este sector debe aislarse");
					cantCasosSector3++;
					break;
				default:
					System.out.println("Valores válidos: 1, 2 y 3");
					break;
				}
				cantCasosGral++;
			}

			if (sector == 1) {
				cantEmpleadosSector1++;
			} else if (sector == 2) {
				cantEmpleadosSector2++;
			} else if (sector == 3) {
				cantEmpleadosSector3++;
			}

		}

		double porcentajeSector1 = ((cantCasosSector1 * 100) / cantEmpleadosSector1);
		double porcentajeSector2 = ((cantCasosSector2 * 100) / cantEmpleadosSector2);
		double porcentajeSector3 = ((cantCasosSector3 * 100) / cantEmpleadosSector3);
		double porcentajeFabrica = ((cantCasosGral * 100) / EMPLEADOS);

		System.out.println("\nSector 1\nCantidad de empleados: " + cantEmpleadosSector1 + "\nCantidad de casos: "
				+ cantCasosSector1 + "\nPorcentaje de casos sospechosos: " + porcentajeSector1 + "%");

		System.out.println("\nSector 2\nCantidad de empleados: " + cantEmpleadosSector2 + "\nCantidad de casos: "
				+ cantCasosSector2 + "\nPorcentaje de casos sospechosos: " + porcentajeSector2 + "%");

		System.out.println("\nSector 3\nCantidad de empleados: " + cantEmpleadosSector3 + "\nCantidad de casos: "
				+ cantCasosSector3 + "\nPorcentaje de casos sospechosos: " + porcentajeSector3 + "%");

		System.out.println("\nCantidad de casos generales: " + cantCasosGral);

		System.out.println("\nEl porcentaje de casos sopechosos en la fábrica es de: " + porcentajeFabrica + "%");

	}
}
