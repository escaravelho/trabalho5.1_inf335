package br.unicamp.ic.inf335.beans.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.unicamp.ic.inf335.beans.AnuncianteBean;
import br.unicamp.ic.inf335.beans.AnuncioBean;
import br.unicamp.ic.inf335.beans.ProdutoBean;

public class AnucianteBeanTest {
	
	private AnuncianteBean anunciante;
	private AnuncioBean anuncio1;
	private AnuncioBean anuncio2;
	private AnuncioBean anuncio3;
	private AnuncioBean anuncio4;
	private AnuncioBean anuncio5;
	private ProdutoBean produto1;
	private ProdutoBean produto2;
	
	@Test
	@DisplayName("Testando a alteração e recuperação do nome do anunciante")
	public void testAlterarERecuperarNome() {
		AnuncianteBean anunciante = new AnuncianteBean();
		anunciante.setNome("Gustavo");
		Assertions.assertEquals("Gustavo", anunciante.getNome());
	}
	
	@Test
	@DisplayName("Testando a alteração e recuperação do documento do anunciante")
	public void testAlterarERecuperarCPF() {
		AnuncianteBean anunciante = new AnuncianteBean();
		anunciante.setCPF("337.337.048-98");
		Assertions.assertEquals("337.337.048-98", anunciante.getCPF());
	}
	
	@Test
	@DisplayName("Testando adicao de anuncios na lista de anuncios do anunciante")
	public void testAdicaoDeAnuncios() {
		
		AnuncianteBean anunciante = new AnuncianteBean();
		
		anuncio1 = new AnuncioBean();
		anuncio2 = new AnuncioBean();
		anuncio3 = new AnuncioBean();
		anuncio4 = new AnuncioBean();
		anuncio5 = new AnuncioBean();
		anunciante.addAnuncio(anuncio1);
		anunciante.addAnuncio(anuncio2);
		anunciante.addAnuncio(anuncio3);
		anunciante.addAnuncio(anuncio4);
		anunciante.addAnuncio(anuncio5);
		
		Assertions.assertEquals(5, anunciante.getAnuncios().size());
	}
	
	@Test
	@DisplayName("Testando remocao de anuncios da lista de anuncios do anunciante")
	public void testRemocaoDeAnuncios() {
		
		AnuncianteBean anunciante = new AnuncianteBean();
		
		anuncio1 = new AnuncioBean();
		anuncio2 = new AnuncioBean();
		anuncio3 = new AnuncioBean();
		anuncio4 = new AnuncioBean();
		anuncio5 = new AnuncioBean();
		anunciante.addAnuncio(anuncio1);
		anunciante.addAnuncio(anuncio2);
		anunciante.addAnuncio(anuncio3);
		anunciante.addAnuncio(anuncio4);
		anunciante.addAnuncio(anuncio5);
		
		anunciante.removeAnuncio(2);
		anunciante.removeAnuncio(3);
		
		Assertions.assertEquals(3, anunciante.getAnuncios().size());
	}
	
	@Test
	@DisplayName("Testando valor medio retornado com um produto")
	public void testValorMedioAnunciosComUmProduto() {
		
		anunciante = new AnuncianteBean();
		
		anuncio1 = new AnuncioBean();
		produto1 = new ProdutoBean();
		produto1.setValor(1000D);
		anuncio1.setProduto(produto1);
		anuncio1.setDesconto(0.1D);
		
		anunciante.addAnuncio(anuncio1);
		
		double resultado = anunciante.valorMedioAnuncios();
		Assertions.assertEquals(900, resultado);
	}

	
	@Test
	@DisplayName("Testando valor medio retornado com mais de um produto")
	public void testValorMedioAnunciosComMaisDeUmProduto() {
		
		anunciante = new AnuncianteBean();
		
		anuncio1 = new AnuncioBean();
		produto1 = new ProdutoBean();
		produto1.setValor(1000D);
		anuncio1.setProduto(produto1);
		anuncio1.setDesconto(0.0D);
		
		anuncio2 = new AnuncioBean();
		produto2 = new ProdutoBean();
		produto2.setValor(2000D);
		anuncio2.setProduto(produto2);
		anuncio2.setDesconto(0.1D);
		
		anunciante.addAnuncio(anuncio1);
		anunciante.addAnuncio(anuncio2);
		
		double resultado = anunciante.valorMedioAnuncios();
		Assertions.assertEquals(1400, resultado);
	}
}













