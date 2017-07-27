package collectionsJava;

import java.text.DecimalFormat;

public class ContaCorrente extends Conta{
	
	private double limite = 100;
	private String tipoConta = "Conta Corrente";
	
	
	DecimalFormat df = new DecimalFormat("#0.00");

	public ContaCorrente(double limite) {
		super();
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void aumentaLimite(int valor){
		this.setLimite(this.getLimite() + valor);
		
	}
	
	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
}
