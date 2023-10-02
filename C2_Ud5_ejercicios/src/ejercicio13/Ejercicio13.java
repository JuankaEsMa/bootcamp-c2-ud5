package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		double resultado = 0;
		boolean isCorrect = true;
		String signo;
		
		System.out.println("Num1: ");
		num1 = sc.nextInt();
		System.out.println("Num2: ");
		num2 = sc.nextInt();
		System.out.println("Signo: ");
		signo = sc.next();
		
		switch(signo) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;
		case "^":
			resultado = Math.pow(num1, num2);
			break;
		case "%":
			resultado = num1 % num2;
			break;
		default:
			isCorrect = false;
		}
		if(isCorrect) {
			System.out.println(resultado);
		}else {
			System.out.println("Signo incorrecto");
		}
	}

}
