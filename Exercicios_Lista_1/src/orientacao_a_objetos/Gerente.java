package orientacao_a_objetos;

public class Gerente {

	private String nome;
	private double salario;
	


public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

public void aumentoSalarial(){
	
	this.aumentoSalarial(10);
	
	
}

public void aumentoSalarial(double valor){

	this.salario = this.salario * ((valor / 100)+1);

}
}