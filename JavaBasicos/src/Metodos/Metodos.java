package Metodos;

public class Metodos {
    
   //metodo es una funcion
   //atriburos de la clase 	
    	int a, b;
   //metodo void (Vacio)
    	
    	public void sumar() {
    		int resultado = a + b;
    		System.out.println("El resultado de " + a + " mas " + b + " es " + resultado);
    	}
    	
    	//metodo con entorno de valores
    	public int sumaConRetorno() {
    		
    		//int resultado = a + b;
    		//return resultado;
    		
    		
    		return a + b;
    	}
    	
    	
    	//argumentos
    	//suma(argumentos)
    	
    	public double multiplicarConArgumentos(int arg1, double arg2) {
    	    int c = arg1;
    	    double d = arg2;
    	    
    	    return c * d;
    		
    	}
    	
    	//metodo estatico 
    	//este metodo es estatico (no regresa datos), usa argumentos
    	public static void imprimirNombre(String nombre) {
    		System.out.println("Mi nombre es: " + nombre);
    	}

		
    	
    
}
