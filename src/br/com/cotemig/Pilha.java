/**
 * 
 */
package br.com.cotemig;

import java.util.LinkedList;

/**
 * @author andresulivam
 *
 */
public class Pilha<T> extends LinkedList<T> implements TipoAbstratoDados<T>, Copiavel<Pilha> {

	private int tamanho;
	
	public Pilha(int tamanho) {
		// TODO Auto-generated constructor stub
		this.tamanho = tamanho;
	}

	@Override
	public Pilha<T> copiar() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Pilha<T> p = new Pilha<>(this.tamanho);
		p = (Pilha<T>) this.clone();
		return p;
	}

	@Override
	public void adicionar(T object) {
		// TODO Auto-generated method stub
		if(this.size() < this.tamanho){
			this.add(object);
		}
	}

	@Override
	public T remover() {
		// TODO Auto-generated method stub
		T result = null;
		if(this.size() > 0){
			result = this.removeLast();
		}
		return result;
	}

}
