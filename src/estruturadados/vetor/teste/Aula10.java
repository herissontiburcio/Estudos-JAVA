package estruturadados.vetor.teste;

import estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {

		// Generalizar o tipo dos elementos no vetor

		VetorObjetos vetor = new VetorObjetos(3);

		Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "4567-7896", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "3456-6459", "contato3@email.com");

		Contato c4 = new Contato("Contato 3", "3456-6459", "contato3@email.com");

		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);

		System.out.println("Tamanho = " + vetor.tamanho());

		int pos = vetor.busca(c4);
		if (pos > -1) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}

		System.out.println(vetor);

	}

}
