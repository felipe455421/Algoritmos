package collectionsJava;

import java.util.ArrayList;

public class TesteConta {
public static void main(String[] args) {
	
	ArrayList lista = new ArrayList<>();
	ContaPoupanca cont = new ContaPoupanca(152);
	
	lista.add("João da Silva");
	lista.add("saokd da Silva");
	lista.add("weq da Silva");
	lista.add("123 da Silva");
	lista.add("herte da Silva");

	for(Object x : lista) {
	String s = (String) x;
	System.out.println(s);
	}
}
}
