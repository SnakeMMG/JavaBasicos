import java.util.Scanner;

public class Calculadora {
	/*
	   * Pedir al usuario 2 números por consola y preguntarle que desea realizar
	   * 1) Suma
	   * 2) Resta
	   * 3) División
	   * 4) Multiplicación
	   * 
	   * y despues imprimir el resultado
	   */
	public static void main(String[] args) {
		System.out.println("introduce un numero");
		 Scanner sc = new Scanner(System.in); 
		Double num1 = sc.nextDouble();
		System.out.println("introduce otro numero");
		Double num2 = sc.nextDouble();
		
		sc.nextLine();//esta linea de codico limpia el bifer, el \n que esta dento de bufer se elimina
		
		System.out.println("que operacion deseas realizar suma, resta, divicion, o multiplicacion,?");
		
		
		//byte operacion = sc.nextByte();
		
		
		
		String operacion = sc.nextLine();
		
		sc.close();//de esta manera serramos el scaner y aorramos memoria, es importante serrarlo pora que el programa sea mas eficiente 
		
		
		/*switch (operacion) {
		case 1:
			num1 += num2;
			System.out.println("el resultado es " + num1);
			break;
		case 2:
			num1 -= num2;
			System.out.println("el resultado es " + num1);
			break;
		case 3:
			if(num2 != 0) {
				num1 /= num2;
				System.out.println("el resultado es " + num1);
				}else {
					System.out.println("no se puede dividir entre 0");
				}
			
			break;
		case 4:
			num1 *= num2;
			System.out.println("el resultado es " + num1);
			break;
			
			
			
		default:
		   System.out.println("numeros desconocidos");
	}*/
		
		
		switch (operacion) {
		case "suma":
			num1 += num2;
			System.out.println("el resultado es " + num1);
			break;
		case "resta":
			num1 -= num2;
			System.out.println("el resultado es " + num1);
			break;
		case "divicion":
			if(num2 != 0) {
				num1 /= num2;
				System.out.println("el resultado es " + num1);
				}else {
					System.out.println("no se puede dividir entre 0");
				}
			
			break;
		case "multiplicacion":
			num1 *= num2;
			System.out.println("el resultado es " + num1);
			break;
		default:
		   System.out.println("operacion desconocida");
	}
}
}
