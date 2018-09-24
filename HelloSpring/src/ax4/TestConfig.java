package ax4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ax1.HelloWorld;

public class TestConfig {
@Test  
public void testCase() {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	HelloWorld hw= ctx.getBean("hi", HelloWorld.class);
	System.out.println(hw.getName());
	
}
}
