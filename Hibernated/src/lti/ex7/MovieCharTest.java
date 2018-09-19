package lti.ex7;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.ex6.Department;
import lti.ex6.Employee;
import lti.util.HibernateUtil;

public class MovieCharTest {
	@Test
	public void testCase1() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		Movie mov = new Movie();
		mov.setName("Ironman");
		mov.setEarnings(1000.88);
		session.save(mov);
		tx.commit();

	}
	@Test
	public void testCase2() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		Movie mov = (Movie) session.get(Movie.class, 3);
		
		Character chara= new Character();
		chara.setCharacterName("Ratan");
		chara.setFees(1000000.77);
		chara.setMovie(mov);
		
		
		session.save(chara);
		tx.commit();
		
	}

}
