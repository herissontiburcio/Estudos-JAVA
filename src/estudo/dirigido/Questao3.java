package estudo.dirigido;

public class Questao3 {

	public static void main(String[] args) {
//		Altere as questões anteriores para utilizar o método recursivo

		int[] vetor = { 7, 6, 3, 4, 5 };
		int resultado = 0;

		resultado = somar(vetor, 0);

		System.out.println("Total : " + resultado);

	}

	public static int somar(int vetor[], int i) {
		if (i < vetor.length)
			return vetor[i] + somar(vetor, i + 1);
		else
			return 0;
	}

}
