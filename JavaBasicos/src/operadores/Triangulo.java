package operadores;

import java.util.Scanner;


public class Triangulo {
	public static void main(String[] args) {
	
	System.out.println("intoduce angulo 1");
	Scanner scanner = new Scanner(System.in);
	
	int angulo1 = scanner.nextInt();
	
	System.out.println("intoduce angulo 2");
	int angulo2 = scanner.nextInt();
	
	System.out.println("intoduce angulo 3");
	int angulo3 = scanner.nextInt();
	
	int triangulo = angulo1 + angulo2 +angulo3;
	
	if(triangulo == 180 ) {
		System.out.println("tienes un triangulo");
	}else {
		System.out.println("no es un triangulo");
	}

}
}