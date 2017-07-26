package apostaMega;

public class ComparaApostas extends Aposta {

	private int contador;
	public void comparaAposta(int valor) {
		if (valor == 1) {
			for (int i = 0; i < this.getResultado(i); i++) {
				for (int z = 0; z < this.getAposta1().length; z++) {
					
					if(this.getResultado(i) == this.getAposta1(z)){
						contador++;
						
					}
				
				
				}
			}
		}
		if (valor == 2) {
			for (int i = 0; i < this.getResultado(i); i++) {
				for (int z = 0; z < this.getAposta2().length; z++) {

					
					if(this.getResultado(i) == this.getAposta2(z)){
						contador++;
						
					}
				
				}
			}
		}
		if (valor == 3) {
			for (int i = 0; i < this.getResultado(i); i++) {
				for (int z = 0; z < this.getAposta3(z); z++) {
				
				}
			}
		}
		if(valor == 4){
			for(int i = 0; i < this.getResultado(i); i++){
				for(int z = 0; z < this.getAposta4(z); z++){
						
				}
			}
		}
		if(valor == 5){
			for(int i = 0; i < this.getResultado(i); i++){
				for(int z = 0; z < this.getAposta5(z); z++){
					
			
		}
	}
}
		
		

		
		if(contador == 6){
			System.out.println("Ganhou");
		}
	}
}
	

	