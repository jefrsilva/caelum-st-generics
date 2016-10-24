package br.com.caelum.generics;

public class ValidadorNaoVazio {
	public boolean valida(CampoDeTexto campo) {
		System.out.println("Validando não vazio: " + campo.getTexto());
		return !campo.getTexto().isEmpty();
	}
}
