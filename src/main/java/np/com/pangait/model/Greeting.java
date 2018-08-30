package np.com.pangait.model;

/**
 * Created by Shova Yakami Dangol on 4/8/2018 10:42 AM.
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
