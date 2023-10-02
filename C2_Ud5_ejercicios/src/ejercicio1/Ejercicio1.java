package ejercicio1;

import java.util.Scanner; 

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Num1: ");
		int num1 = sc.nextInt();
		System.out.println("Num2: ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1 + " Es mayor que " + num2);
		}else if(num1 < num2) {
			System.out.println(num1 + " Es menor que " + num2);
		}else {
			System.out.println(num1 + " Es igual que " + num2);
		}
		
		sc.close();
	}

}
