import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallableDemo {
	public static void main(String[] args) {
		Connection conn = null;

		try {
			conn = JdbcFactory.getConnection();
			CallableStatement stmt = conn.prepareCall("{call getname(?,?)}");
			stmt.setInt(1, 120);
			stmt.registerOutParameter(2, Types.VARCHAR);
			stmt.execute();
			System.out.println("Product Name: " + stmt.getString(2));
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
