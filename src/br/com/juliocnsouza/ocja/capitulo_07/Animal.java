package br.com.juliocnsouza.ocja.capitulo_07;

public abstract class Animal implements DadosExibiveis {
	
	
	private String nome;
	private double peso;
	private int idade;
	private String cor;
	
	public Animal(String nome, double peso, int idade, String cor) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.idade = idade;
		this.cor = cor;
	}

	
	
	public abstract void comer();
	
	public abstract void descansar();
	
	public abstract void mover();
	
	@Override
	public void mostraDadosBasicos(){
		System.out.println("\nNome: " + nome + 
				"\nPeso: " + peso + 
				"\nIdade: " + idade + 
				"\nCor: " + cor);
		comer();
		descansar();
		mover();
		System.out.println("\tSuper Class: " + this.getClass().getSuperclass().getSimpleName() + "\n");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
		
}
