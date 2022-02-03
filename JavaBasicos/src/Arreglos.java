
public class Arreglos {
       //solo un tipo de dato
	   //especificar el tamaño o la cantidad de elementos que va a conteter
	
	//1.- manera
	public static void main(String[] args) {
	int numeros[];//creamos la variable
	numeros = new int[4];//creando arreglo 
	
	//2.- manera
	String[] nombres = new String[5];//basado en 0. [0, 1, 2, 3]
	
	//3.-manera
	//array literal
    String []nombresFrutas = new String[] {"Manzana","Platano", "Pera", "papaya"};
	
	
	numeros[0] = 10;
	numeros[1] = 8;
	numeros[2] = 100;
	numeros[3] = 200;
	//numeros[4] = 300;//los arreglos no pueden cambiar su tamano
	
	nombres[0] = "Juan";
	nombres[1] = "Pedro";
	nombres[2] = "Antonio";
	nombres[3] = "Felipe";
	
	
	
	System.out.println(numeros[0]);
	System.out.println(numeros);
	
	for(int i = 0; i < numeros.length; i++) {//en arrays, length es una propiedad
		
		System.out.println("Elemento de numeros: " + numeros[i]);//[0], [1], [2], [3]
		System.out.println("Elemento de nombres: " + nombres[i]);
		System.out.println("Elemento de nombresFrutas: " + nombresFrutas[i]);
		System.out.println("---------------------------------" );
	}
}
}