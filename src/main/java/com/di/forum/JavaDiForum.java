package main.java.com.di.forum;

/**
 * Created by Jim on 21/10/2016.
 */
public class JavaDiForum extends Forum {

    @Override
    public void notifySubscribers(String post) {
        if (this.changed && post.contains("#java")) {
            for (ForumSubscriber sub : this.subscribers) sub.notifyOnNewPost(this, post);
        }
    }

}
