package main.java.com.di.forum;



import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by Jim on 20/10/2016.
 */
public class Forum {
    protected List<ForumSubscriber> subscribers;
    protected boolean changed = false;

    public Forum() { this.subscribers = new ArrayList<>(); }
    public void addSubscriber(ForumSubscriber subscriber) { subscribers.add(subscriber); }
    public void removeSubscriber(ForumSubscriber subscriber) { subscribers.remove(subscriber); }
    public void notifySubscribers(String post) {
        if(changed) {
            setChangedFalse();
            for(ForumSubscriber sub : subscribers) sub.notifyOnNewPost(this, post);
        }
    }

    public void setChangedTrue() { changed = true;}
    public void setChangedFalse() { changed = false;}


    private void doSth() {
        System.out.println("Forum");
    }
    protected void protectedDoSth() {
        System.out.println("protected Forum");
    }

    protected void unsubscribe(ForumSubscriber subscriber) {
        if(subscriber!=null && subscribers.contains(subscriber))
            subscribers.remove(subscriber);
    }
    protected void emptySubscriberList(){
        subscribers.clear();
    }
}
