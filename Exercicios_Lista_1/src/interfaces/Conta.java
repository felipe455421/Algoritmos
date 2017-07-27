/**
 * Documentação do pacote de interfaces
 * 
 * @author Felipe Gomes da Silva
 * 
 * @version 1.0
 */
package interfaces;


public class Conta implements IBanco {
	
		
	private int codigo;
	private String nome;
	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void deposita(double valor){
		
	}
	
	public void saca(double valor){
		
	}

	public void getSaldo(){
		
	}
}


	
	

