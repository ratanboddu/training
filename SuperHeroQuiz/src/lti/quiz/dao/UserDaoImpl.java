package lti.quiz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;

import lti.quiz.bean.ForgetBean;
import lti.quiz.bean.LoginBean;
import lti.quiz.bean.RegisterBean;
import oracle.jdbc.OracleDriver;

public class UserDaoImpl extends HttpServlet implements UserDao {

	public UserDaoImpl() {
	}

	private Connection getConnection() throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "ratan", "ratan");
		return conn;
	}

	@Override
	public RegisterBean authenticate(LoginBean login){
		String sql="Select * from users where email = ? AND password=?";
		Connection conn=null;
		
		try {
			conn= getConnection();
			PreparedStatement stmt= conn.prepareStatement(sql);
			stmt.setString(1,login.getEmail());
			stmt.setString(2,login.getPassword());
			ResultSet rs = stmt.executeQuery();
			RegisterBean user=null;
			if(rs.next()) {
				user= new RegisterBean();
				user.setEmail(rs.getString(1));
				user.setProfile(rs.getString(4));
				return user;
			
			}
		 
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return null;
	}

	@Override
	public boolean register(RegisterBean register) {
		String sql="insert into users values(?,?,?,?)";
		Connection conn=null;
		
		try {
			conn= getConnection();
			PreparedStatement stmt= conn.prepareStatement(sql);
			stmt.setString(1,register.getEmail());
			stmt.setString(2,register.getPassword());
			stmt.setString(3,register.getAnswer());
			stmt.setString(4,register.getProfile());
			stmt.executeUpdate();
			return true;
		
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			try {
				if(conn!=null) {
					
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

	@Override
	public boolean validate(ForgetBean forget) {
		String sql = "Select * from users where email = ? AND answer=?";
		Connection conn = null;

		try {
			conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1,forget.getEmail());
			stmt.setString(2,forget.getAnswer());
			
			ResultSet rs = stmt.executeQuery();
			return rs.next();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			try {
				if(conn!=null) {
					
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

	@Override
	public boolean update(LoginBean change) {
		String sql = "update users set password=? where email=?";
		Connection conn = null;

		try {
			conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1,change.getPassword());
			stmt.setString(2,change.getEmail());
			stmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally {
			try {
				if(conn!=null) {
					
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return false;
	}

}
