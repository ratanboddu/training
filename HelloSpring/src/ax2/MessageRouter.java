package ax2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component("router")
public class MessageRouter {
	@Autowired
	private ApplicationContext appCtx;

	public void processMessage(String type, String to, String msg) {
		MessageService service = (MessageService) appCtx.getBean(type);
		service.send(to, msg);
	}
}
