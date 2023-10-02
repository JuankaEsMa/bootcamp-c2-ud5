package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contraseña = "contra";
		boolean isCorrect = false;
		Scanner sc = new Scanner(System.in);
		int intentos = 1;
		while(intentos <= 3 && !isCorrect) {
			System.out.println("Intento " + intentos);
			if(sc.next().equals(contraseña)) {
				isCorrect = true;
			}else {
				intentos ++;
			}
		}
		
		if(isCorrect) {
			System.out.println("Enhorabuena");
		}else {
			System.out.println("Has sobrepasado el limite de intentos");
		}
	}

}
