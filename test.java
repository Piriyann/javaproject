import java.util.*;

public class  test{
    public static void main(String args[]) {
        
        Queue<String>pq = new PriorityQueue<>();

        pq.add("Hello");
        pq.add("to");
        pq.add("programming");
        System.out.println("initial queue " + pq);
        pq.remove("Hello");

        System.out.println("After Remove" + pq);
        System.out.println("poll method" + pq.poll());
        System.out.println("final Queue" + pq);
    }
}