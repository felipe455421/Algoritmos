package _2;

public class Livros  extends Produto{



	private String autor;
	
	public Livros(String nome, double preco,String codigoBarras, String autor) {
		super(nome, preco, codigoBarras);
		this.autor = autor;
	}
	public String toString(){
		return super.toString() + "\n" + "Esse livro foi escrito por: " + this.autor;
	}
}
