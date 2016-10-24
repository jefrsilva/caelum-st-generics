package br.com.caelum.generics;

import java.util.ArrayList;
import java.util.List;

public class Formulario {
	private List<CampoDeTexto> campos = new ArrayList<>();
	
	public void adiciona(CampoDeTexto campo) {
		campos.add(campo);
	}
}
