
public class TestForum {

	public static void main(String[] args) {

		Forum java = new Forum("Java");

		Post p = new Post("What is Java?");
		p.addReply(new Reply("Object Oriented Language"));
		p.addReply(new Reply("Platform independent"));
		java.addPost(p);
		System.out.println();

		Post p1 = new Post("New Feature in Java");
		p1.addReply(new Reply("Default methods"));
		p1.addReply(new Reply("Improved collections"));
		p1.addReply(new Reply("lambda expressions"));
		java.addPost(p1);

		java.showPost();

	}

}
