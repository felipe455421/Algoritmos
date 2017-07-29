package apostaMega;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class ComparaApostas extends Aposta {

	private int contador;
	private String aposta = " ";
	private int i = 0;
	private int opcao = 0;

	public void comparaAposta(String valor) {

		opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite qual opção deseja realizar: " + "\n"
				+ "Opção 1 para apostas pré-definidas aleatorias" + "\n" + "Opção 2 para digitar sua própria aposta" + "\n" +
				"Opção 3 para encerrar o programa"));

		if (opcao == 1) {
			List<String> letras = Arrays.asList("A", "B", "C", "D", "E");
			Collections.shuffle(letras);
			String nome = letras.get(0);

			switch (nome) {

			case "A":
				for (int x : this.getAposta1()) {
					this.setApostaComparar(this.getAposta1(i), i);
					i++;

				}
				break;

			case "B":
				for (int x : this.getAposta2()) {
					this.setApostaComparar(this.getAposta2(i), i);
					i++;
				}
				break;

			case "C":
				for (int x : this.getAposta3()) {
					this.setApostaComparar(this.getAposta3(i), i);
					i++;
				}
				break;

			case "D":
				for (int x : this.getAposta4()) {
					this.setApostaComparar(this.getAposta4(i), i);
					i++;
				}
				break;
			case "E":
				for (int x : this.getAposta5()) {
					this.setApostaComparar(this.getAposta5(i), i);
					i++;
				}
			}

		} else if (opcao == 2) {
			for (int x : this.getApostaComparar()) {
				this.setApostaComparar(
						Integer.parseInt(JOptionPane.showInputDialog("Digite o valor na posição " + (i + 1))), i);
				i++;
			}

		
	}else if ( opcao == 3){

		System.exit(0);
	}
		for (int i = 0; i < this.getResultado().length; i++) {
			for (int z = 0; z < this.getApostaComparar().length; z++) {

				if (this.getResultado(i) == this.getApostaComparar(z)) {
					contador++;

				}

			}
		}

		if (contador == 6) {
			
			for (int x : this.getApostaComparar()) {
				aposta += x + " ";
			}
			System.out.println("Você acertou " + this.contador + "/6 e Ganhou!!" + "\n" + "Sua aposta foi: " + aposta);

		} else {
			
			for (int x : this.getApostaComparar()) {
				aposta += x + " ";
			}
			System.out.println("Você acertou " + this.contador + "/6 e Perdeu!!"  + "\n" + "Sua aposta foi:" + aposta);

		}
	}
}
