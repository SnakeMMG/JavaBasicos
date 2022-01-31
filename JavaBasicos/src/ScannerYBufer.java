import java.util.Scanner;

public class ScannerYBufer {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("introduce un nombre");
		String nombre = sc.nextLine();
		
		System.out.println("intoduce un numero");
		int numero1 = sc.nextInt();
		
		System.out.println("tu nombre es " + nombre + " tu numero es " + numero1);
		
		
		
		/*System.out.println("intoduce otro numero");
		int numero2 = sc.nextInt();
		
		System.out.println("numero1: " + numero1 + " numero2: " + numero2);*/
	}

}
