package br.com.caelum.generics;

public class TestaValidador {
	public static void main(String[] args) {
		ValidadorNaoVazio validador = new ValidadorNaoVazio();
		System.out.println(validador.valida(new CampoDeTexto("Foca")));
		System.out.println(validador.valida(new CampoDeTexto("")));
	}
}
