import java.security.BasicPermission;

public class Person {
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private void print() {
		SecurityManager mgr = new SecurityManager();
		mgr.checkPermission(new BasicPermission("Private Method") {});
		System.out.println("Name: " + name + "\tAge: " + age);
	}

	@Override
	public String toString() {
		return "Name: " + name + "\tAge: " + age;
	}

}
