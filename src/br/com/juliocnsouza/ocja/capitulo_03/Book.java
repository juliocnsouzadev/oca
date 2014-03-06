package br.com.juliocnsouza.ocja.capitulo_03;

/**
 * 
 * @author juliocnsouza
 * 
 */
public class Book {

	private String titulo;
	private String autor;
	private int anoPublicacao;

	public Book(String titulo, String autor, int anoPublicacao) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	@Override
	public String toString() {
		return "Dados do livro:\n\tTítulo: " + titulo + "\n\tAutor " + autor
				+ "\n\tPublicado em: " + anoPublicacao;
	}

}
