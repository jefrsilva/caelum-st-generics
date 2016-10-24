package br.com.caelum.generics;

import java.util.ArrayList;
import java.util.List;

public class Formulario<T> {
	private List<T> campos = new ArrayList<>();
	
	public void adiciona(T campo) {
		campos.add(campo);
	}
	
	public void copia(Formulario<T> formulario) {
		List<T> campos = formulario.getCampos();
		this.campos.addAll(campos);
	}
	
	private List<T> getCampos() {
		return campos;
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
