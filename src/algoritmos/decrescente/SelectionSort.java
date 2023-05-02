package algoritmos.decrescente;

public class SelectionSort {

	public static void main(String[] args) {

//		// Cria vetor de inteiros com tamanho 10
//		int[] vetor = new int[10];
//
//		// Preenche o vetor com valores aleatórios entre 0 e 9
//		for (int i = 0; i < vetor.length; i++) {
//			vetor[i] = (int) (Math.random() * vetor.length);
//		}
//
//		// Impressão do vetor desordenado
//		System.out.println("Desordenado");
//		for (int i = 0; i < vetor.length; i++) {
//			System.out.println(vetor[i]);
//		}
//
//		// Variáveis auxiliares para armazenar a posição do menor elemento e realizar as trocas
//		int posicao_maior, aux;
//		
//		// Algoritmo de ordenação por seleção
//		for (int i = 0; i < vetor.length; i++) { // O(N)
//			posicao_maior = i;
//			for (int j = i + 1; j < vetor.length; j++) { // O(N)
//				if (vetor[j] > vetor[posicao_maior]) {
//					posicao_maior = j;
//				}
//			}
//			aux = vetor[posicao_maior];
//			vetor[posicao_maior] = vetor[i];
//			vetor[i] = aux;
//		}
//
//		// Impressão do vetor ordenado
//		System.out.println("\n\nOrdenado");
//		for (int i = 0; i < vetor.length; i++) {
//			System.out.println(vetor[i]);
//		}

		// Declaração e inicialização do array de inteiros
		int vetor[] = { 0, 6, 8, 7, 22, 11, 2, 9, 4, 1 };

		// Impressão dos valores do array antes de ser ordenado
		for (int i : vetor) {
			System.out.print(i + " , ");
		}

		// Chamada do método de ordenação selectionOrder() e impressão dos valores do
		// array após a ordenação
		System.out.println();
		selectionOrder(vetor);

	}

	// Definição do método de ordenação por seleção
	public static void selectionOrder(int vetor[]) {
		int posicao_maior, aux;

		// Algoritmo de ordenação por seleção
		for (int i = 0; i < vetor.length; i++) {
            posicao_maior = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] > vetor[posicao_maior]) {
                    posicao_maior = j;
				}
			}
            aux = vetor[posicao_maior];
            vetor[posicao_maior] = vetor[i];
            vetor[i] = aux;
		}

		// Impressão dos valores do array após a ordenação
		for (int i : vetor) {
			System.out.print(i + " , ");
		}

	}

}
