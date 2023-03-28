package jpa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PeliculaDAOJDBCImpl implements PeliculaDAO {

	// READ

	public Pelicula read(int id) {

		Pelicula pelicula = null;
		Connection con=null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beca?serverTimezone=UTC", "root",
					"root");

			PreparedStatement statement = con.prepareStatement("SELECT ID,NOMBRE FROM PELICULA WHERE ID=?");

			statement.setInt(1, id);

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				pelicula = new Pelicula();
				pelicula.setId(rs.getInt("ID"));
				pelicula.setNombre(rs.getString("NOMBRE"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {			
			try {
				con.close();
			} catch (SQLException e) {			
				e.printStackTrace();
			}
			
		}

		return pelicula;
	}

	// CREATE

	public void create(Pelicula pelicula) {
	}

	// UPDATE

	public void update(Pelicula pelicula) {

	}

	// DELETE

	public void delete(Pelicula pelicula) {

	}

	public List<?> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
