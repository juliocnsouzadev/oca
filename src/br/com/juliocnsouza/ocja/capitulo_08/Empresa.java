package br.com.juliocnsouza.ocja.capitulo_08;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private List<Adulto> colaboradores;

	public Empresa() {
		colaboradores = new ArrayList<>();
	}

	public void contratar(Adulto adulto) {
		this.colaboradores.add(adulto);
	}

	public List<Adulto> getColaboradores() {
		return colaboradores;
	}
	
	public void mostrarColaboradores(){
		for (Adulto colaborador : colaboradores) {
			System.out.println("\nAltura: " + colaborador.getAltura());
			System.out.println("Peso: " + colaborador.getPeso());
			colaborador.andar();
			colaborador.trabalhar();
		}
	}

}
