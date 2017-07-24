package exerciciosDissertativos;

public class Pais {
	
	private String nome;
	private String nomeCapital;
	private double km2;
	private String[] fronteira = new String[]{"Canadá","Europa","Japão","Russia"};
	
	
	public Pais(String nome, String nomeCapital, double km2) {
		super();
		this.nome = nome;
		this.nomeCapital = nomeCapital;
		this.km2 = km2;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeCapital() {
		return nomeCapital;
	}
	public void setNomeCapital(String nomeCapital) {
		this.nomeCapital = nomeCapital;
	}
	public double getKm2() {
		return km2;
	}
	public void setKm2(double km2) {
		this.km2 = km2;
	}
	public void setFronteira(int valor) {
		this.fronteira[valor] = fronteira[valor];
	}
	public String getFronteira(int valor) {
		return fronteira[valor];
	
	}
	
	
}
