package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

public class Aula04 {

	public static void main(String[] args) {

		// Tamanho e imprimir elementos
		Vetor vetor = new Vetor(10);

		vetor.adiciona("elemento1");
		vetor.adiciona("elemento2");
		vetor.adiciona("elemento3");

		System.out.println(vetor.tamanho());
		
		System.out.println(vetor);

	}

}
