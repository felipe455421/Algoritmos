package classes_abstratas;

import java.util.Date;

public abstract class FuncionariosBanco {
	
	private String nome;
	private Date codigo;
	private double salario;
	
	
	
	public Date getCodigo() {
		return codigo;
	}
	public void setCodigo(Date codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract void bonifica(double taxa);
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
