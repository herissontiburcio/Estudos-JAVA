package estruturadados.vetor.labs;

import estruturadados.vetor.Lista;

public class Exer03 {

	public static void main(String[] args) {
		
		// Exer03 método remove elemento
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		
		System.out.println(lista);
		
		lista.remove("A");
		
		System.out.println(lista);
		
		lista.remove("E");
		
		System.out.println(lista);
		
		lista.remove("C");
		
		System.out.println(lista);

	}

}
