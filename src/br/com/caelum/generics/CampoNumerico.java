package br.com.caelum.generics;

public class CampoNumerico extends CampoDeTexto {

	public CampoNumerico(String texto) {
		super(texto);
	}

	public int getNumero() {
		int numero = 0;
		try {
			numero = Integer.parseInt(getTexto());
		} catch (NumberFormatException e) {

		}
		return numero;
	}

}
