package br.com.juliocnsouza.ocja.capitulo_07;

import java.util.ArrayList;
import java.util.List;


public class Main {
	
	public static void main(String[] args) {
		List<Carnivoro> carnivoros = new ArrayList<>();
		carnivoros.add(new Tigre("Tigre", 200.6, 12, "Preto/Branco/Laranja"));
		carnivoros.add(new Aguia("Aguia", 2.7, 2, "Cinza/Branco"));
		System.out.println("Carnivoros");
		for (Carnivoro carnivoro : carnivoros) {
			carnivoro.mostraDadosBasicos();
		}
		
		System.out.println("Herbivoros");
		List<Herbivoro> herbivoros = new ArrayList<>();
		herbivoros.add(new Coelho("Coelho", 0.7, 1, "Branco"));
		herbivoros.add(new Gado("Boi", 300.8, 2, "Preto/Branco"));
		for (Herbivoro herbivoro : herbivoros) {
			herbivoro.mostraDadosBasicos();
		}
		
		System.out.println("Animais");
		List<Animal> animals = new ArrayList<>();
		animals.add(new Tigre("Tigre", 200.6, 12, "Preto/Branco/Laranja"));
		animals.add(new Coelho("Coelho", 0.7, 1, "Branco"));
		animals.add(new Aguia("Aguia", 2.7, 2, "Cinza/Branco"));
		animals.add(new Gado("Boi", 300.8, 2, "Preto/Branco"));
		
		for (Animal animal : animals) {
			animal.mostraDadosBasicos();
		}
		
		System.out.println("Todos que dados exibiveis - que implementam a interface");
		List<DadosExibiveis> todos = new ArrayList<>();
		todos.addAll(animals);
		for (DadosExibiveis dadosExibiveis : todos) {
			dadosExibiveis.mostraDadosBasicos();
		}
	}

}
