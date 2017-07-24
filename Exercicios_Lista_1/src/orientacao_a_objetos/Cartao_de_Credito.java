
package orientacao_a_objetos;

import java.util.Date;

public class Cartao_de_Credito {

	private String numero_do_cartao;
	private Date data_de_validade;
	private Clientes cliente;

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public Cartao_de_Credito(String numero_do_cartao){
		this.numero_do_cartao = numero_do_cartao;
		
		
	}

	public String getNumero_do_cartao() {
		return numero_do_cartao;
	}

	public void setNumero_do_cartao(String numero_do_cartao) {
		this.numero_do_cartao = numero_do_cartao;
	}

	public Date getData_de_validade() {
		return data_de_validade;
	}

	public void setData_de_validade(Date data_de_validade) {
		this.data_de_validade = data_de_validade;
	}

}