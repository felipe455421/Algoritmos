package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Funcionario {

	private String nome;
	private double salario = 1000d;
	private static double valeRefeicao;
	private int ajuste = 10;

	DecimalFormat df = new DecimalFormat("0.00");

	public void aumentaSalario(double valor) {
		this.salario += valor;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static double getValeRefeicao() {
		return valeRefeicao;
	}

	public static void setValeRefeicao(double valeRefeicao) {
		Funcionario.valeRefeicao = valeRefeicao;
	}
	
	public int getAjuste() {
		return ajuste;
	}

	public void setAjuste(int ajuste) {
		this.ajuste = ajuste;
	
	}
	
	String consultaFuncionario() {
		return ("Funcionario: " + this.nome + "\n" + "Salario: " + df.format(this.salario));

	}

	public static void reajustaValeRefeicaoDiario(double taxa) {
		Funcionario.valeRefeicao = Funcionario.valeRefeicao * ((taxa / 100d) + 1);
	}

	public void salarioBonifica() {
		this.setSalario(this.getSalario() * ((this.getAjuste() / 100d) +1));

	}
	
	public String mostraDados() {
		return "Nome do funcionario: " + this.getNome() + "\n" + "Salario do funcionario: " + df.format(this.getSalario()) + "\n" 
	+"Bonificação do funcionario: " + this.getAjuste() + "%";
		
	}

}
