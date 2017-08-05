package _2;

import java.text.DecimalFormat;

public abstract class Produto implements Comparable<Produto>{

	private String nome;
	private double preco;
	private String codigoBarras;
	
	DecimalFormat df = new DecimalFormat("#0.00");
	
	public Produto(String nome, double preco,String codigoBarras) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.codigoBarras = codigoBarras;
	}
	
	public String toString(){
		return "Nome: " + this.nome + "\n" + "Preço: R$" + df.format(this.preco);
		
	}
	
	@Override
	public boolean equals(Object obj) {

		Produto produto = (Produto) obj;
		return this.codigoBarras.equals(produto.getCodigoBarras());
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
	public int compareTo(Produto o) {
		return this.nome.compareTo(o.getNome());
		
	}
}
