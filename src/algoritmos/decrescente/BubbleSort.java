package algoritmos.decrescente;

public class BubbleSort {

	public static void main(String[] args) {
//		// Criação de um vetor de inteiros com 10 elementos
//        int[] vetor = new int[10];
//
//        // População do vetor com valores aleatórios entre 0 e 9 (inclusos) e impressão dos valores gerados
//        for (int i = 0; i < vetor.length; i++) {
//            vetor[i] = (int) (Math.random() * vetor.length);
//            System.out.println(vetor[i]);
//        }
//
//        // Algoritmo de ordenação Bubble Sort
//        int aux;
//        for (int i = 0; i < vetor.length; i++) {
//            for (int j = i + 1; j < vetor.length; j++) {
//                if (vetor[i] < vetor[j]) {
//                    // Troca de valores para ordenação decrescente
//                    aux = vetor[i];
//                    vetor[i] = vetor[j];
//                    vetor[j] = aux;
//                }
//            }
//        }
//
//        // Impressão do vetor ordenado
//        System.out.println("Vetor ordenado");
//        for (int i = 0; i < vetor.length; i++) {
//            System.out.println(vetor[i]);
//        }
		
		// Vetor de inteiros a ser ordenado
        int[] vetor = { 5, 2, 4, 3, 0, 9, 7, 8, 1, 6 };

        // Chamada do método de ordenação decrescente
        ordenarDecrescente(vetor);

        // Impressão do vetor ordenado
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }

    public static void ordenarDecrescente(int[] v) {
        // Loop externo: percorre todo o vetor
        for (int i = 0; i < v.length - 1; i++) {
            // Loop interno: percorre o vetor a partir do início até o fim menos i
            // (já que após cada iteração do loop externo, o maior elemento já está na
            // posição correta)
            for (int j = 0; j < v.length - 1 - i; j++) {
                // Se o elemento atual é menor que o próximo, faz a troca de posição
                if (v[j] < v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }
}
