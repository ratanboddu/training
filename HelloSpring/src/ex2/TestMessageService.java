
package ex2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageService {
	@Test
	public void testProvider() {
		
		ApplicationContext appCtx= new ClassPathXmlApplicationContext("ex2/appctx.xml");
		
		MessageProvider mp=(MessageProvider) appCtx.getBean("provider");
		
		mp.process("sms", "8785786844", "Hello Zubair");
		mp.process("email", "zubair@hf.in", "Hola Zubair");
		mp.process("wapp", "@zubair", "Hola Zubair");
	}
}
