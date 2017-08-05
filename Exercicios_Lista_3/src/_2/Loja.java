package _2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Loja {
	public static void main(String[] args) {

		CDs cd = new CDs("Aviões do Forró", 10, "#1244512", "15");

		System.out.println(cd.toString());

		CDs cd1 = new CDs("Metallica", 100, "#1244512", "15");
		DVDs dvd1 = new DVDs("Noiva Cadaver", 90, "#1244512", "15:10");
		Livros livro1 = new Livros("A Cabana", 60, "#1242512", "J.K Rowling");
		CDs cd2 = new CDs("Iron Maiden", 40, "#1246512", "14");
		DVDs dvd2 = new DVDs("DOOM", 15, "#1248512", "16:15");

		List<Produto> lProdutos = new ArrayList<>();

		lProdutos.add(cd1);
		lProdutos.add(dvd1);
		lProdutos.add(livro1);
		lProdutos.add(cd2);
		lProdutos.add(dvd2);

		System.out.println(cd1.equals(cd2));

		for (Produto produto : lProdutos) {
			System.out.println("Nome do produto: " + produto.toString() + "\n" + "_______________________________");
		}

		buscaProdutos(cd1, lProdutos);

		Collections.sort(lProdutos);

		System.out.println();

		for (Produto produto : lProdutos) {
			System.out.println(produto.toString());
		}

	}

	private static void buscaProdutos(Produto produto, List<Produto> lProdutos) {
		for (Produto prod : lProdutos) {
			if (prod.equals(produto)) {
			}
		}
	}
}