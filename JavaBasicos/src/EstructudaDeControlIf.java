
import java.util.Scanner;

public class EstructudaDeControlIf {
	public static void main(String[] args) {
	//Estructuras de control de flujo
	//nos sirve para la toma de decisiones
	
	//estructuras de control de flujo nos sirven para 
	//cambiar el flujo de nuestro programa
	//evaluando una condicion y apartir de la evaluavion
	//se realiza una accion u otra.
	
	/*if (condicion){
		codigo
		}else {
			codigo
			}
	*/
		
		System.out.println("introduce tu edad");
		Scanner scanner = new Scanner(System.in);
		int edad = scanner.nextInt();
		
		
		if(edad >= 18) {
			System.out.println("eres mayor de edad ");
		}else {
			System.out.println("Eres menor de edad");
		}
		
	
		
	}

}
