package _1;

public class ContaCorrente {
	
	private String nmrConta;
	private String nome;
	private double saldo;
	private double limite = 100;
	private double taxa;
	
	public ContaCorrente(double limite) {
		super();
		this.limite = limite;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

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
	
	public void saque(double valor) {
		taxa = valor * 0.005;
		this.saldo -= (valor + taxa) ;

	}
	public void deposita(double valor) {
		this.saldo += valor;

	}

	public double consultaSaldo() {
		return this.saldo + this.limite;

	}
}
