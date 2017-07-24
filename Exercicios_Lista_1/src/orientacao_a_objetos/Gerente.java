package orientacao_a_objetos;

public class Gerente {

	String nome;
	double salario;
	


public void aumentoSalarial(){
	
	this.aumentoSalarial(10);
	
	
}

public void aumentoSalarial(double valor){

	this.salario = this.salario * ((valor / 100)+1);

}
}