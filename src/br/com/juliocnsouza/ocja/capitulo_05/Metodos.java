package br.com.juliocnsouza.ocja.capitulo_05;

import br.com.juliocnsouza.ocja.capitulo_03.Book;

public class Metodos {

	
	public void changeValues(Book livroPassado){
		livroPassado.setAnoPublicacao(2099);
		livroPassado.setAutor("Era uma vez");
		livroPassado.setTitulo("Opss");
	}
	
	public static void main(String[] args) {
		Metodos metodos = new Metodos();
		Book livro = new Book("Livro 1", "Soy Yo", 1990);
		System.out.println("Livro antes do metodo " + livro);
		metodos.changeValues(livro);
		System.out.println("Livro depois do metodo " + livro);
	}
	
}
