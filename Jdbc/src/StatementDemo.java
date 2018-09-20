import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
	public static void main(String[] args) {
		Connection conn = null;
		String sql = "Insert into product values(120, 'Hackintosh', 1500)";

		try {
			conn = JdbcFactory.getConnection();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Record inserted");
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
