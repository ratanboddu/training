package lti.ex71;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class CharMovTest {

	@Test
	public void testCase1() {
		
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		Movies movi = new Movies();
		movi.setMovno(10);
		movi.setName("Ironman");
		session.save(movi);
		tx.commit();
	}
	
	@Test
	public void testCase2() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		Movies movi = (Movies) session.get(Movies.class, 10);
		
		Characters chara= new Characters();
		chara.setSalary(20000);
		chara.setCharName("Harsh");
		chara.setMovie(movi);
		session.save(chara);
		tx.commit();
		
	}
}
