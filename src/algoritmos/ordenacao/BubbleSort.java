package algoritmos.ordenacao;

public class BubbleSort {

	public static void main(String[] args) {
		// Cria um vetor de 10 inteiros
//		int[] vetor = new int[10];
//
		// Preenche o vetor com números aleatórios de 0 a 9 e imprime na tela
//		for (int i = 0; i < vetor.length; i++) {
//			vetor[i] = (int) (Math.random() * vetor.length);
//			 System.out.println(vetor[i]);
//		}
//
//		// Algoritmo de ordenação Bubble Sort O(N^2)
//		int aux;
//		for (int i = 0; i < vetor.length; i++) { // O(N)
//			for (int j = i + 1; j < vetor.length; j++) { // O(N)
//				if (vetor[i] > vetor[j]) { // Verifica se o elemento i é maior que o elemento j
//					aux = vetor[j]; // Realiza a troca de valores
//					vetor[j] = vetor[i];
//					vetor[i] = aux;
//				}
//			}
//		}
//
//		// Imprime o vetor ordenado na tela
//		 System.out.println("Vetor ordenado"); for(int i = 0; i < vetor.length; i++){
//		 System.out.println(vetor[i]); }
		
		

		// Vetor de inteiros a ser ordenado
        int[] vetor = { 5, 2, 4, 3, 0, 9, 7, 8, 1, 6 };

        // Chamada do método de ordenação
        ordenar(vetor);

        // Impressão do vetor ordenado
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }

    public static void ordenar(int[] v) {
        // Loop externo: percorre todo o vetor
        for (int i = 0; i < v.length - 1; i++) {
            // Loop interno: percorre o vetor a partir do início até o fim menos i
            // (já que após cada iteração do loop externo, o maior elemento já está na
            // posição correta)
            for (int j = 0; j < v.length - 1 - i; j++) {
                // Se o elemento atual é maior que o próximo, faz a troca de posição
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
	}

}
