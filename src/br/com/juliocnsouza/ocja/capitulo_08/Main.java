package br.com.juliocnsouza.ocja.capitulo_08;

public class Main {

	public static void mostrarAndar(String msg, Humano humano) {
		System.out.println("\n" + msg);
		humano.andar();
	}

	public static void main(String[] args) {
		// marcela é uma humana
		Humano marcela = new Marcela(1.20, 27.00);
		mostrarAndar("Marcela andando com humano", marcela);
		// julio é um humano
		Humano julio = new Julio(1.7, 74.6, true);
		mostrarAndar("Julio andando com humano", julio);
		// julio é um adulto
		Adulto adulto = new Julio(1.7, 74.6, true);
		mostrarAndar("Julio andando com adulto", adulto);
		// marcela é uma crianca
		Crianca crianca = new Marcela(1.20, 27.00);
		mostrarAndar("Marcela andando com crianca", marcela);
		// julio e marcela são altletas
		Atleta atleta1 = new Julio(1.7, 74.6, true);
		Atleta atleta2 = new Marcela(1.20, 27.00);

		Julio julioMesmo = new Julio(1.7, 74.6, true);
		Marcela marcelaMesmo = new Marcela(1.20, 27.00);

		// pre escola matriculam apenas criancas
		PreEscola escola = new PreEscola();
		escola.matricular(crianca);
		escola.matricular(marcelaMesmo);
		// fazendo casting - isso soh vai funcionar pq marcela é uma instancia
		// de Marcela que herda de Crianca
		escola.matricular((Crianca) marcela);
		escola.mostrarCriancas();

		// empresa apenas contratam adultos
		Empresa empresa = new Empresa();
		empresa.contratar(adulto);
		empresa.contratar(julioMesmo);
		// fazendo casting - isso soh vai funcionar pq julio é uma instancia
		// de Julio que herda de Adulto
		empresa.contratar((Adulto) julio);
		empresa.mostrarColaboradores();

		// centro de esporte admitem atletas
		CentroEsportes centroEsportes = new CentroEsportes();
		centroEsportes.admitir(atleta1);
		centroEsportes.admitir(atleta2);
		centroEsportes.admitir(marcelaMesmo);
		centroEsportes.admitir(julioMesmo);

	}

}
