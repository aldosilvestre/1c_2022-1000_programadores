package com.milprogramadores;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<String>();
		
			lista.add("Aldo");
			lista.add("Aldo");
			lista.add("Aldo");
			
			System.out.println(lista);
				
		System.out.println(" -- HASH MAP --");		
		
		HashMap<String, String> hashMap = new HashMap();
		
		hashMap.put("nombre", "Aldo");
		hashMap.put("apellido", "Silvestre");
		hashMap.put("nombre", "Gabriel");
		
		System.out.println(hashMap);
		
		System.out.println(hashMap.get("nombre"));
		
		for(String valor: hashMap.values()) {
			System.out.println(valor);
		}
		
		System.out.println(" -- hashmap por claves");
		
		for(String clave: hashMap.keySet()) {
			System.out.println("clave: " + clave + ", valor: " + hashMap.get(clave));
		}
		
		hashMap.clear();
		
		System.out.println(hashMap);
		
	}

}
