import java.util.List;

public class Test2 {

	public static void main(String[] args) {

		
		for(int i = 0; i < 5; i++ ) {
			System.out.println("Hola");
		}
		
		int i = 0;
		while(i < 5) {
			System.out.println("Chau");
			i++;
		}
		
		i = 0;
		do {
			System.out.println("Mundo");
			i++;
		}while(i<5);
		
		
		List<String> lista = List.of("Aldo", "Pablo", "Jose"); 
		
		for(String elementoActual : lista) {
			System.out.println(elementoActual);
		}
		
		if( ( 3 < 5 ) && ( 1 < 2 ) ) {
			System.out.println("es verdadero");
		}
		
		int estadoLlave = 12;
		
		switch (estadoLlave) {
		case 2:
			System.out.println("esta medio encendido");
			break;
		case 1:
			System.out.println("esta encendido");
			break;
		case 0:
			System.out.println("esta apagado");
			break;
		default:
			System.out.println("cualquier cosa");
			break;
		}
		
		
		
		
	}

}
