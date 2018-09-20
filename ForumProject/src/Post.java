import java.util.ArrayList;

public class Post {
	private String feed;
	protected ArrayList<Reply> replies;
	protected int idx;

	public Post() {
	}

	public Post(String feed) {
		this.feed = feed;
		replies = new ArrayList<Reply>(10);
	}

	public void addReply(Reply reply) {
		replies.add(reply);
	}

	public void printReplies() {
		System.out.println("Post: " + feed);
		for (Reply reply : replies) {
			System.out.println(reply);
		}
	}
}
