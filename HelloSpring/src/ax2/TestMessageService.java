package ax2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageService {
	@Test
	public void testCase() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("annotated.xml");
		
		MessageRouter router = (MessageRouter) ctx.getBean("router");
		
		router.processMessage("sms", "9702zubair", "Hello Zubair");
		router.processMessage("email", "imzubair@gmail.com", "Howdy Zubair");
		router.processMessage("tweet", "@imzubair", "Hola Zubair");
	}
}
