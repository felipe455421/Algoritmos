package static_;

import orientacao_a_objetos.Contas;

public class TesteConta {
public static void main(String[] args) {
	
	Contas conta1 = new Contas("1234");
	Contas conta2 = new Contas("4321");
	Contas conta3 = new Contas("1243");

	System.out.println(Contas.contador);
	for(int numero : Contas.numeroContaUnico) {

		if(numero != 0){
	System.out.println(numero);
		}
	
		
}
	Contas.limpaContador();
}
}
