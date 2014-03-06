package br.com.juliocnsouza.ocja.capitulo_08;

public abstract class Humano {
	
	private double altura;
	private double peso;
	
	public Humano(double altura, double peso) {
		super();
		this.altura = altura;
		this.peso = peso;
	}

	public void andar(){
		System.out.println("Anda ereto");
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
