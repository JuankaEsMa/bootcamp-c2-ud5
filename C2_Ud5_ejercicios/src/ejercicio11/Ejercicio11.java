package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba un día de la semana: ");
		String dia = sc.next().toLowerCase();
		
		switch(dia) {
		case "lunes":
			System.out.println(dia + " es un día laboral");
			break;
		case "martes":
			System.out.println(dia + " es un día laboral");
			break;
		case "miercoles":
			System.out.println(dia + " es un día laboral");
			break;
		case "jueves":
			System.out.println(dia + " es un día laboral");
			break;
		case "viernes":
			System.out.println(dia + " es un día laboral");
			break;
		case "sabado":
			System.out.println(dia + " no es un día laboral");
			break;
		case "domingo":
			System.out.println(dia + " no es un día laboral");
			break;
		default:
			System.out.println(dia + " no es un un día de la semana");
		}
	}

}
