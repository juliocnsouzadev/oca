package br.com.juliocnsouza.ocja.capitulo_06;

import java.util.ArrayList;

public class TrabalhandoComArrayList {
	
	public enum Nomes{	
		JULIO("Julio"), MARILIA("Marília");
		String nome;
		Nomes(String nome){
			this.nome = nome;
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> nomesDigitados = new ArrayList<>();
		//adicionando
		nomesDigitados.add("Roberto");
		nomesDigitados.add(Nomes.JULIO.nome);
		//adicionando em um index especifico
		nomesDigitados.add(0,Nomes.MARILIA.nome);
		System.out.println(nomesDigitados + " size " + nomesDigitados.size());
		//removendo pelo indice
		String nomeRemovido = nomesDigitados.remove(0);
		System.out.println("Após remover " + nomeRemovido);
		System.out.println(nomesDigitados + " size " + nomesDigitados.size());
		
		System.out.println("\n");
		ArrayList<Nomes> nomesEnum = new ArrayList<>();
		nomesEnum.add(Nomes.JULIO);
		nomesEnum.add(Nomes.MARILIA);
		System.out.println(nomesEnum + " size " + nomesEnum.size());
		//removendo pelo objeto
		boolean removeu = nomesEnum.remove(Nomes.JULIO);
		System.out.println("Removeu " + Nomes.JULIO + "? : " + removeu );
		System.out.println(nomesEnum + " size " + nomesEnum.size());
		
	}

}
