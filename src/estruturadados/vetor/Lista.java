package estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {

	// Definindo o tipo do vetor dinamicamente

	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;

	}

	/*
	 * public void adiciona(String elemento) { for(int i=0; i<this.elementos.length;
	 * i++) { if(this.elementos[i] == null) { this.elementos[i] = elemento; break; }
	 * } }
	 */

	/*
	 * public void adiciona(String elemento) throws Exception {
	 * 
	 * if (this.tamanho < this.elementos.length) { this.elementos[this.tamanho] =
	 * elemento; this.tamanho++; } else { throw new
	 * Exception("Vetor já está cheio, não é possível adicionar mais elementos"); }
	 * 
	 * }
	 */

	// Adicionar elemento no final do vetor
	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();

		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;

	}

	// 0 1 2 3 4 5 6 = tamanho é 5
	// B C E F G + +

	// Add elemento em qualquer posição
	public boolean adiciona(int posicao, T elemento) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");

		}

		this.aumentaCapacidade();

		// mover todos os elementos
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}

		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;

	}

	// Aumentar capacidade do vetor
	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	// Exer04 método obtém (get)
	public T obtem(int posicao) {
		return this.busca(posicao);
	}

	// Obter elemento de uma posição
	public T busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");

		}
		return this.elementos[posicao];
	}

	// Verificar se elemento existe
	public int busca(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	// Exer02 método último indice
	public int ultimoIndice(T elemento) {
		
		for (int i = this.tamanho-1; i >= 0; i--) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	// Exer01 método contém
	public boolean contem(T elemento) {
		
		/*int pos = busca(elemento);
		 if (pos > -1) {
			 return true;
		 }
		 
		 return false;*/
		  
		 
		return busca(elemento) > -1; //>=0
	}
	// B G D E F -> posição a ser removida é 1 (G)
	// 0 1 2 3 4 -> tamanho é 5
	// vetor[1] = vetor[2]
	// vetor[2] = vetor[3]
	// vetor[3] = vetor[4]

	// Remover elemento do vetor
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");

		}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;

	}
	
	// Exer03 método remove elemento
	public void remove(T elemento) {
		int pos = this.busca(elemento);
		if(pos > -1) {
			this.remove(pos);
		}
	}
	
	//Exer05 remover todos os elementos (clear)
	public void limpar() {
		
		//opção 1
		//this.elementos = (T []) new Object[this.elementos.length];
		
		//opção 2
		//this.tamanho = 0;
		
		//opção 3
		this.tamanho = 0;
		for(int i = 0; i < this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}

	// Tamanho e imprimir elementos
	public int tamanho() {
		return this.tamanho;

	}

	// Tamanho e imprimir elementos
	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}

}
