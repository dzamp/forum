package main.java.com.di.forum;

/**
 * Created by Jim on 21/10/2016.
 */
public class ForumUser implements ForumSubscriber{
    protected String name;
    protected String AM;
    protected String email;

    public ForumUser(String name, String AM, String email) {
        this.name = name;
        this.AM = AM;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAM() {
        return AM;
    }

    public void setAM(String AM) {
        this.AM = AM;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "name='" + name + '\'' +
                ", AM='" + AM + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public void notifyOnNewPost(Forum forum, String post) {
        System.out.println(this.toString() + " has been notified of the new post: " + post);
    }
}
