package apostaMega;

public class Aposta {
//, 10, 11, 25, 59			,11,9,10,2	
	private int[] resultado = new int[]{59,25};
	private int[] aposta1 = new int[]{2, 9};
	private int[] aposta2 = new int[]{2, 9, 10, 5, 14, 59};
	private int[] aposta3 = new int[]{12, 15, 30, 38, 39, 40};
	private int[] aposta4 = new int[]{3, 5, 6, 10, 11, 12};
	private int[] aposta5 = new int[]{2, 4, 8, 26, 35, 38};

	public int getResultado(int valor) {
		return resultado[valor];
	}

	public void setResultado(int[] resultado) {
		this.resultado = resultado;
	}

	public int getAposta1(int valor) {
		return aposta1[valor];
	}

	public void setAposta1(int[] aposta1) {
		this.aposta1 = aposta1;
	}

	public int getAposta2(int valor) {
		return aposta2[valor];
	}

	public void setAposta2(int[] aposta2) {
		this.aposta2 = aposta2;
	}

	public int getAposta3(int valor) {
		return aposta3[valor];
	}

	public void setAposta3(int[] aposta3) {
		this.aposta3 = aposta3;
	}

	public int getAposta4(int valor) {
		return aposta4[valor];
	}

	public void setAposta4(int[] aposta4) {
		this.aposta4 = aposta4;
	}

	public int getAposta5(int valor) {
		return aposta5[valor];
	}

	public void setAposta5(int[] aposta5) {
		this.aposta5 = aposta5;
	}

	public int[] getResultado() {
		return resultado;
	}

	public int[] getAposta1() {
		return aposta1;
	}

	public int[] getAposta2() {
		return aposta2;
	}

	public int[] getAposta3() {
		return aposta3;
	}

	public int[] getAposta4() {
		return aposta4;
	}

	public int[] getAposta5() {
		return aposta5;
	}

	
}











