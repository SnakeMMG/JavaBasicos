package operadores;

import java.util.Scanner;

public class Operadores {
	public static void main (String[] args) {
         //operadores Aritmeticos
		//+, -, *, %
		int a = 10;
		int b = 20;
		double c = 10.0;
		
		
		int suma = a + b;
		System.out.println(suma);
		
		String str1 = "el resultado de la suma es:";
		System.out.println(str1 + suma);
		
		//resta
		System.out.println("el resultado de la resta es: " + (a - b));
		
		//divicion
		int divicion = a / b;
		System.out.println("el resultado de la divicion es: " + divicion);
		
		
		/*por lo menos uno de los datos deve ser de 
		tipo double para que nos represente los decimales correctamente*/ 
		//double divicion2 = (double) a / b;
		double divicion2 = c / b;
		//10.0/ 20 = 0.5
		
		System.out.println("el resultado de la divicion es: " + divicion2);
		
		//multiplicacion 
		double multiplicacion = c * a;
		System.out.println("el resulado de la multiplicacion es: " + multiplicacion);
		
		//modulo, nos da el reciduo de una divicion
		double modulo = a % c;
		System.out.println("el modulo de la operacion es: " + modulo);
		
		/*
		 * operador de asignacion
		 * = 
		 */
		int d = 5, e;//inicializar las variables vacias
		
		e = 6;
		
		System.out.println(d + " - " +  e);
		
		//Operadores de declaracion compuesta
		//+=, -=, *=, /=, %=
		//una operacion simplificada
		
		int f = 0, g = 5;
		
		f += 5;
		
		System.out.println(f);
		
		//operadores relacionales 
		/*<, >, <=, >=
		 * == igualdad
		 * ! diferencia 
		 * Resultado un valor de tipo boolean(true, false)
		 */
		
		int h = 15, i = 25;
		String j = "Hola";
		
		System.out.println(h > i);
		System.out.println(i != h);
		//System.out.println(h != j); //son valores distintos y no se pueden comparar 
		
		//operador unario
		/*++, --
		 * preasignacion -- ++k se le asigna aun valor antes de usarse
		 * postasignacion -- k++ ptrimero lee el valor y despues le suma 1
		 */
		
		int k = 0, l = 0;
		k++;
		System.out.println(k);
		System.out.println(--l);
		
		//precedencia de operadores
		
		int operacion = 4 + 5 * 6 / 3;//14
		//5 * 6 = 30
		//30 / 3 = 10
		//4 + 10 = 14
		
		System.out.println(operacion);
		
		int x = 0, y = 0;
		int operacion2 = ++x + y--;
		// x = 1, y = 0;
		System.out.println(operacion2);//1
		
		//operador ternario
		
		int edad = 18, valor1 = 0;
		int resultado =  (edad <= 18) ? (valor1 = 2) : (valor1 = 3);
		//parentesis son opcionales 
		System.out.println(resultado);
		
		//operador logico
		// and - &&
		// or - ||
		// Not !
		
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(true || false);//true
		System.out.println(true && !false);//true 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		int num = sc.nextInt();
		System.out.println(num);
		
		
	}

}
