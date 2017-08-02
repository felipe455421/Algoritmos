package _2;

public class LojaTeste {
public static void main(String[] args) {
	
	
	CDs cd = new CDs("Aviões do Forró", 10, "#1244512", "15");
	
	System.out.println(cd.toString());
	
	
	CDs cd1 = new CDs("Metallica",100, "#1244512", "15");
	DVDs dvd1 = new DVDs("Noiva Cadaver",90, "#1244512", "15:10");
	Livros livro1 = new Livros("A Cabana",60, "#1244512", "J.K Rowling");
	CDs cd2 = new CDs("Iron Maiden",40, "#1244512", "14");
	DVDs dvd2 = new DVDs("DOOM",15, "#1244512", "16:15");

	Vetor lista = new Vetor();
	
	lista.adiciona(cd1);
	
}
}
