package br.com.juliocnsouza.ocja.capitulo_07;

public class Tigre extends Carnivoro {

	public Tigre(String nome, double peso, int idade, String cor) {
		super(nome, peso, idade, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void descansar() {
		System.out.println("Decansa na sombra depois que come");
	}

	@Override
	public void mover() {
		System.out.println("Move-se muito rápido");
	}

}
