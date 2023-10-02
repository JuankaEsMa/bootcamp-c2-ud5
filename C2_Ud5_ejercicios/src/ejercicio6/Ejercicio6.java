package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double IVA = 0.21;
		Scanner sc = new Scanner(System.in);
		System.out.println("Precio del producto: ");
		double precioProducto;
		if(sc.hasNextDouble()) {
			precioProducto = sc.nextDouble();
		}else {
			String producto = sc.next();
			precioProducto = Double.parseDouble(producto);
		}
		double ivaProducto = precioProducto * IVA;
		double resultado = ivaProducto + precioProducto;
		
		
		System.out.println(resultado);
		sc.close();
	}

}
