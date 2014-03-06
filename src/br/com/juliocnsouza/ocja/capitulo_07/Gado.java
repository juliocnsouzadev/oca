package br.com.juliocnsouza.ocja.capitulo_07;

public class Gado extends Herbivoro {

	public Gado(String nome, double peso, int idade, String cor) {
		super(nome, peso, idade, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void descansar() {
		System.out.println("Descansa no curral");
	}

	@Override
	public void mover() {
		System.out.println("Move-se devagar pelo pasto");
	}

}
