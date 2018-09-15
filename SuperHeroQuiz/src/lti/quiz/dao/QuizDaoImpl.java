/*package lti.quiz.dao;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lti.quiz.bean.OptionBean;
import lti.quiz.bean.QuizBean;
import lti.quiz.bean.RegisterBean;
import oracle.jdbc.OracleDriver;

public class QuizDaoImpl implements QuizDao {
	private Connection getConnection() throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "ratan", "ratan");
		return conn;
	}

	@Override
	public List<QuizBean> loadQuiz() {
		
		
		String sql = "select quiz.qid,question,options,pattern from quiz,answer where quiz.qid=answer.qid order by qid";
		Connection conn = null;
		

		try {

			conn = getConnection();
			ResultSet rs = conn.createStatement().executeQuery(sql);
			List<QuizBean> listOfQuestionBeans=new ArrayList<>();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			
			while (rs.next()) {
			    for (int i = 1; i <= columnsNumber; i++) {
			        if (i > 1) System.out.print(",  ");
			        String columnValue = rs.getString(i);
			        System.out.print(columnValue + " " + rsmd.getColumnName(i));
			    }
			    System.out.println("");
			}
			
			

			for (int i = 0; i < 12; i++) {
				QuizBean qb = new QuizBean();
				List<OptionBean> options = null;
				
				qb.setQuestion(rs.getString("question"));
				
				int qid = Integer.parseInt(rs.getString("qid"));
				int tempQid = qid;
				while (qid == tempQid) {

					OptionBean ob = new OptionBean();
					ob.setOption(rs.getString("options"));
					options.add(ob);
					qid = Integer.parseInt(rs.getString("qid"));

				}

				listOfQuestionBeans.add(qb);

			}

			return listOfQuestionBeans;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {

				if (conn != null) {
					

					conn.close();
				}
			}

			catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listOfQuestionBeans;

	}

	@Override
	public String getResult(String code) {
		Connection conn = null;
		String sql = "select hero from result where code=?";
		try {
			conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			String superHero = rs.getNString("hero");

			return superHero;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			try {

				if (conn != null) {

					conn.close();
				}
			}

			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
*/


package lti.quiz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lti.quiz.bean.LoginBean;
import lti.quiz.bean.OptionBean;
import lti.quiz.bean.QuizBean;
import lti.quiz.bean.RegisterBean;
import oracle.jdbc.OracleDriver;

public class QuizDaoImpl implements QuizDao {
	private Connection getConnection() throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "ratan", "ratan");
		return conn;
	}

	@Override
	public List<QuizBean> loadQuiz() {
		String sql = "select quiz.qid,question,options,pattern from quiz,answer where quiz.qid=answer.qid order by quiz.qid";
		Connection conn = null;

		try {
			conn = getConnection();
			ResultSet rs = conn.createStatement().executeQuery(sql);
			List<QuizBean> questions = new ArrayList<>();
			QuizBean quiz = null;
			ArrayList<OptionBean> options = null;

			while (rs.next()) {
				if(quiz != null && quiz.getId() != rs.getInt(1)) {
					quiz.setOptions(options);
					questions.add(quiz);
					quiz = null;
				}
				if (rs.getInt(1) > questions.size() && quiz == null) {
					quiz = new QuizBean();
					quiz.setId(rs.getInt(1));
					quiz.setQuestion(rs.getString(2));
					options = new ArrayList<>();
				}
				options.add(new OptionBean(rs.getString(3), rs.getString(4)));
			}

			return questions;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public String getResult(String code) {
		
		String sql = "select hero from result where code='" + code + "'";
	
		RegisterBean user=null;
		user= new RegisterBean();
		user.getEmail();
		String sql1= "update users set profile=result.hero where email='" + user.getEmail() + "'";
		
		Connection conn = null;
		
		try {
			conn = getConnection();
			ResultSet rs = conn.createStatement().executeQuery(sql);
			ResultSet rs1 = conn.createStatement().executeQuery(sql1);
			if(rs.next()) {
				return rs.getString(1);
			
			
			}
			if(rs1.next()) {
				return rs1.getString(2);
			
			
			}
			
			
		
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		


		
	}
}
