package algoritmos.ordenacao;

public class QuickSort {

	public static void main(String[] args) {

		// Cria um vetor de inteiros com 10 elementos
		int[] vetor = new int[10];

		// Preenche o vetor com valores aleatórios entre 0 e 9 (inclusos) e impressão dos valores gerados
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) Math.floor(Math.random() * vetor.length);
		}

		System.out.println("Desordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

		// Chamada do método de ordenação quicksort
		quicksort(vetor, 0, vetor.length - 1);

		System.out.println("\n\nOrdenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

	// Método de ordenação quicksort
	static void quicksort(int[] vetor, int esquerda, int direita) {
		// Verifica se é necessário ordenar
		if (esquerda < direita) {
			// Particiona o vetor e retorna o índice do elemento pivô
			int p = particao(vetor, esquerda, direita);
			// Ordena a sublista da esquerda do pivô
			quicksort(vetor, esquerda, p);
			// Ordena a sublista da direita do pivô
			quicksort(vetor, p + 1, direita);
		}
	}

	// Método para particionar o vetor em duas sublistas
	static int particao(int[] vetor, int esquerda, int direita) {
		// Encontra o elemento pivô (neste caso, o elemento central)
		int meio = (int) (esquerda + direita) / 2;
		int pivot = vetor[meio];
		// Define dois índices: um para percorrer a lista da esquerda para a direita (i) e outro para percorrer da direita para a esquerda (j)
		int i = esquerda - 1;
		int j = direita + 1;
		// Enquanto os índices não se cruzarem
		while (true) {
			// Percorre a lista da esquerda para a direita até encontrar um elemento maior ou igual ao pivô
			do {
				i++;
			} while (vetor[i] < pivot);
			// Percorre a lista da direita para a esquerda até encontrar um elemento menor ou igual ao pivô
			do {
				j--;
			} while (vetor[j] > pivot);
			// Se os índices se cruzaram, retorna o índice do elemento na posição j (que será usado para particionar o vetor)
			if (i >= j) {
				return j;
			}
			
			// Caso contrário, troca os elementos nas posições i e j para manter a ordem dos elementos e continuar a particionar
			
			int aux = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = aux;
		}
	}

}
