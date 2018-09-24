package ex2;

public class TextMessageService implements MessageService {
	
	

	public TextMessageService() {
		
		System.out.println("Text Service is ready");
	}

	@Override
	public void send(String to, String msg) {
		System.out.println("SMS sent to" + to + "with" + msg);
	
	}

}
