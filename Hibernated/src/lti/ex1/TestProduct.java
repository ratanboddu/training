package lti.ex1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class TestProduct {
	
	@Test
	public void testAddProduct() {
		SessionFactory factory=HibernateUtil.getFactory();
		
		Session session=factory.getCurrentSession();
		Transaction txn=session.getTransaction();
		
		Product p1=new Product();
		p1.setName("Apple iPhone XS");
		p1.setPrice(99999.99);
		
		Product p2=new Product();
		p2.setName("One plus 6T");
		p2.setPrice(99999.99);
		
		try {
			txn.begin();
			/*session.save(p1);*/
			session.save(p2);
			txn.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			txn.rollback();
		}
		finally {
			factory.close();
		}
	}
	
	@Test
	public void testFetchProduct() {
		
		SessionFactory factory=HibernateUtil.getFactory();
		Session session= factory.getCurrentSession();
		
		session.beginTransaction();
		Product p = (Product) session.get(Product.class, 1);
		System.out.println(p.getName()+":"+ p.getPrice());
		factory.close();
	}
	
	@Test
	public void testUpdateProduct() {
		
		SessionFactory factory=HibernateUtil.getFactory();
		Session session= factory.getCurrentSession();
		 Transaction txn=session.beginTransaction();
		 
		 
		 Product p=(Product) session.get(Product.class, 1);
		 p.setPrice(1111111.99);//update in attached scenario
		 txn.commit();
		 
		 factory.close();
		
	}
	
	@Test
	public void detachedUpdateProduct() {
		
		
		SessionFactory factory=HibernateUtil.getFactory();
		Session session=factory.getCurrentSession();
		
		Transaction txn=session.beginTransaction();
		
		Product p=(Product) session.get(Product.class, 1);
		 p.setPrice(1111111.99);//update in attached scenario
		 txn.commit(); // now that we have committed the object has been detached
		 
		 //to run the code- remove the comments
		 
		 /*session=factory.getCurrentSession();
			
		 txn=session.beginTransaction();*/
		 p.setPrice(1111111.99);//update in detached scenario
		/* session.update(p);
		 * txn.commit();
		 */
		 
		 
		 
		
		
	}
	
	@Test
	public void testDeleteProduct() {
		
		SessionFactory factory=HibernateUtil.getFactory();
		Session session=factory.getCurrentSession();
		
		Transaction txn=session.beginTransaction();
		
		Product p=(Product) session.get(Product.class, 1);
		session.delete(p);
		txn.commit();
		factory.close();
		
		
		
		
	}

}
