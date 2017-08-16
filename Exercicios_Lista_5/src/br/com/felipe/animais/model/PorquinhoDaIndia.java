package br.com.felipe.animais.model;

public class PorquinhoDaIndia {
	
	private String nome = "Porquinho da India";
	private Integer codigo;
	private String som;

	public PorquinhoDaIndia(Integer codigo, String som) {
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
