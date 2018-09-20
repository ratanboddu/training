import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {
	public static void main(String[] args) {
		// ResourceBundle bundle = ResourceBundle.getBundle("message",
		// Locale.FRENCH);//defined languages

		Locale hindi = new Locale("hi", "in");// explicitly defined
		ResourceBundle bundle = ResourceBundle.getBundle("message", hindi);

		System.out.println(bundle.getString("greeting"));
		System.out.println(bundle.getString("message"));
	}
}
