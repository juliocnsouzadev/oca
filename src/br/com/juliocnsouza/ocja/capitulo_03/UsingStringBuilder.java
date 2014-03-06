package br.com.juliocnsouza.ocja.capitulo_03;

/**
 * 
 * @author juliocnsouza
 *
 */
public class UsingStringBuilder {

	public static void main(String[] args) {
		StringBuilder novaString = new StringBuilder("Hey! Ho! Let's go!");
		System.out.println(novaString);
		//append
		novaString.append(" ... ").append("i wanna be sedated");
		System.out.println(novaString);
		//insert
		novaString.insert(0, "Ramones \\m/ ... ");
		System.out.println(novaString);
		//delete
		int start = novaString.toString().indexOf("\\m/");
		novaString.delete(start, (start+4));
		System.out.println(novaString);
		//deleteCharAt
		novaString.insert(0, "!");
		System.out.println(novaString);
		novaString.deleteCharAt(0);
		System.out.println(novaString);
		//reverse
		novaString.reverse();
		System.out.println(novaString);
		novaString.reverse();
		System.out.println(novaString);
	}
	
}
