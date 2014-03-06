package br.com.juliocnsouza.ocja.capitulo_08;

public class Julio extends Adulto implements Atleta{

	public Julio(double altura, double peso, boolean casado) {
		super(altura, peso, casado);
	}

	@Override
	public void trabalhar() {
		System.out.println("Trabalha como programador");
	}

	@Override
	public void praticarEsporte() {
		System.out.println("Joga futebol");
	}

}
