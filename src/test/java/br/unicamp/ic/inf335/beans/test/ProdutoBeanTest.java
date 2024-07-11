package br.unicamp.ic.inf335.beans.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.unicamp.ic.inf335.beans.ProdutoBean;

public class ProdutoBeanTest {
	
	@Test
	@DisplayName("Testando a alteração e recuperação do código de produto")
	public void testAlterarERecuperarCodigo() {
		ProdutoBean produto1 = new ProdutoBean();
		produto1.setCodigo("COD145");
		Assertions.assertEquals("COD145", produto1.getCodigo());
	}
	
	@Test
	@DisplayName("Testando a alteração e recuperação do nome do produto")
	public void testAlterarERecuperarNome() {
		ProdutoBean produto1 = new ProdutoBean();
		produto1.setNome("Notebook Lenovo");
		Assertions.assertEquals("Notebook Lenovo", produto1.getNome());
	}
	
	@DisplayName("Testando a alteração e recuperação da descrição do produto")
	public void testAlterarERecuperarDescricao() {
		ProdutoBean produto1 = new ProdutoBean();
		produto1.setDescricao("Notebook Lenovo pouco utilizado e com 6 meses de uso.");
		Assertions.assertEquals("Notebook Lenovo pouco utilizado e com 6 meses de uso.", produto1.getDescricao());
	}
	
	@DisplayName("Testando a alteração e recuperação do valor do produto")
	public void testAlterarERecuperarValor() {
		ProdutoBean produto1 = new ProdutoBean();
		produto1.setValor(2.500D);
		Assertions.assertEquals(2.500D, produto1.getValor());
	}
	
	@DisplayName("")
	public void testAlterarERecuperarEstado() {
		ProdutoBean produto1 = new ProdutoBean();
		produto1.setEstado("Usado");
		Assertions.assertEquals("Usado", produto1.getEstado());
	}
	
	@Test
	@DisplayName("Testando se o produto1 é maior que o produto 2")
	public void testCompareToComProduto1ComValorMaiorQueOProduto2() {
		ProdutoBean produto1 = new ProdutoBean();
		ProdutoBean produto2 = new ProdutoBean();
		
		produto1.setValor(150D);
		produto2.setValor(100D);
		double resultado = produto1.compareTo(produto2);
		
		Assertions.assertEquals(resultado, 1);
	}
	
	@Test
	@DisplayName("Testando se o produto1 é menor que o produto 2")
	public void testCompareToComProduto1ComValorMenorQueOProduto2() {
		ProdutoBean produto1 = new ProdutoBean();
		ProdutoBean produto2 = new ProdutoBean();
		
		produto1.setValor(10D);
		produto2.setValor(100D);
		double resultado = produto1.compareTo(produto2);
		
		Assertions.assertEquals(resultado, -1);
	}

	@Test
	@DisplayName("Testando se o produto1 é igual ao produto 2")
	public void testCompareToComProduto1ComValorIgualOProduto2() {
		ProdutoBean produto1 = new ProdutoBean();
		ProdutoBean produto2 = new ProdutoBean();
		
		produto1.setValor(100D);
		produto2.setValor(100D);
		double resultado = produto1.compareTo(produto2);
		
		Assertions.assertEquals(resultado, 0);
	}
}
