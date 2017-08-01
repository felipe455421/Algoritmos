package _1;

public class ContaCorrenteEspec extends ContaCorrente{

	public ContaCorrenteEspec(double limite) {
		super(limite);

	}

	public void saque(double valor) {
		this.setTaxa(valor * 0.001);
		this.setSaldo(this.getSaldo() - (valor + this.getTaxa())) ;

	}
}
