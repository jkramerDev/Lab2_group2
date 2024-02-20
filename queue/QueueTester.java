package queue;

public class QueueTester{

public static void main(String[] args) {
    Queue queue = new QueueImpl();
    queue.enQueue("soccer");
    queue.enQueue("baseball");
    queue.enQueue("tennis");
    queue.display(); 
    System.out.println(); 
    System.out.println(queue.peek()); // 
    queue.display(); 
    }
}
