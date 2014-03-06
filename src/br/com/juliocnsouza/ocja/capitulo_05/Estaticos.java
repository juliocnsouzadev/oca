package br.com.juliocnsouza.ocja.capitulo_05;

import java.util.Random;

public class Estaticos {
	
	//variaveis de classe
	public static int numero;
	
	public static String texto;
	
	//constante
	public static final int NUMERO_DEFAULT = 10;
	
	//variavel instancia
	public int numeroInstancia;
	
	//metodos estatico ou de classe
	public static int getNumeroAleatorio(){
		return new Random().nextInt();
	}
	
	public static void mostrarDados(){
		//System.out.println("Numero instancia " + numeroInstancia); -> nao compila precisa ser acessado por um objeto
		System.out.println("\nNumero = " + numero + "\nTexto = " + texto);
	}
	
	//metodo de instancia
	public void alterarValores(){
		//metodos de instancia acessam variveis e metodos de classe (estaticos)
		texto = "Acessando variveis de classe atraves de metodos de instancia";
		numero = getNumeroAleatorio();
	}
	
	public static void main(String[] args) {
		numero = getNumeroAleatorio();
		texto = "Olá! Testando metodos e variveis de classe";
		mostrarDados();
		Estaticos estaticos = new Estaticos();
		estaticos.alterarValores();
		mostrarDados();
	}

}
