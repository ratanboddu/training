import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {
	public static void main(String[] args) {
		Connection conn = null;

		try {
			conn = JdbcFactory.getConnection();
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("SELECT code, name, price FROM product");

			rs.absolute(2); 
			rs.updateString("name", "Fakebook"); 
			rs.updateRow(); 

			rs.moveToInsertRow(); 
			rs.updateInt(1, 35);
			rs.updateString(2, "AINSWORTH"); 			
			rs.updateDouble(3, 25431);
			rs.insertRow();
			rs.moveToCurrentRow();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}
