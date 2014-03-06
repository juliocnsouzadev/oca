package br.com.juliocnsouza.ocja.capitulo_07;

public class Coelho extends Herbivoro {

	public Coelho(String nome, double peso, int idade, String cor) {
		super(nome, peso, idade, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void descansar() {
		System.out.println("Descansa na toca");
	}

	@Override
	public void mover() {
		System.out.println("Corre bem rápido");
	}

}
