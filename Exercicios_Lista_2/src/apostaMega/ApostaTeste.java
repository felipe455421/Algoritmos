package apostaMega;

public class ApostaTeste {
public static void main(String[] args) {
	
	Aposta aposta = new Aposta();
	ComparaApostas compara = new ComparaApostas();
	compara.comparaAposta(1);
	System.out.println(aposta.getResultado(2));
	
}
}
