package estruturadados.vetor.labs;

import estruturadados.vetor.Lista;

public class Exer01 {

	public static void main(String[] args) {
		
		// Exer01 método contém
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("E"));

	}

}
