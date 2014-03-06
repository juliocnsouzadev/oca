package br.com.juliocnsouza.ocja.capitulo_08;

public abstract class Crianca extends Humano{
	
	public Crianca(double altura, double peso) {
		super(altura, peso);
	}

	@Override
	public void andar(){
		System.out.println("Passa mais tempo correndo do que andando");
	}
	
	public abstract void estudar();

}
