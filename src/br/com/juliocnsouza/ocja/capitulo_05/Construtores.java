package br.com.juliocnsouza.ocja.capitulo_05;

public class Construtores extends Mae{
	
	private String nome;
	private int idade;
	
	//construtor default sem argumentos - similar ao gerado pela JVM
	public Construtores(){
		super();
	}

	// construtor com argumentos
	public Construtores(String nome, int idade, String nomeMae) {
		super(nomeMae);
		this.nome = nome;
		this.idade = idade;
	}
	
	// outro construtor com argumentos
	public Construtores(String nome) {
		super();
		this.nome = nome;
		this.idade = 60;
	}
	
	
	
}
