package collectionsJava;

import java.util.ArrayList;

public class TesteConta {
public static void main(String[] args) {
	
	ContaCorrente cont = new ContaCorrente(152);
	
	cont.lista.add("João da Silva");
	cont.lista.add("saokd da Silva");
	cont.lista.add("weq da Silva");
	cont.lista.add("123 da Silva");
	cont.lista.add("herte da Silva");

	for(Object x : cont.lista) {
	String s = (String) x;
	System.out.println(s);
	}
}
}
