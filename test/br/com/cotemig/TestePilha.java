/**
 * 
 */
package br.com.cotemig;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author andresulivam
 *
 */
public class TestePilha {

	@Test
	public void testPovoarPilha() {
		Pilha<String> p = PovoadorPilha.povoarPilhaString(20);
		Assert.assertEquals(20, p.size(), 0);
	}
	
	@Test
	public void testRemover() {
		Pilha<String> p = PovoadorPilha.newPilhaString(5);
		p.adicionar("Nova palavra");
		
		String remover = p.remover();
		Assert.assertEquals(remover, "Nova palavra");
	}
	
	@Test
	public void testCopiar() throws CloneNotSupportedException {
		Pilha<String> p = PovoadorPilha.newPilhaString(5);
		
		Pilha<String> p2 = p.copiar();
		
		Assert.assertEquals(p, p2);
	}
	
	@Test
	public void testSizeZero() {
		Pilha<String> p = PovoadorPilha.newPilhaString(0);
		String remover = p.remover();
		Assert.assertEquals(remover, null);
	}

}
