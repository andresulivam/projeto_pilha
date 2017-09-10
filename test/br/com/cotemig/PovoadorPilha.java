/**
 * 
 */
package br.com.cotemig;

/**
 * @author andresulivam
 *
 */
public class PovoadorPilha {
	static int cont = 1;
	
	public static Pilha<String> newPilhaString(int tamanho) {
		Pilha<String> pilha = new Pilha<String>(tamanho);
		cont++;
		return pilha;
	}

	public static Pilha<String> povoarPilhaString(int tamanho) {
		Pilha<String> pilha = new Pilha<String>(tamanho);
		int cont_palavras = 1;
		for(int i = 0; i < 30; i++){
			pilha.adicionar("Palavra "+cont_palavras);
			cont_palavras++;
		}
		cont++;
		return pilha;
	}
}
