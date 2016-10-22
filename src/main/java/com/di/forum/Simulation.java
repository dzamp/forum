package main.java.com.di.forum;

/**
 * Created by Jim on 21/10/2016.
 */
public class Simulation {
    public static void main(String[] args) {
        Forum diForum = new Forum();
        System.out.println("The di forum becomes operational");
        ForumUser bob =  new ForumUser("bob", "1115201900001", "sdi1900001@di.uoa.gr");
        System.out.println("User bob appears and wants to subscribe!");
        diForum.addSubscriber(bob);
        ForumUser alice =  new ForumUser("alice", "1115201900002", "sdi1900002@di.uoa.gr");
        System.out.println("User Alice apppears and wants to subscribe!");
        diForum.addSubscriber(alice);
        ForumUser mark =  new ForumUser("mark", "1115201900003", "sdi1900003@di.uoa.gr");
        System.out.println("User Mark apppears and wants to subscribe!");
        diForum.addSubscriber(mark);
        System.out.println("A new post appears!");
        diForum.setChangedTrue();
        diForum.notifySubscribers("Hello I am new do you know which days the secreteriat is open?");

        Forum javaDiForum = new JavaDiForum();
        javaDiForum.addSubscriber(bob);
        javaDiForum.addSubscriber(alice);
        javaDiForum.addSubscriber(mark);
        javaDiForum.setChangedTrue();
        javaDiForum.notifySubscribers("#java, how to implement bridge pattern?");

    }
}
