package br.com.juliocnsouza.ocja.capitulo_02;

/**
 * 
 * @author juliocnsouza
 *
 */
public class ConditionalStatements {

	public static void main(String[] args) {

		// DECLARAÇÕES CONDICIONAIS OU CONDITIONAL STATEMENTS

		int i = 0;

		// IF
		if (i > 0) {
			System.out.println("i maior que 0");
		} else {
			System.out.println("i nao eh maior que 0");
		}

		// IF-THEN
		if (i > 0) {
			System.out.println("i maior que 0");
		} else if (i == 0) {
			System.out.println("i nao eh maior que 0");
		} else if (i > 20) {
			System.out.println("i maior que 20");
		}

		// IF-THEN-ELSE
		if (i > 0) {
			System.out.println("i maior que 0");
		} else if (i == 0) {
			System.out.println("i nao eh maior que 0");
		} else  {
			System.out.println("i maior que 20");
		}
		
		
		//SWITCH
	
		switch (i) {
		case 0:
			System.out.println("dentro do switch i foi encontrado com o valor 0");
			break;
		case 1:
			System.out.println("dentro do switch i foi encontrado com o valor 1");
			break;	
		case 2:
			System.out.println("dentro do switch i foi encontrado com o valor 3");
			break;	

		default:
			System.out.println("dentro do switch nao foi encontrado valor correspondido para i");
			break;
		}
		
		String str = "Olá";
		
		switch (str) {
		case "Tchau":
			System.out.println("Valor é um Tchau");
			break;

		default:
			System.out.println("Valor nao encontrado");
			break;
		}

	}

}
