import java.util.*;


public class Colecciones {
	

	public static void main(String[] args) {
		
		//las colecciones nos sirven para almacenar un conjunto de objetos
		//la diferencio de las colecciones y los objetos
		//las colecciones son dinamicas, pueden cambiar
		//el numero de objetos agregados
		
		//set tiene 3 tipos de implementaciones
		//no puede tener elementos repetidos
		
		
		//HashSet
		//los elementos no mantienen un orden 
		//no pueden tener elementos repetidos
		
		/*
		Set<String> frutas = new HashSet<String>();
		frutas.add("mango");		
		frutas.add("granada");
		frutas.add("pera");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		frutas.add("fresa");
		*/
		
		//foreach puede recorrer una coleccion y en cada recorrido recupera 
		//el valor y lo podemos almacenar en una variable
		//Sintaxis
		//for(tipoDeDatoElemento variable 
		/*
		for(String fruta: frutas) {
			System.out.println(fruta);
		}
		*/
		
		
		//TreeSet
		//Esta implementacion ordena los elementos den funcion de sus valores
		//es la implementacion mas lenta
		//ordena de forma alfabetica
		
		/*
		Set<String> frutas = new TreeSet<String>();
		frutas.add("mango");		
		frutas.add("granada");
		frutas.add("pera");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		
		for(String fruta: frutas) {
			System.out.println(fruta);
		}
		*/
		
		
	    //LinKedHshSet
		//ordena los elementos en orden de insercion
		//es mas costoso que hashSet
		//respeta el orden de insercion
		
		/*
		Set<String> frutas = new LinkedHashSet<String>();
		frutas.add("mango");		
		frutas.add("granada");
		frutas.add("pera");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		
		for(String fruta: frutas) {
			System.out.println(fruta);
		}
		*/
		
		
		//List
		//se permiten elementos duplicados
		//acceder a elementos especificos
		//buscar elementos
		
		
		//ArrayList
		
		List<String> pokemones = new ArrayList<String>();
		
		pokemones.add("Chicorita");
		pokemones.add("Evee");
		pokemones.add("Dragonite");
		pokemones.add("Charizard");
		pokemones.add("Gengar");
		pokemones.add("Gyarados");
		//pokemones.add("Gengar");
		//add si agregamos un indice y un elemento, posiciona el elemento en el indice y realiza un desplazamiento
		//es decir no borra el elemento en la posicion sino que lo desplaza
		pokemones.add( 2, "Pikachu");
		
		//remove remueve el elemento de la posicion especifica 
		pokemones.remove(3);
		//set va remplazar el elemento en la posicion que nosotros especifiquemos
		pokemones.set(1, "Chikorita");
		
		for(String pokemon: pokemones) {
			System.out.println(pokemon);
		}
		System.out.println("\n***********************");
		System.out.println(pokemones.get(5));
		
		//indexOf, nos va a devolver la posicion del elemento 
		//y si el elemento no se nos devuelve -1 (especiie de error)
		
		System.out.println(pokemones.indexOf("Gengar"));
		//System.out.println(pokemones.lastIndexOf("Gengar"));//Devuelve el ultimo elemento que encuentre con ese nombre
		
		System.out.println("\n***********************");
		
		//linKedlist
		//Es una lista doblemente enlazada
		//Es mas rapido para insertar y remover elementos
		
		
		List<String> digimones = new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Andromon");
		digimones.add("Greymon");
		
		System.out.println(digimones);
		System.out.println("\n***********************");
		
		//Map
		//Asocia claves a valores.
		//No puede contener claves duplicadas
		//solo puede tener un valor asociado
		
		//hashMap
		//tiene mejor rendimiento pero no garantiza un orden a la hora de hacer interacciones
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "Snake");
		usuarios.put(3, "Samus Aran");
		usuarios.put(5, "Kratos");
		usuarios.put(9, "Marcus");
		usuarios.put(2, "Master Shift");
		//usuarios.put(2, "Master Shift");//HashMap no asepta claves duplicadas
		System.out.println(usuarios.get(5));
		System.out.println("\n***********************");
		
		//keyset
		//nos permite recuperar el nombre de la clave
		
		
		System.out.println(usuarios.keySet());
		//values
		//nos permite recuperar el valor directamente
		System.out.println("\n" + usuarios.values());
		System.out.println("\n***********************");
		
		
		
		//TreeMap
		Map<String, String> tamales = new TreeMap<String, String>();
		tamales.put("oaxaquenos", "Mole Rojo" );
		tamales.put("Torta", "Mole Verde" );
		tamales.put("Dulce", "Gancito" );
		tamales.put("Salado", "Cochinita" );
		
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		System.out.println(tamales);
		System.out.println("\n***********************");
		
		
		tamales.entrySet().forEach(clave -> {// funcion lambda
			System.out.println(clave.getKey());
			System.out.println(clave.getValue());
			
		});
		System.out.println("\n***********************");
		
		//LinKedHashMap
		Map<Integer, String> carros = new LinkedHashMap<Integer, String>();
		//guarda los elementos, segun el orden en que se inserten 
		carros.put(1, "Volvo");
		carros.put(3, "pointer");
		carros.put(8, "Mustang");
		System.out.println(carros.keySet());
		System.out.println(carros.values());
		
	}
	}
	
		
	
	
	
	


