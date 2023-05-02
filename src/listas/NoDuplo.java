package listas;

public class NoDuplo<T> {
	private T elemento;
	private NoDuplo<T> prox;
	private NoDuplo<T> anterior;

	public NoDuplo(T elemento) {
		this.elemento = (T) elemento;
		this.prox = null;
		this.anterior = null;

	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public NoDuplo<T> getProx() {
		return prox;
	}

	public void setProx(NoDuplo<T> prox) {
		this.prox = prox;
	}

	public NoDuplo<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(NoDuplo<T> anterior) {
		this.anterior = anterior;
	}
}
