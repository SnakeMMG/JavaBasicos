
public class ManipularArreglo {
	public static void main(String[] args) {
		
		int numeros[] = {1, 6, 45, 53, 80, 102, 145, 326, 450, 892};
		
		int suma = 0;
		int par = 0;
		int impar = 0;
		
		for(byte i = 0; i < numeros.length; i++ ) {
			
			
			suma += numeros[i];
			
			if(numeros[i] % 2 == 0) {
				par += numeros[i];
			}else {
				impar += numeros[i]; 
			}
				
	
			
		}
		System.out.println("la suma total es: " + suma);
		System.out.println("la suma de los numeros par es: " + par);
		System.out.println("la suma de los numeros impar es: " + impar);
		
	}

}
