package br.com.juliocnsouza.ocja.capitulo_02;

/**
 * 
 * @author juliocnsouza
 * 
 */
public class LoopIterationStatements {

	public static void main(String[] args) {

		String[] nomes = {"Julio", "Carlos", "Maria"};
		
		// for (int i = 0; i < 10; i ++) -> for comum
		for (int i = 0 ; i < 10; i++){
			System.out.println("Valor de i : " + i);
		}
		for (int i = 0; i < nomes.length ; i++){
			System.out.println("Nome em " + i + " = " + nomes[i]);
		}		
		
		// for (Object obj : objects) -> Melhorado, foreach
		for (String nome : nomes){
			System.out.println("Nome dentro do foreach " + nome);
		}
		
		// while
		int w = 10;
		while (w > 0){
			System.out.println("Valor de w " + w);
			w--;
		}
		
		// do-while
		int dw = 10;
		do {
			System.out.println("Dentro do do-while valor =  " + dw );
			if (dw == 10){
				dw = 0;
			}
			dw++;
		} while (dw < 5);
		
		

	}

}
