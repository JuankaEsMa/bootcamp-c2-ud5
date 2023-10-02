package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("El numero " + num + " es divisible entre 2");
		}else {
			System.out.println("El numero " + num + " no es divisible entre 2");
		}
	}

}
