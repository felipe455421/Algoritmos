package br.com.felipe.animais.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.felipe.animais.dao.CachorroDAO;
import br.com.felipe.animais.dao.GatoDAO;
import br.com.felipe.animais.dao.PorquinhoDaIndiaDAO;
import br.com.felipe.animais.jdbc.oracle.ConnectionPoolOracle;
import br.com.felipe.animais.model.Cachorro;
import br.com.felipe.animais.model.Gato;
import br.com.felipe.animais.model.PorquinhoDaIndia;

public class Testa {

	public static void main(String[] args) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			List<Cachorro> cachorros = new CachorroDAO(con).lista();
			for (Cachorro cachorro : cachorros) {
				System.out.println(cachorro.getCodigo() + "-" + cachorro.getNome() + "\n" + "  " + cachorro.getSom());
			}
		}

		System.out.println("--------------------------------------------------------");

		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			List<Gato> gatos = new GatoDAO(con).lista();
			for (Gato gato : gatos) {
				System.out.println(gato.getCodigo() + "-" + gato.getNome() + "\n" +  "  " + gato.getSom());
			}
		}

		System.out.println("--------------------------------------------------------");

		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			List<PorquinhoDaIndia> pdis = new PorquinhoDaIndiaDAO(con).lista();
			for (PorquinhoDaIndia pdi : pdis) {
				System.out.println(pdi.getCodigo() + "-" + pdi.getNome() + "\n" +  "  " + pdi.getSom());
			}
		}
	}
}
