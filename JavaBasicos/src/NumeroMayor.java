import java.util.Scanner;

public class NumeroMayor {
	public static void main(String[] args) {
		
		System.out.println("cuantas chelas te tomas?");
		Scanner scanner = new Scanner(System.in);
		
		
		int num1 = scanner.nextInt();
		System.out.println("cuantas tortas te comes?");
		
		int num2 = scanner.nextInt();
		System.out.println("cuantas manzanas te comes?");
		
		int num3 = scanner.nextInt();
		
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + "chelas? eres briag@");
			
			
		}else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " tortas? te pasas de tu alimento");
			
			
		}else if (num3 > num1 && num3 > num2) {
			System.out.println(num3 +  " manzanas? estas bien mamad@ <:-)");
			
		}else {
			System.out.println("eres briag@, gord@ y san@ al mismo tiempo");
		}
	}
}
