package listas;

public class ListaDupEnc<T extends Comparable<T>> extends Lista<T> {
	private NoDuplo inicio;
	private NoDuplo fim;
	private int tamanho;

	public ListaDupEnc() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}

	public NoDuplo getInicio() {
		return inicio;
	}

	public NoDuplo getFim() {
		return fim;
	}

	@Override
	public void incluir(T elemento) throws Exception {
		NoDuplo<T> novoElemento = new NoDuplo<>(elemento);
		if (this.tamanho == 0) {
			this.inicio = novoElemento;
			this.fim = novoElemento;
		} else {
			NoDuplo aux = fim;
			this.fim = novoElemento;
			novoElemento.setAnterior(aux);
			novoElemento.setProx(aux.getProx());
			aux.setProx(novoElemento);

		}
		this.tamanho++;
	}

	@Override
	public void incluirInicio(T elemento) throws Exception {
		NoDuplo<T> novoElemento = new NoDuplo<>(elemento);

		if (this.tamanho == 0) {
			this.inicio = novoElemento;
			this.fim = novoElemento;
		} else {
			this.inicio.setAnterior(novoElemento);
			novoElemento.setProx(inicio);
			this.inicio = novoElemento;
		}

	}

	@Override
	public void incluir(T elemento, int posicao) throws Exception {
		NoDuplo<T> novoElemento = new NoDuplo<T>(elemento);

		if (posicao < 0) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		if (posicao == 0) {
			incluirInicio(elemento);
		} else if (posicao == this.tamanho) {
			novoElemento.setAnterior(fim);
			fim.setProx(novoElemento);
			fim = novoElemento;
			this.tamanho++;
		} else {
			NoDuplo aux = inicio;
			for (int i = 0; i < posicao - 1; i++) {
				aux = aux.getProx();
			}
			novoElemento.setAnterior(aux);
			novoElemento.setProx(aux.getProx());
			aux.setProx(novoElemento);
			novoElemento.getProx().setAnterior(novoElemento);
			this.tamanho++;
		}

	}

	@Override
	public T get(int posicao) throws Exception {
		NoDuplo atual = inicio;
		NoDuplo elemento = null;
		if (this.tamanho == 0) {
			throw new IllegalAccessException("Lista vazia!");
		}
		for (int i = 0; i < this.tamanho; i++) {
			if (i == posicao) {
				elemento = atual;
				break;
			}
			atual = atual.getProx();
		}
		return (T) elemento.getElemento();
	}

	@Override
	public int getPosElemento(T elemento) throws Exception {
		int contador = 0;
		NoDuplo aux = inicio;
		if (this.tamanho == 0) {
			throw new IllegalArgumentException("Lista vazia!");
		}
		while (aux != null) {
			if (aux.getElemento().equals(elemento)) {
				return contador;
			}
			aux = aux.getProx();
			contador++;
		}
		return -1;
	}

	@Override
	public void remover(int posicao) throws Exception {
		if (posicao < 0 || posicao > this.tamanho) {
			throw new Exception("Posicao invalida!");
		}
		if (posicao == 0) {
			this.inicio = inicio.getProx();
		} else {
			if (posicao == this.tamanho) {
				NoDuplo penultimo = fim.getAnterior();
				penultimo.setProx(null);
			} else {
				NoDuplo aux = inicio;
				for (int i = 0; i < posicao; i++) {
					aux = aux.getProx();
				}
				if (aux.getAnterior() != null) {
					aux.getAnterior().setProx(aux.getProx());
				}
				if (aux.getProx() != null) {
					aux.getProx().setAnterior(aux.getAnterior());
				}

			}
		}
		this.tamanho--;

	}

	@Override
	public void limpar() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
		System.out.println("Lista Limpa com sucesso!");
	}

	@Override
	public int getTamanho() {
		return this.tamanho;
	}

	@Override
	public boolean contem(T elemento) throws Exception {
		NoDuplo aux = inicio;
		if (this.tamanho == 0) {
			throw new IllegalArgumentException("Lista vazia!");
		}
		while (aux != null) {
			if (aux.getElemento().equals(elemento)) {
				return true;
			}
			aux = aux.getProx();
		}
		return false;

	}
}