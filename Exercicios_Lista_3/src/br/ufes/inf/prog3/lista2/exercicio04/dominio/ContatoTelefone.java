package br.ufes.inf.prog3.lista2.exercicio04.dominio;

public abstract class ContatoTelefone implements IContato {
	
	private String nome;
	private String contato;
	private String tipo;
	
	public ContatoTelefone(String tipo){
		this.tipo = tipo;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}