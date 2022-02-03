import java.util.Scanner;

public class DeletreaNombre {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe tu nombre");
		String nombre = sc.nextLine();
		
		char caracter;
		
	 for(byte i = 0; i < nombre.length(); i++) {
			
			caracter = nombre.charAt(i);
			if(i == 0) {
			System.out.println("Tu nombre deletrado hermano \n" );
			}
			System.out.println("  " + caracter);
		}
		
}
}