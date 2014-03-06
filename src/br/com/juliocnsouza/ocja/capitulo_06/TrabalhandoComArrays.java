package br.com.juliocnsouza.ocja.capitulo_06;

import java.util.Random;

public class TrabalhandoComArrays {

	// array de uma dimensao
	int[] arrayDeInts1;
	// declarando e inicializando
	int[] arrayDeInts2 = { 10, 20, 20 };

	// arrays multidimesionais
	int[][] arrayBiDimensional1;
	// declarando e inicializando
	int[][] arrayBiDimensional2 = {{12, 14, 99}, {77, 90, 76}, {42, 24, 19} } ;

	public void inicializarArrayDeInts() {
		arrayDeInts1 = new int[3];
		for (int i = 0; i < arrayDeInts1.length; i++) {
			arrayDeInts1[i] = (int) ((Math.random()) * 100);
		}
	}

	public void inicializarArrayBiDimensional() {
		arrayBiDimensional1 = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arrayBiDimensional1[i][j] = (int) ((Math.random()) * 100);
			}
		}
	}

	public void mostrarArrayUmaDimensao(int[] array) {
		System.out.println("\n\nArray de 1 dimensao\n");
		for (int i : array) {
			System.out.print("\t" + i);
		}
	}
	
	public void mostrarArrayBiDimensional(int[][] array) {
		System.out.println("\n\nArray de 2 dimensoes");
		for (int i = 0; i < array.length; i++) {
			System.out.println("\n");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("\t" + array[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		TrabalhandoComArrays obj = new TrabalhandoComArrays();
		obj.inicializarArrayDeInts();
		obj.mostrarArrayUmaDimensao(obj.arrayDeInts1);
		obj.mostrarArrayUmaDimensao(obj.arrayDeInts2);
		
		// copiando dados do array 1 para o 2
		System.arraycopy(obj.arrayDeInts1, 0, obj.arrayDeInts2, 0,
				obj.arrayDeInts1.length);
		obj.mostrarArrayUmaDimensao(obj.arrayDeInts1);
		obj.mostrarArrayUmaDimensao(obj.arrayDeInts2);
		
		//mostrando array de 2 dimensoes
		obj.inicializarArrayBiDimensional();
		obj.mostrarArrayBiDimensional(obj.arrayBiDimensional1);
		obj.mostrarArrayBiDimensional(obj.arrayBiDimensional2);
	}

}
