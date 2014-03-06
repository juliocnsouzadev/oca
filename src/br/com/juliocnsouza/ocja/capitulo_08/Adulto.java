package br.com.juliocnsouza.ocja.capitulo_08;

public abstract class Adulto extends Humano {
	

	public Adulto(double altura, double peso, boolean casado) {
		super(altura, peso);
		this.casado = casado;
	}

	private boolean casado;

	public abstract void trabalhar();

	public boolean isCasado() {
		return casado;
	}

	@Override
	public void andar(){
		System.out.println("Anda ereto e confiante");
	}
	
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	

}
