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
	    private int size;
	    private int ini; // Initialize the ini variable

	    public Queue(int capacity) {
	        arr = new String[capacity];
	        size = 0;
	        ini = 0; // Set the initial index to 0
	    }

	    public void enQueue(String element) {
	        if (isFull()) {
	            System.err.println("Sorry, the queue is full.");
	        } else if (isEmpty()) {
	            arr[0] = element;
	            size++;
	        } else {
	            for (int i = size - 1; i >= ini; i--) {
	                arr[i + 1] = arr[i];
	            }
	            arr[ini] = element;
	            size++;
	            ini++; // Increment the ini variable after adding an element
	        }
	    }

	public String deQueue() {
		// TODO Auto-generated method stub
		return null;
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}

	public String peek() {
		// TODO Auto-generated method stub
		return null;
	} 

}


	@Override
	public void enQueue(String element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		return null;
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
	
