package ax5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {
@Test
public void test() {
	
	 AnnotationConfigApplicationContext acac=new AnnotationConfigApplicationContext(AppConfig.class);
	ApplicationContext ctx = acac; /*new AnnotationConfigApplicationContext(AppConfig.class);*/
	ClassA classA=ctx.getBean(ClassA.class);
	/*ClassB classB=ctx.getBean(ClassB.class);*/
	//classA.someMethod();
}
}
