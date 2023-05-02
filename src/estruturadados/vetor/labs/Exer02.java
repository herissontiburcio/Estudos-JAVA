package estruturadados.vetor.labs;

import java.util.ArrayList;

import estruturadados.vetor.Lista;

public class Exer02 {

	public static void main(String[] args) {
		
		// Exer02 método último indice
		ArrayList<String> arrayList = new ArrayList<>(5);
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("A");
		
		System.out.println(arrayList.lastIndexOf("A"));
		
		// Exer02 método último indice
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("A");
		
		System.out.println(lista.ultimoIndice("A"));

	}

}
