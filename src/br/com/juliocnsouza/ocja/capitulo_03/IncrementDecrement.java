package br.com.juliocnsouza.ocja.capitulo_03;

/**
 * 
 * @author juliocnsouza
 *
 */
public class IncrementDecrement {

		public static void main(String[] args) {
			
			int a = 1;
			int b = ++a;
			//prefix increment
			System.out.println("a = " + a + " b = " + b);
			//postfix increment
			int c = 2;
			int d = c++;
			System.out.println("c = " + c + " d = " + d);
			
		}
	
}
