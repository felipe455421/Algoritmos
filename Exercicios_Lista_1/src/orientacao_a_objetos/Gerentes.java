package orientacao_a_objetos;

public class Gerentes extends Funcionario {

	private String nomeUsr;
	private String senha;
	private int ajuste = 25;

	
	public Gerentes(String nomeUsr, String senha) {
		super();
		this.nomeUsr = nomeUsr;
		this.senha = senha;
	}

	public String getNomeUsr() {
		return nomeUsr;
	}

	public void setNomeUsr(String nomeUsr) {
		this.nomeUsr = nomeUsr;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getAjuste() {
		return ajuste;
	}

	public void setAjuste(int ajuste) {
		this.ajuste = ajuste;
	}

	public void salarioBonifica() {
		setSalario(getSalario() * ((this.getAjuste() / 100d) + 1));

	}
	
	public String mostraDados() {
		return "Nome do funcionario: " + this.getNome() + "\n" + "Salario do funcionario: " + df.format(this.getSalario()) + "\n"
	+"Bonificação do funcionario: " + this.getAjuste() + "%" + "\n" + "Nome de Usuario: " + this.getNomeUsr() + "\n"
	+"Senha: " + this.getSenha() ;

}
}
