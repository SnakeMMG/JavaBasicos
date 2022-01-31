package Ciclos;
import java.util.Scanner;
public class Tabla {
	public static void main(String[] args) {
		
	
	//Utilizando un bucle while

		//1.- Crea una nueva clase llamada Tabla
		//2.- Copia el siguiente codigo y verifica que funcione

			
			

			
			        Scanner console = new Scanner(System.in);
			        int num;
			        
			        System.out.print("Ingresa cualquier número positivo sel 1 al 10: ");
			        num = console.nextInt();
			                
			        System.out.println("Tabla de multiplicar de  " + num);
			        byte x = 0;
			        while(x <= 10) {
			        	byte y = (byte) (num * x);
			        	System.out.println(num + " x " + x + " = " + y);
			        	x++;
			        	
			        }
			        
			       //Implementa un bucle while que imprima el resultado
			    
			

		//3.- Debe imprimir la tabla de multiplicar del número en cuestión (solo los primeros 10 números)

}

}