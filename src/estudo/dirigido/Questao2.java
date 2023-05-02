package estudo.dirigido;

public class Questao2 {

	public static void main(String[] args) {
//		Faça um programa para informar qual o valor da soma dos valores de um vetor de 
//		inteiros, utilizando o modo iterativo.

		int[] vetor = { 7, 6, 3, 4, 5 };
		int soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		System.out.println("Total : " + soma);

	}

}
