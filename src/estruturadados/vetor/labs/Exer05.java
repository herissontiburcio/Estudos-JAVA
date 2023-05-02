package estruturadados.vetor.labs;

import java.util.ArrayList;

import estruturadados.vetor.Lista;

public class Exer05 {

	public static void main(String[] args) {
		
		//Exer05 remover todos os elementos (clear)
		
		ArrayList<String> arrayList = new ArrayList<String>(5);
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		
		System.out.println(arrayList);
		
		arrayList.clear();
		
		System.out.println(arrayList);
		
		
		//Exer05 remover todos os elementos (clear)
		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		
		System.out.println(lista);
		
		lista.limpar();
		
		System.out.println(lista);

	}

}
