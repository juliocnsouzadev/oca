package br.com.juliocnsouza.ocja.capitulo_08;

import java.util.ArrayList;
import java.util.List;

public class CentroEsportes {

	private List<Atleta> atletas;

	public CentroEsportes() {
		atletas = new ArrayList<>();
	}

	public void admitir(Atleta atleta) {
		this.atletas.add(atleta);
	}

	public List<Atleta> getAtletas() {
		return atletas;
	}

}
