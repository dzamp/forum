package main.java.com.di.forum;

/**
 * Created by Jim on 20/10/2016.
 */
public interface ForumSubscriber  {
    //check why we need to add the observable object here
    public void notifyOnNewPost(Forum forum, String post);

}
