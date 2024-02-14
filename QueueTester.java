package queue;

public class QueueTester {
    public static void main(String[] args) {
        Queue queue = new QueueImpl(); // Crear una cola con capacidad para 3 elementos

        // Probar el método enQueue con diferentes argumentos
        queue.enQueue("A"); // La cola ahora contiene "A"
        queue.enQueue("B"); // La cola ahora contiene "A" y "B"
        queue.enQueue("C"); // La cola ahora contiene "A", "B" y "C"
        queue.enQueue("D"); // La cola está llena, por lo que se imprime "Sorry, the queue is full."

      
        for (int i = 0; i < Queue.size; i++) {
            System.out.println(Queue.arr[i]);
        }
    }
}