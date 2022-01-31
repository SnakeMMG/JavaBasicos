package Ciclos;

public class Ciclos {
	public static void main(String[] args) {
		
		//while 
		
		/*int control = 0;
		
		
		while (control < 10){
			System.out.println("control = " + control);
			control++;
		}*/
		
		//do while
		
		/*int control = 0;
		do {
			//codigo a ejecutar 
			System.out.println("control = " + control);
			//modificador de la variable de control
       			control++;
		}while(control < 3);*/
		
		//for
		/*for (int i=0; i < 3; i++) {
			System.out.println("control = " + i);
		}*/
		
		//break & continue
		
		/*for(int i=0; i <10; i++) {
			if (i % 2 ==0) {//solo se ejecuta cuando el valor de i sea numero par
				System.out.println("control = " + i);
				break;//solo termina el ciclo 
				//solo deja que se ejecute una vez lo que esta antes 
			}
		}*/
		for(byte i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				continue;///permite saltarnos una ejecucion del for 
				//deja que continue el ciclo
			}
			System.out.println("control = " + i);
			
		}
		
		
	}

}
