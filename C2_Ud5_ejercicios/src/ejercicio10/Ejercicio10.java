package ejercicio10;

import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantas ventas quieres registrar?");
		int ventas = sc.nextInt();
		for(int i = 1; i <= ventas; i++) {
			System.out.println("Venta " + i + ":");
			suma = suma + sc.nextInt();
		}
		System.out.println("Total de ventas: " + suma);
	}

}
