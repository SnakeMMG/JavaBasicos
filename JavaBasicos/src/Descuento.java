import java.util.Scanner;

//si la cuenta es de menos de 1000
		// sila cuenta es de 1000 - 4999 10%
		// si la cuenta es de 5000 a 9999 20%
		// si la copra es de 10000 o más 30%



public class Descuento {
	public static void main(String[] args) {
		
		System.out.println("total de la compra");
		Scanner scanner = new Scanner(System.in);
		
		
		float total = scanner.nextFloat();//.nextFloat tecupera decimales
		//float total = scanner.nextInt();// .nextInt recupera numeros enteros del usuario
		
		if (total < 1000) {
			System.out.println("no hay descuentos por el momento y me deves $" + total + " carnal");
		}else if(total < 5000) {
			total *= .90;
			System.out.println("tu descuento es del 10% y me deves $" + total + " carnal");
			
		}else if(total < 10000) {
			
			total *= .80;
			System.out.println("tu descuento es del 20% y me deves $" + total + " carnal");
			
		}else {
			total *= .70;
			System.out.println("tu descuento es del 30% y me deves $5" + total + " carnal");
		}
		
	}
}
