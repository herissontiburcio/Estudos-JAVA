package estruturadados.vetor.teste;

import estruturadados.vetor.Lista;
import estruturadados.vetor.VetorObjetos;

public class Aula11 {

	public static void main(String[] args) {

		// Definindo o tipo do vetor dinamicamente

		Lista<Contato> vetor = new Lista<Contato>(1);

		Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");

//		vetor.adiciona("Elemento"); //String
		vetor.adiciona(c1);

		System.out.println(vetor);

	}

}
