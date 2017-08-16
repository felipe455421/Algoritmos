package br.com.felipe.animais.model;

public class Gato {
	
	private String nome = "Gato";
	private Integer codigo;
	private String som;

	public Gato(Integer codigo, String som) {
		this.codigo = codigo;
		this.som = som;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
