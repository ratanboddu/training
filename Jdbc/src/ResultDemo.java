import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultDemo {
	public static void main(String[] args) {
		Connection conn = null;
		String sql = "Select * from product";

		try {
			conn = JdbcFactory.getConnection();
			ResultSet rs = conn.createStatement().executeQuery(sql);
			ResultSetMetaData meta = rs.getMetaData();

			System.out.println(meta.getColumnLabel(1) + "\t" + meta.getColumnLabel(2) + "\t\t" + meta.getColumnLabel(3));

			while (rs.next())
				System.out.println(rs.getInt(1) + "\t" + rs.getString("name") + "  \t" + rs.getString(3));
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
