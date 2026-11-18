import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");

        System.out.println("The front element is " + queue.peek());

        queue.remove();
        queue.remove();

        System.out.println("The front element is " + queue.peek());
        System.out.println("The queue size is " + queue.size());

        if (queue.isEmpty()) {
            System.out.println("The queue is empty");
        }
    }
}
 
    
