package ax4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ax1.HelloWorld;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {AppConfig.class})
public class SpringTestConfig {
	@Autowired
	private HelloWorld hw;
	
	@Test
	public void testCase() {
		System.out.println(hw.getName());
		
	}

}
