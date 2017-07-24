package classes_abstratas;

import java.text.DecimalFormat;

public class ContaPoupanca extends ContasBanco{
	
	DecimalFormat df = new DecimalFormat("#0.00");

	private int juros = 5;
	private String tipoConta = "Conta Poupança";
	
	
	public ContaPoupanca(int juros) {
		super();
		this.juros = juros;
		
	}
	
	public int getJuros() {
		return juros;
	}

	public void setJuros(int juros) {
		this.juros = juros;
	}

	public void contaJuros(){
		this.setSaldo(this.getSaldo() * ((this.juros / 100)+1));
		
	}
	
	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String ImprimeExtratoDetalhado() {
		
		return "Titular da conta: "+ this.getNome() + "\n" +
		"Numero da conta: " + this.getNmrConta() + "\n" +
		"Saldo disponivel: " + df.format(this.getSaldo());
		
			}
	
}
