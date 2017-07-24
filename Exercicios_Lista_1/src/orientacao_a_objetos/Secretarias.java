package orientacao_a_objetos;

public class Secretarias extends Funcionario{

	private String nmrRamal;

	
	public Secretarias(String nmrRamal) {
		super();
		this.nmrRamal = nmrRamal;
	}

	public String getNmrRamal() {
		return nmrRamal;
	}

	public void setNmrRamal(String nmrRamal) {
		this.nmrRamal = nmrRamal;
	}
	public String mostraDados() {
		return "Nome do funcionario: " + this.getNome() + "\n" + "Salario do funcionario: " + df.format(this.getSalario()) + "\n"
	+"Bonificação do funcionario: " + this.getAjuste() + "%" + "\n" + "Numero do ramal: " + this.getNmrRamal();
	}
}
