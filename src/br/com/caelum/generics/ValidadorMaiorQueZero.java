package br.com.caelum.generics;

public class ValidadorMaiorQueZero {
	public boolean valida(CampoNumerico campo) {
		System.out.println("Validando maior que zero: " + campo.getTexto());
		return campo.getNumero() > 0;
	}
}
