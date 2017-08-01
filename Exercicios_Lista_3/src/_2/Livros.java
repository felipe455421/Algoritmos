package _2;

public class Livros  extends Loja{



	private String autor;
	
	public Livros(String nome, double preco, String autor) {
		super(nome, preco);
	}
	public String toString(){
		return super.toString() + "\n" + "Esse livro foi escrito por: " +this.autor;
	}
}
