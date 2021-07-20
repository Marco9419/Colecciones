package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class classColecciones {
	
 public static void main(String args[]) {
	
	 
//	 La coleccion Set no puede contener elementos duplicados
//	 Solo tiene los metodos heredados de collection
//	 Existen diferentes tipos de implementaciones.
	 
//	 HashSet: Esta implementacionalmavena los elementos de una tabla hash. 
//	 Es la que mejor rendimiento tiene.
//	 Los elementos no tienen un orden.
	 
//	 No se orden al momento de mostrarlos en pantalla 
//	 Set <String> frutas = new HashSet();
//	 frutas.add("Manzana");
//	 frutas.add("Mango");
//	 frutas.add("Platano");
//	 frutas.add("Papaya");
	 
//	 Se ordenan como los añadiste
//	 Set <String> frutas = new LinkedHashSet();
//	 frutas.add("Manzana");
//	 frutas.add("Mango");
//	 frutas.add("Platano");
//	 frutas.add("Papaya");
	 
//	 Esta parte es unicamente para poder acceder a los elementos
//	 Los almacenamos en un array y ya podemos acceder a cada indice del array
//	 int a = frutas.size();
//	 String[] arrayFrutas = new String[a];
//	 int i = 0;
//	 
////	 Este for lo utilizamos para mostrar cada fruta dentro del hashSet
////	primero indicamos el tipo de dato, seguido de la variable y posetior el hashSet
//	 for(String fruta: frutas) {
//		 arrayFrutas[i] = fruta;
//		 i++;
//		 
//	 }
//	 
//	for(i = 0; i < arrayFrutas.length; i++) {
//		System.out.println(arrayFrutas[i]);
//		
//	}
//	System.out.println("");
//	System.out.print(arrayFrutas[2]);
	 
// La interfz list degine una sucecion de elementos
// Si admite elementos duplicados
// Añade nuevos metodos que podemo usar
// Acceso opcional a elementos: manipula elementos de su posicion 
	 
	 List<String> frutas2 = new ArrayList<String>();
	 
	 
	 frutas2.add("Manzana");
	 frutas2.add("Mango");
	 frutas2.add("Platano");
	 frutas2.add("Papaya");
	 
	 for(String fruta: frutas2 ) {
		 System.out.println(fruta);
	 }
	 
	 int mango = frutas2.indexOf("Mango");
	 System.out.println(mango);
	 HashMap diccionario = new HashMap();
	 
	 diccionario.put("Nombre", "Marco");
	 diccionario.put("Edad", 25);
	 diccionario.put("Domicilio", "Av. IPN Mz60 Lt 11");
	 
	 System.out.print(diccionario);
 }
}

	
 
 
