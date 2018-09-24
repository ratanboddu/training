package ex5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageSource {
@Test
public void testi18n() {
	ApplicationContext ctx= new ClassPathXmlApplicationContext("ex5/appctx.xml");
	OrderProcessingService orderProcessing= ctx.getBean(OrderProcessingService.class);
	
	try {
		orderProcessing.placeOrder(5); // inviting exception
		
	}
	
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
}
}
