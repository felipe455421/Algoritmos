package classes_abstratas;

public class TesteConta {
public static void main(String[] args) {
	
	
	ContaPoupanca contCorr = new  ContaPoupanca(10);
	
	contCorr.setNmrConta("15235");
	contCorr.setNome("Felipe");
	contCorr.setSaldo(1500d);


System.out.println(contCorr.getNome());
System.out.println(contCorr.getNmrConta());
System.out.println(contCorr.getSaldo());
System.out.println(contCorr.ImprimeExtratoDetalhado());

}

}

