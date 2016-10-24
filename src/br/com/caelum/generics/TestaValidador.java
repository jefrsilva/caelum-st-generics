package br.com.caelum.generics;

public class TestaValidador {
	public static void main(String[] args) {
		ValidadorNaoVazio validador = new ValidadorNaoVazio();
		System.out.println(validador.valida(new CampoDeTexto("Foca")));
		System.out.println(validador.valida(new CampoDeTexto("")));
		System.out.println(validador.valida(new CampoNumerico("5")));
		System.out.println(validador.valida(new CampoNumerico("")));
		
		ValidadorMaiorQueZero validadorNumerico = new ValidadorMaiorQueZero();
		System.out.println(validadorNumerico.valida(new CampoNumerico("5")));
		System.out.println(validadorNumerico.valida(new CampoNumerico("-4")));
	}
}
