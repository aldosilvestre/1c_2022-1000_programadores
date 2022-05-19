package com.milprogramadores;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		
		HashMap<String, String> hashMap = new HashMap<>();
		
		hashMap.put("nombre", "Aldo");
		hashMap.put("apellido", "Silvestre");
		
		System.out.println(hashMap);
		
		System.out.println(hashMap.get("nombre"));
		
		//String valor = hashMap.remove("nombre");
//		System.out.println(valor);
		System.out.println(hashMap);
		
		hashMap.put("nombre", "Gabriel");
		System.out.println(hashMap);
		System.out.println("-- for --");
		for(String key : hashMap.keySet()) {
			System.out.println(hashMap.get(key));
		}
		System.out.println(" -- valores -- ");
		for(String value : hashMap.values()) {
			System.out.println(value);
		}
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(0, "Cero");
		hm.put(1, "Uno");
		
		
		
		
	}

}
