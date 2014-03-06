package br.com.juliocnsouza.ocja.capitulo_08;

public class Marcela extends Crianca implements Atleta {

	public Marcela(double altura, double peso) {
		super(altura, peso);
	}

	@Override
	public void estudar() {
		System.out.println("Estuda na Pré-Escola");
	}

	@Override
	public void praticarEsporte() {
		System.out.println("Faz natação");
	}

}
