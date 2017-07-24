package orientacao_a_objetos;

public class Telefonistas extends Funcionario {

	private String cdgTrabalho;

	
	public Telefonistas(String cdgTrabalho) {
		super();
		this.cdgTrabalho = cdgTrabalho;
	}

	public String getCdgTrabalho() {
		return cdgTrabalho;
	}

	public void setCdgTrabalho(String cdgTrabalho) {
		this.cdgTrabalho = cdgTrabalho;
	}
	
	public String mostraDados() {
		return "Nome do funcionario: " + this.getNome() + "\n" + "Salario do funcionario: " + df.format(this.getSalario()) + "\n"
	+"Bonificação do funcionario: " + this.getAjuste() + "%" + "\n" + "Codigo de trabalhador: " + this.getCdgTrabalho();
	}

}
