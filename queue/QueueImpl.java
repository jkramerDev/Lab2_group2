package queue;

public class QueueImpl implements Queue {

	@Override
	public boolean isFull() {
	
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

		
	public class Queue {
	    private String[] arr;
	    private int front;
	    private int rear;
	    private int size;

	    public Queue(int capacity) {
	        arr = new String[capacity];
	        front = 0;
	        rear = -1;
	        size = 0;
	    }

	    public void enQueue(String element) {
	        if (size == arr.length) {
	            throw new IllegalStateException("Queue is full");
	        }
	        rear = (rear + 1) % arr.length;
	        arr[rear] = element;
	        size++;
	    }

	    public String deQueue() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        String element = arr[front];
	        front = (front + 1) % arr.length;
	        size--;
	        return element;
	    }

	    public static String pollFirst() {
	        throw new UnsupportedOperationException("pollFirst() is a static method and cannot be called on an instance of Queue");
	    }

	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty");
	            return;
	        }
	        for (int i = front; i != rear; i = (i + 1) % arr.length) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println(arr[rear]);
	    }

	    public String peek() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        return arr[front];
	    }
	    
	  }


	@Override
	public void enQueue(String element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deQueue() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return null;
	}


		
	}

