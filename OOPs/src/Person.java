
public class Person implements Cloneable {
	private String name;
	private int age;

	public Person() {
		this("Anonymous", -1); // constructor chaining
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println("Name: " + name + "\tAge: " + age);
	}

	// changing/overriding toString method
	@Override
	public String toString() {
		return "Name: " + name + "\tAge: " + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if (p.name.equals(this.name) && p.age == age)
				return true;
		}
		return false;
	}

	@Override
	public void finalize() throws Throwable {
		System.out.println("Person is no more");
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		/*
		 * Person p1 = null; for (int c = 1; c <= 5; c++) p1 = new Person();
		 * 
		 * System.gc();
		 */
		// p1.print();
		/*
		 * System.out.println(p1.hashCode()); System.out.println(p1); // implicitly
		 * calls toString()
		 */
		/*
		 * Person p2 = new Person("Polo", 21); System.out.println(p1.equals(p2));
		 */

		Person p1 = new Person();
		Person p2 = (Person) p1.clone();
		System.out.println(p2);

	}
}
