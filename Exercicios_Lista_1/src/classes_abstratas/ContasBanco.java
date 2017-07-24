package classes_abstratas;

public abstract class ContasBanco {
	
	private String nmrConta;
	private String nome;
	private double saldo;
	
	public String getNmrConta() {
		return nmrConta;
	}
	public void setNmrConta(String nmrConta) {
		this.nmrConta = nmrConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract String ImprimeExtratoDetalhado();

}

