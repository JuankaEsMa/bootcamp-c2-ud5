package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Radio del circulo: ");
		String stringRadio = sc.next();
		double radio = Double.parseDouble(stringRadio);
		double resultado = Math.PI * Math.pow(radio, 2);
		System.out.println("El area del circulo indicado es = " + resultado);

	}

}
