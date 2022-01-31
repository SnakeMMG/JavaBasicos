import java.util.Scanner;

public class EstructuraDeControlSwitch {
    
	//Estructuras de control nos sirve para controlar el flujode 
	//comportamiento de un programa. para la toma de decisiones
	
	
	/*
	 * switch(condicional_a_evaluar) {
	 * case "valor":
	 *      //codigo a ejecutar 
	 *      //break;
	 * case "n":
	 *      //codigo a ejecutar
	 *      //break;
	 * default:
	 *      //codigo a ejecutar    
	 * }
	 * 
	 */
	
	//solicitar al isuario un dia de la semana y mostrar un mensaje
	public static void main(String[] args) {
		System.out.println("introduce un dia de la semana");
	Scanner sc = new Scanner(System.in); 
	String dia = sc.nextLine();// .nextLine recupera lines de texto del usuario
	
	switch (dia.toLowerCase()) {
	case "lunes":
		System.out.println("Ya mero es viernes, toma un cafe");
		break;
	case "martes":
		System.out.println("Esro esta cansado pero ya casi");
		break;
	case "miercoles":
		System.out.println("miercoles pero a que costo");
		break;
	case "jueves":
		System.out.println("jebebes de sed peligrosa");
		break;
	case "viernes":
		System.out.println("fiesta asta morir");
		break;
	case "sabado":
	case "domingo":
		System.out.println("basta de trabajacion");
		break;
		
		
   default:
	   System.out.println("Dia desconocido");
	
	
	}
}
}