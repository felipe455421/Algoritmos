package br.com.felipe.animais.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.felipe.animais.model.Cachorro;

public class CachorroDAO {

	private final Connection con;

	public CachorroDAO(Connection con) {
		this.con = con;
	}

	public List<Cachorro> lista() throws SQLException {
		List<Cachorro> cachorros = new ArrayList<>();

		String sql = "select * from CACHORRO";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("CAC_CODIGO");
					String som = rs.getString("CAC_SOM");
					Cachorro cachorros1 = new Cachorro(id, som);
					cachorros.add(cachorros1);
				}
			}
		}

		return cachorros;

	}
	
}