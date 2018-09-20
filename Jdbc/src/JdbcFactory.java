import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public final class JdbcFactory {
	private JdbcFactory() {
	}

	public static Connection getConnection() throws SQLException {
		Properties p = new Properties();

		try {
			p.load(new FileReader("src/oracle.db"));
		} catch (IOException e) {
			throw new SQLException(e.getMessage());
		}

		String url = p.getProperty("url");
		try {
			Class.forName(p.getProperty("driver"));
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}

		return DriverManager.getConnection(url, p.getProperty("user"), p.getProperty("pass"));
	}
}
