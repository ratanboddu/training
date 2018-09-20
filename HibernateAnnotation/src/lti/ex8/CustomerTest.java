package lti.ex8;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class CustomerTest {
	@Test
	public void testCase1() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		
		Item item1=new Item();
		item1.setName("Chair");
		item1.setInitialPrice(2500);
		item1.setMaxBidAmount(5000.0);
		item1.setReservePrice(3000);
		item1.setTotalBids(120.0);
		item1.setValidTill(new Date());
		
		Item item2=new Item();
		item2.setName("Table");
		item2.setInitialPrice(3500);
		item2.setMaxBidAmount(8000.0);
		item2.setReservePrice(150.0);
		item2.setTotalBids(150.0);
		item2.setValidTill(new Date());
		
		
		Set<Item> itemSet=new HashSet<Item>();
		itemSet.add(item1);
		itemSet.add(item2);
	
	
		Category mainCat=new Category();
		mainCat.setName("Furniture");
		mainCat.setParentCategory(null);
		
		Category childCat = new Category();
		childCat.setName("Wodden Furniture");
		childCat.setParentCategory(mainCat);
		childCat.setItems(itemSet);
	
		
		Customer cust1=new Customer();
		cust1.setName("Polo");
		System.out.println("Customer 1 is created");
		
		Customer cust2=new Customer();
		cust2.setName("Lili");
		System.out.println("Customer 2 is created");
		
		Bid bid1= new Bid();
		bid1.setAmount(1500);
		bid1.setItem(item1);
		bid1.setCustomer(cust1);
		

		Bid bid2= new Bid();
		bid2.setAmount(1700);
		bid2.setItem(item1);
		bid2.setCustomer(cust2);
		
		
		item1.getBids().add(bid1);
		item2.getBids().add(bid2);
		
		
		session.save(cust1);
		session.save(cust2);
		

		session.save(item1);
		session.save(item2);
		

		session.save(mainCat);
		session.save(childCat);
		

		session.save(bid1);
		session.save(bid2);
	
		
		tx.commit();
		/*session.close();*/
		
		
	}
	
	@Test
	public void addCustomers() 
	{
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		Customer c1 = new Customer();
		c1.setName("Majrul");
		Customer c2 = new Customer();
		c2.setName("Zubair");
		session.save(c1);
		session.save(c2);
		tx.commit();
	}
	
	@Test
	public void addCategories() 
	{
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
			Transaction tx = session.beginTransaction();
			Category c = new Category();
			c.setName("Mobiles");
			session.save(c);
			c = new Category();
			c.setName("Laptops");
			session.save(c);
			tx.commit();
	}
	
	@Test
	public void addItems() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
			Transaction tx = session.beginTransaction();
			Item i = new Item();
			i.setName("Nokia 6600");
			i.setInitialPrice(4500);
			session.save(i);
			i = new Item();
			i.setName("Apple Macbook");
			i.setInitialPrice(55000);
			session.save(i);
			tx.commit();
	}
	
	@Test
	public void linkItemToCategory() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		Category c = (Category) session.get(Category.class, 1); //Mobiles category
		Item i = (Item) session.get(Item.class, 1); //Nokia mobile phone
		//make sure item-categories association is lazy=false
		i.getCategories().add(c);
		session.update(i);
		tx.commit();
	}
	
	@Test
	public void placeABid() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		Customer c = (Customer) session.get(Customer.class, 1); //Majrul
		Item i = (Item) session.get(Item.class, 1); //Nokia mobile phone
		Bid b = new Bid();
		b.setAmount(5000);
		b.setCustomer(c);
		b.setItem(i);
		session.save(b);
		tx.commit();
	}
	
	
}
