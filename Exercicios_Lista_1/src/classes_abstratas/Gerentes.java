package classes_abstratas;

public class Gerentes extends FuncionariosBanco {
	
	private String nomeUsr;
	private String senha;
	
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

	public void bonifica(double taxa) {
		this.setSalario(this.getSalario() * ((taxa/100)+1));
		
	}
	
}
