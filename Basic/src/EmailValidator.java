
public class EmailValidator {

	public static void main(String[] args) {
		// 1. Only one occurrence of @ and .
		// 2. minimum 4 letters before @
		// 3. minimum 3 letters between @ and .
		// 4. minimum 2 letters after .

		String email = "abcdef@mail.com";
		int a = email.indexOf("@");
		int b = email.indexOf(".");
		int c = email.length() - b - 1 ;

		if ((email.contains("@")) && (email.contains("."))) {
			if ((a >= 4) && ((b - a) >= 3) && (c >= 2)) {
				System.out.println("Email Valid");
			} else {
				System.out.println("Email Invalid");
			}
		} else {
			System.out.println("Email Invalid");
		}
		
	}

}
