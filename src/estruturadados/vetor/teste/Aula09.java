package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {

		// Remover elemento do vetor
		Vetor vetor = new Vetor(3);

		vetor.adiciona("B");
		vetor.adiciona("G");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");

		System.out.println(vetor);

		vetor.remove(1);

		System.out.println(vetor);

		System.out.println("Remover o elemento F");

		int pos = vetor.busca("F");
		if (pos > -1) {
			vetor.remove(pos);
		} else {
			System.out.println("Elemento não existe no vetor");
		}

		System.out.println(vetor);

	}

}
