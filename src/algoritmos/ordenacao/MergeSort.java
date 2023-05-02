package algoritmos.ordenacao;

public class MergeSort {
	public static void main(String[] args) {
		// Cria uma array de inteiros com valores desordenados
		int[] numeros = { 6, 2, 21, 4, 12, 0, 1, 32, 3, 5 };
		
		// Chama o método mergeSort passando como parâmetros a primeira posição da array, a última posição da array e a array a ser ordenada.

		mergeSort(0, numeros.length, numeros);

		// Imprime a array ordenada na tela
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}

	// Método que implementa o algoritmo de ordenação Merge Sort
	public static void mergeSort(int inicio, int fim, int[] vetor) {

		// Verifica se ainda há elementos a serem divididos
		if (inicio < fim - 1) {

			// Divide a array em duas partes, calculando o meio
			int meio = (inicio + fim) / 2;
			
			// Ordena a primeira parte da array
			mergeSort(inicio, meio, vetor);

			// Ordena a segunda parte da array
			mergeSort(meio, fim, vetor);

			// Une as duas partes ordenadas da array
			intercala(vetor, inicio, meio, fim);
		}
	}

	// Método que intercala as duas partes da array
	public static void intercala(int[] vetor, int inicio, int meio, int fim) {

		// Cria um novo vetor para armazenar os elementos ordenados
		int novoVetor[] = new int[fim - inicio];

		// Define as posições iniciais dos índices para a intercalação
		int i = inicio;

		int m = meio;

		int pos = 0;

		// Compara os elementos das duas partes e os adiciona em ordem crescente no novo vetor
		while (i < meio && m < fim) {

			if (vetor[i] <= vetor[m]) {
				novoVetor[pos] = vetor[i];
				pos = pos + 1;
				i = i + 1;

			} else {
				novoVetor[pos] = vetor[m];
				pos = pos + 1;
				m = m + 1;
			}
		}

		// Adiciona os elementos restantes da primeira parte no novo vetor
		while (i < meio) {
			novoVetor[pos] = vetor[i];
			pos = pos + 1;
			i = i + 1;
		}

		// Adiciona os elementos restantes da segunda parte no novo vetor
		while (m < fim) {
			novoVetor[pos] = vetor[m];
			pos = pos + 1;
			m = m + 1;
		}

		// Substitui os elementos da array original pelos elementos ordenados no novo vetor
		for (pos = 0, i = inicio; i < fim; i++, pos++) {
			vetor[i] = novoVetor[pos];
		}
	}
}
