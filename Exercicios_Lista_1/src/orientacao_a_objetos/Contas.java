package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Contas {
	DecimalFormat df = new DecimalFormat("#0.00");

	String numero_conta;
	double saldo;
	double limite = 100d;
	Agencias agencia;

	
	public Contas(String numero_conta){
		this.numero_conta = numero_conta;
		
		
	}
	public Contas(Contas destino, double valor) {
		this.saldo -= valor;
		destino.saldo += valor;

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

}
