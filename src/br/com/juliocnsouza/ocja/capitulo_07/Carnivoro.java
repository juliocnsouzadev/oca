package br.com.juliocnsouza.ocja.capitulo_07;

public abstract class Carnivoro extends Animal {

	public Carnivoro(String nome, double peso, int idade, String cor) {
		super(nome, peso, idade, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comer(){
		System.out.println("Come carne");
	}
	
}
