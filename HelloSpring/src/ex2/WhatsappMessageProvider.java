package ex2;

public class WhatsappMessageProvider implements MessageService {

	public WhatsappMessageProvider() {

		System.out.println("Whatsapp Service is ready");
	
	}

	@Override
	public void send(String to, String msg) {
		System.out.println("Whatsapp sent to" + to + "with" + msg);
	}

}
