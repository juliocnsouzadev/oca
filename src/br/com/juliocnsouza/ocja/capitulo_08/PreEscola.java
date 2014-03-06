package br.com.juliocnsouza.ocja.capitulo_08;

import java.util.ArrayList;
import java.util.List;

public class PreEscola {

	private List<Crianca> criancas;

	public PreEscola() {
		criancas = new ArrayList<>();
	}

	public void matricular(Crianca crianca) {
		this.criancas.add(crianca);
	}

	public List<Crianca> getCriancas() {
		return criancas;
	}
	
	public void mostrarCriancas(){
		for (Crianca crianca : criancas) {
			System.out.println("\nAltura: " + crianca.getAltura());
			System.out.println("Peso: " + crianca.getPeso());
			crianca.andar();
			crianca.estudar();
		}
	}

}
