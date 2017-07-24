package exerciciosDissertativos;

public class ExemploEnumeracao {

	public enum Cartas{
		A(1),b(2),c(3),e(4),d(5);
		
		public int valorCarta;
		Cartas(int valor) {
			valorCarta = valor;
			
		}
		
	}

}
