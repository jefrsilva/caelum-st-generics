package br.com.caelum.generics;

public class TestaValidador {
	public static void main(String[] args) {
		Formulario<CampoDeTexto> formulario = new Formulario<>();
		formulario.adiciona(new CampoDeTexto("Foca"));
		formulario.adiciona(new CampoDeTexto(""));
		formulario.adiciona(new CampoNumerico("5"));
		formulario.adiciona(new CampoNumerico(""));
		
		Validador<CampoDeTexto> validador = new ValidadorNaoVazio();
		System.out.println(formulario.valida(validador));
		
		Formulario<CampoNumerico> formulario2 = new Formulario<>();
		formulario2.adiciona(new CampoNumerico("5"));
		formulario2.adiciona(new CampoNumerico("-4"));
				
		Validador<CampoNumerico> validadorNumerico = new ValidadorMaiorQueZero();
		System.out.println(formulario2.valida(validador));
		System.out.println(formulario2.valida(validadorNumerico));
	}
}
