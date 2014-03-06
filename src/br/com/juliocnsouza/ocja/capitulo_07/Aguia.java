package br.com.juliocnsouza.ocja.capitulo_07;

public class Aguia extends Carnivoro {

	public Aguia(String nome, double peso, int idade, String cor) {
		super(nome, peso, idade, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void descansar() {
		System.out.println("Descansa no ninho");
	}

	@Override
	public void mover() {
		System.out.println("Voa pelo céu");
	}

}
