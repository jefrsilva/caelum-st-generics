package br.com.caelum.generics;

import java.util.ArrayList;
import java.util.List;

public class Formulario<T> {
	private List<T> campos = new ArrayList<>();
	
	public void adiciona(T campo) {
		campos.add(campo);
	}
	
	public boolean valida(Validador<? super T> validador) {
		for (T campo : campos) {
			if (!validador.valida(campo)) {
				return false;
			}
		}
		return true;
	}
}
