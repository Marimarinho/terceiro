
public class Main {

	public static void main(String[] args) {
		//Música
		Musica m = new Musica();
		m.Nome = "S91";
		m.artista = "Karol G";
		m.ano = 2023;
		m.duracao = 2.53;
		
		System.out.println("Música: " + m.Nome);
		System.out.println("Artista: " + m.artista);
		System.out.println("Ano: " + m.ano);
		System.out.println("Duração: " + m.duracao);
		
		//Livros
		Livros l = new Livros();
		l.Titulo = "Shadow and Bone";
		l.autor = "Leigh Bardugo";
		l.paginas = 368;
		l.ano = 2012;
		l.genero = "Fantasia";
		
		System.out.println("Titulo: " + l.Titulo);
		System.out.println("Autor: " + l.autor);
		System.out.println("Número de Páginas: " + l.paginas);
		System.out.println("Publicação: " + l.ano);
		System.out.println("Genêro: " + l.genero);
		
		//Filme
		Filme f = new Filme();
		f.titulo = "Underworld";
		f.streaming = "PrimeVideo";
		f.ano = 2003;
		
		System.out.println("Titulo: " + f.titulo);
		System.out.println("Streaming: " + f.streaming);
		System.out.println("Ano: " + f.ano);
		
		//Esporte
		Esporte e = new Esporte();
		e.Nome = "Basquete";
		e.numJogadores = 12 ;
		e.origem = "Canadá";
		
		System.out.println("Nome: " + e.Nome);
		System.out.println("Númro de Jogadores: " + e.numJogadores);
		System.out.println("Origem: " + e.origem);
		
		Signo s = new Signo();
		s.Nome = "Leao";
		s.datainicio = 23.07;
		s.datafim = 22.08;
		
		System.out.println("Signo: " + s.Nome);
		System.out.println("Data de Inicio: " + s.datainicio);
		System.out.println("Data de Termino: " + s.datafim);
		
	}

}
