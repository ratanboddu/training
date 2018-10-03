package ctrl;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.xml.internal.ws.transport.http.client.HttpClientTransport;

import bean.PaymentBean;

@Controller
public class PaymentController {

	@RequestMapping("process.go")
	public String processPayment(PaymentBean bean, Map model,HttpServletRequest request) {
		model.put("Pay", bean);
		String referer=request.getHeader("referer");
		String addr=request.getRemoteAddr();
		
		int lisl = referer.lastIndexOf("/");
		String trimmed = referer.substring(0, lisl+1);
		String target = trimmed.replace("localhost", addr);
	
		model.put("Target", target);
		System.out.println(Url);
		return "home";
	}
}
