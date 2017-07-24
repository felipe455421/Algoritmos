package polimorfismo;

public class Telefonistas extends FuncionariosBanco {

	private String ramal;

	public Telefonistas(String ramal) {
		super();
		this.ramal = ramal;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

}
