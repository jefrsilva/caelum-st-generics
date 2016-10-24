package br.com.caelum.generics;

public class TestaValidador {
	public static void main(String[] args) {
		Formulario formulario = new Formulario();
		formulario.adiciona(new CampoDeTexto("Foca"));
		formulario.adiciona(new CampoDeTexto(""));
		formulario.adiciona(new CampoNumerico("5"));
		formulario.adiciona(new CampoNumerico(""));
		
		ValidadorNaoVazio validador = new ValidadorNaoVazio();
		// formulario.valida(validador);
		
		Formulario formulario2 = new Formulario();
		formulario2.adiciona(new CampoNumerico("5"));
		formulario2.adiciona(new CampoNumerico("-4"));
		
		ValidadorMaiorQueZero validadorNumerico = new ValidadorMaiorQueZero();
		// formulario2.valida(validadorNumerico);
	}
}
