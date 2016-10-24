package br.com.caelum.generics;

import java.util.ArrayList;
import java.util.List;

public class Formulario {
	private List<CampoDeTexto> campos = new ArrayList<>();
	
	public void adiciona(CampoDeTexto campo) {
		campos.add(campo);
	}
	
	public boolean valida(Validador validador) {
		for (CampoDeTexto campo : campos) {
			if (!validador.valida(campo)) {
				return false;
			}
		}
		return true;
	}
}
