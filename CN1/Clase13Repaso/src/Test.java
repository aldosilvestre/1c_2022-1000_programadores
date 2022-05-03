import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		// Vector tamaño estatico
		int[] array = new int[3];
		array[1] = 5;
		
		for(int e : array) {
			System.out.println(e);			
		}
		
		// Vector tamaño dinamico --> Lista mutable
		ArrayList<String> arrayList = new ArrayList<String>(); 

		arrayList.add("Hola");
		arrayList.add("mundo");
		arrayList.add("cruel");
		
		arrayList.remove(2);
		System.out.println(arrayList);
		
		// Lista inmutable --> no cambia 
		List<String> arrayInmutable = List.of("hola", "de", "nuevo");
		System.out.println(arrayInmutable);
		
		
		// MATRIZ
		int[][] matriz = new int[3][5];
		
		for(int[] vectorActual : matriz) {
			for(int elemento : vectorActual) {
				System.out.print(elemento + "\t");
			}
			System.out.println();
		}
		
		
	}

}
