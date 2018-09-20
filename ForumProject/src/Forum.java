import java.util.ArrayList;

public class Forum {
	private String topic;
	protected ArrayList<Post> posts;
	protected int idx;

	public Forum() {
	}

	public Forum(String topic) {
		this.topic = topic;
		posts = new ArrayList<Post>(5);
	}

	public void addPost(Post post) {
		posts.add(post);
	}

	public void showPost() {
		System.out.println("Post in forum topic: " + topic);
		/*
		 * for (int i = 0; i < idx; i++) { System.out.println(posts.);
		 * posts.get(i).printReplies();}
		 */

		for (Post post : posts) {
			post.printReplies();
		}
		// System.out.println(posts.get(i).toString());
	}

}
