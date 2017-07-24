package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Contas {
	DecimalFormat df = new DecimalFormat("#0.00");

	private String numero_conta;
	private double saldo;
	private double limite = 100d;
	private Agencias agencia;
	
	public static int contador;
	public static int[] numeroContaUnico = new int[10];
	
	public Contas(String numero_conta){
		this.numero_conta = numero_conta;
		contador++;
		numeroContaUnico[(contador - 1)] = contador;
		
		
	}
	public Contas(Contas destino, double valor) {
		this.saldo -= valor;
		destino.saldo += valor;

	}

	public String getNumero_conta() {
		return numero_conta;
	}
	public void setNumero_conta(String numero_conta) {
		this.numero_conta = numero_conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public Agencias getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencias agencia) {
		this.agencia = agencia;
	}
	public void deposita(double valor) {
		this.saldo += valor;

	}

	public void saque(double valor) {
		this.saldo -= valor;

	}

	public double consultaSaldo() {
		return this.saldo + this.limite;

	}

	public String extrato() {
		String extrato = "";
		extrato += "Numero da conta " + this.numero_conta;
		extrato += "\nSaldo " + "" + df.format(this.saldo);
		extrato += "\nLimite " + df.format(this.limite);
		return extrato;

	}
	
	public static void limpaContador(){
		System.out.println("O numero total de contas é: " + contador);
		contador = 0;
		
		
	}
		
		
	}
