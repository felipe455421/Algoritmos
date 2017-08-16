package br.com.felipe.animais.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.felipe.animais.model.PorquinhoDaIndia;

public class PorquinhoDaIndiaDAO {
	
	private final Connection con;

	public PorquinhoDaIndiaDAO(Connection con) {
		this.con = con;
	}

	public List<PorquinhoDaIndia> lista() throws SQLException {
		List<PorquinhoDaIndia> pdi = new ArrayList<>();

		String sql = "select * from PORQUINHO_DA_INDIA";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("POR_CODIGO");
					String som = rs.getString("POR_SOM");
					PorquinhoDaIndia pdi1 = new PorquinhoDaIndia(id, som);
					pdi.add(pdi1);
				}
			}
		}

		return pdi;

	}
}


