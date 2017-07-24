package polimorfismo;

public class TesteExtrato {
	public static void main(String[] args) {

		ContaCorrente contCorr = new ContaCorrente(100d);
		
		contCorr.setNmrConta("15235");
		contCorr.setNome("Felipe");
		contCorr.setSaldo(1500d);

		System.out.println(GeradorDeExtratos.geraExtrato(contCorr));

		System.out.println("|---------------------------------------------------------------|");
		ContaPoupanca contPoup = new ContaPoupanca(10);

		contPoup.setNmrConta("15235");
		contPoup.setNome("Felipe");
		contPoup.setSaldo(1500d);

		System.out.println(GeradorDeExtratos.geraExtrato(contPoup));
	}
}
