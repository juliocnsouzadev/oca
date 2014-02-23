package br.com.juliocnsouza.ocja.capitulo_02;

/**
 * 
 * @author juliocnsouza
 * 
 */
public class TransferOfControlStatements {

	public static void main(String[] args) {
		
		
		
		// break
		for (int i = 0; i < 10; i++){
			System.out.println("Valor de i = " + i);
			if (i == 8){
				System.out.println("Valor de i = 8 vai sair do for");
				break;
			}
		}
		
		// continue
		System.out.println("\n\nContinue:\n");
		String[] nomes = {"Julio", "Jose", "Carlos", "Maria","Joao"};
		for (String nome : nomes) {
			if (!nome.startsWith("J")){
				System.out.println(nome + " Nao inicia com J vai para o proximo");
				continue;
			}
			System.out.println("Nome = " + nome);
		}
		
		// return
		System.out.println("\n\nReturn:\n");
		System.out.println("Numero aleatorio " + getRandomNumber());
		
		
		// label
		System.out.println("\n\nlabel:\n");
		
		forVarI :
		for (int i = 0; i < 10; i++){
			
			forVarJ :
			for (int j = 0; j < 10; j++){
				
				forVarZ :	
				for (int z = 0; z < 10; z++){
					if (z == 5) {
						System.out.println("Z = 5 pule para o próximo de Z");
						continue forVarZ;
					}
					if (z == 7 && j == 7) {
						System.out.println("Z = 7 e J = 7 pule para o próximo de J");
						continue forVarJ;
					}
					if (i == 2 && j == 2 && z == 2 ){
						System.out.println("i = " + i + " j = " + j + " z = " + z);
						System.out.println("dando um break e no for I");
						break forVarI;
					}
					System.out.println("i = " + i + " j = " + j + " z = " + z);
				}
			}
			
		}
		
	}
	
	// return
	public static double getRandomNumber(){
		double valor = 1 + (Math.random() * 100);
		if (valor <= 50) {
			return 500.34;
		}
		return valor;
	}

}
