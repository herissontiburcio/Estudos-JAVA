package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {
		
		// Verificar se elemento existe
		Vetor vetor = new Vetor(10);

		vetor.adiciona("elemento1"); //0
		vetor.adiciona("elemento2"); //1
		vetor.adiciona("elemento3"); //2
		
		System.out.println(vetor.busca("elemento1"));
		System.out.println(vetor.busca("elemento4"));

	}

}
