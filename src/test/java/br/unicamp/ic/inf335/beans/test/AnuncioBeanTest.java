package br.unicamp.ic.inf335.beans.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.unicamp.ic.inf335.beans.AnuncioBean;
import br.unicamp.ic.inf335.beans.ProdutoBean;

public class AnuncioBeanTest {
	
	@Test
	@DisplayName("Testando a alteração e recuperação do produto")
	public void testAlterarERecuperarProduto() {
		AnuncioBean anuncio = new AnuncioBean();
		ProdutoBean produto = new ProdutoBean();
		anuncio.setProduto(produto);
		Assertions.assertEquals(produto, anuncio.getProduto());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	@DisplayName("Testando a alteração e recuperação da lista de urls de anuncios")
	public void testAlterarERecuperarListaDeURLs() throws MalformedURLException {
		AnuncioBean anuncio = new AnuncioBean();
		ProdutoBean produto = new ProdutoBean();
		anuncio.setProduto(produto);
		URL url1 = new URL("http://example.com/pages/");
		URL url2 = new URL("http://example.com/pages/");
		ArrayList<URL> urls = new ArrayList<URL>(Arrays.asList(url1, url2)) ;
		anuncio.setFotosUrl(urls);
		Assertions.assertEquals(2, anuncio.getFotosUrl().size());
	}
	
	@Test
	@DisplayName("Testando pegar o valor do anuncio sem desconto")
	public void testGetValorComDesconto() {
		AnuncioBean anuncio = new AnuncioBean();
		ProdutoBean produto = new ProdutoBean();
		produto.setValor(1000D);
		anuncio.setDesconto(0.01D);
		anuncio.setProduto(produto);
		
		double resultado = anuncio.getValor();
		Assertions.assertEquals(990, resultado);
	}
	
	@Test
	@DisplayName("Testando pegar o valor do anuncio com desconto")
	public void testGetValorSemDesconto() {
		AnuncioBean anuncio = new AnuncioBean();
		ProdutoBean produto = new ProdutoBean();
		produto.setValor(1000D);
		anuncio.setDesconto(0.0D);
		anuncio.setProduto(produto);
		
		double resultado = anuncio.getValor();
		Assertions.assertEquals(1000D, resultado);
	}
}
