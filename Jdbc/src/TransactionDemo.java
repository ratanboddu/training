import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {
	public static void main(String[] args) {
		String sql1 = "insert into product values(113,'Phonewa',1100)";
		String sql2 = "update product set price = 2120 where code = 110";
		String sql3 = "delete from product where code = 130";

		Connection conn = null;

		try {
			conn = JdbcFactory.getConnection();
			Statement stmt = conn.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2); 
			stmt.addBatch(sql3);

			conn.setAutoCommit(false);
			stmt.executeBatch();
			conn.commit();
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
