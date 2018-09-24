package ex1;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {
	
	
	@Test
	public void testGreeting() {
		ApplicationContext appCtx=new ClassPathXmlApplicationContext("ex1/appctx.xml");
		/*we use ApplicationContext because the appctx.xml file is present in our class path and in our application's context
*/		HelloWorld hw=(HelloWorld)appCtx.getBean("hello");
		System.out.println(hw.getGreeting());
	}

}
