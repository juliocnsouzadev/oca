package br.com.juliocnsouza.ocja.capitulo_03;

/**
 * 
 * @author juliocnsouza
 * 
 */
public class UsingStrings {

	public static void main(String[] args) {
		// contatenação
		String nome = "Julio";
		String sobrenome = "Souza";
		String espaco = " ";
		System.out.println(nome + espaco + sobrenome);
		double numberOne = 0.123232;
		double numberTwo = 1.223434;
		System.out.println(numberOne + numberTwo + espaco
				+ "somou os valores e concateou com o texto");
		System.out.println(espaco + numberOne + numberTwo
				+ " concatenou apenas");
		Book livro = new Book("Um livro qualquer", "Jaspion Jiraya", 1995);
		System.out.println(livro);
		// metodos
		String message = " Uma boa prova e boa sorte a todos! ";
		// charAt
		System.out.println("O char na posição 2 da mensagem é : "
				+ message.charAt(2));
		for (int i = 0; i < message.length(); i++) {
			System.out.println("Mostrando char na posição " + i + " : "
					+ message.charAt(i));
		}
		// indexOf
		System.out
				.println("Mostrando o index onde encontra-se a letra o pela primeira vez: "
						+ message.indexOf('o'));
		System.out
				.println("Mostrando o index onde encontra-se a letra o pela primeira vez a partir da posição 6: "
						+ message.indexOf('o', 6));
		System.out
				.println("Mostrando o index onde encontra-se a palavra sorte: "
						+ message.indexOf("sorte"));
		System.out.println("Mostrando o index onde encontra-se a palavra boa: "
				+ message.indexOf("boa"));
		System.out
				.println("Mostrando o index onde encontra-se a palavra boa apos posicao 5: "
						+ message.indexOf("boa", 5));
		// replace
		System.out.println("Substituindo boa por good: "
				+ message.replace("boa", "good"));
		// startsWith e endsWith
		System.out.println("A mensagem começa com um espaço em branco? "
				+ message.startsWith(espaco));
		System.out.println("A mensagem termina com um \'!\'? "
				+ message.endsWith("!"));
		// substring
		System.out.println("O texto que se encontra em as posições 5 e 20 é : "
				+ message.substring(5, 20));
		//chaning
		String novaMensagem = message.trim().replace("boa", "good").replace("sorte", "luck").concat(" - ").concat(nome);
		System.out.println(novaMensagem);
	}

}
