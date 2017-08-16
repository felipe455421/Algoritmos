package br.com.felipe.animais.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.felipe.animais.model.Gato;

public class GatoDAO {

	private final Connection con;

	public GatoDAO(Connection con) {
		this.con = con;
	}

	public List<Gato> lista() throws SQLException {
		List<Gato> gatos = new ArrayList<>();

		String sql = "select * from GATO";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("GAT_CODIGO");
					String som = rs.getString("GAT_SOM");
					Gato gatos1 = new Gato(id, som);
					gatos.add(gatos1);
				}
			}
		}

		return gatos;

	}
}

