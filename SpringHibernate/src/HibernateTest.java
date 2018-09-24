import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import entity.Product;
import repo.ProductRepository;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= "classpath:appctx.xml")
public class HibernateTest {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Test
	public void testHibernate() {
		
		Product p=new Product();
		p.setName("Macbook");
		p.setPrice(20000.0);
		productRepository.add(p);
	}
	
	@Test
	public void testGet() {
		System.out.println(productRepository.get(181).getName());
		System.out.println(productRepository.get(181).getPrice());
		
		
	}
	
	@Test
	public void testGetAll() {
		List<Product> products=productRepository.getAll();
		for (Product product : products) {
			System.out.print(product.getName()+"\t");
			System.out.println(product.getPrice()+"\t");
			
		}
			
		}
		
		
	}
	


