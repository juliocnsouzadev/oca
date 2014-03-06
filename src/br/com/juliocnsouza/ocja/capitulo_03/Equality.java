package br.com.juliocnsouza.ocja.capitulo_03;

/**
 * 
 * @author juliocnsouza
 *
 */
public class Equality {

	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		int c = 1;
		System.out.println("a é igual a b? " + (a == b));
		System.out.println("a é igual a c? " + (a == c));
		
		String strA = "A";
		String strA2 = new String("A");
		String strA3 = strA;
		System.out.println("\nstrA tem a mesma referencia de strA2? " + (strA == strA2));
		System.out.println("strA tem a mesma referencia de strA3? " + (strA == strA3));
		System.out.println("straA é igual a strA2? " + (strA.equals(strA2)));
		System.out.println("straA2 é igual a strA3? " + (strA2.equals(strA3)));
		System.out.println("straA é igual a strA2? " + (strA.compareTo(strA2)));
		System.out.println("straA2 é igual a strA3? " + (strA2.compareTo(strA3)));
		
		Integer numA = 1;
		Integer numA2 = new Integer(1);
		Integer numA3 = numA;
		System.out.println("\nnumA tem a mesma referencia de numA2? " + (numA == numA2));
		System.out.println("numA tem a mesma referencia de numA3? " + (numA == numA3));
		System.out.println("numA é igual a numA2? " + (numA.equals(numA2)));
		System.out.println("numA é igual a numA3? " + (numA.equals(numA3)));
		System.out.println("numA é igual a numA2? " + (numA.compareTo(numA2)));
		System.out.println("numA é igual a numA3? " + (numA.compareTo(numA3)));
	}
	
}
