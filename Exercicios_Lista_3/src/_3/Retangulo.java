package _3;

public class Retangulo extends Quadrilateros{
	
	public Retangulo(int lado1, int lado2, int lado3, int lado4) {
		super();
		this.setLado1(lado1);
		this.setLado2(lado2);
		this.setLado3(lado3);
		this.setLado4(lado4);
	}
	
	public double calculaPeri() {
		int lados;
		return lados = getLado1() + getLado2() + getLado3() + getLado4();
	}

	public double calculaArea() {
		int lados;
		return lados = getLado1() * getLado2();
	}
}
