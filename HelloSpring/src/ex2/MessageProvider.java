package ex2;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MessageProvider implements ApplicationContextAware {
	
	private ApplicationContext ctx;
	
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
		
	}
	
	public void process(String type,String to, String msg)
	{
		
		MessageService ms= (MessageService) ctx.getBean(type);
		ms.send(to, msg);
		
	}

	
}
