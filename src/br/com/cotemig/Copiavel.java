package br.com.cotemig;

public interface Copiavel<T> {
	public T copiar() throws CloneNotSupportedException;
}
