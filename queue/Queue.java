package queue;

public interface Queue {

	 int size = 0;      // initialize the size in 0 
	char[] arr = null;  // initialize the variable (array) empty 

	boolean isFull() ;
	boolean isEmpty();
	 
	 // insert elements to the queue
	 public void enQueue(String element);
	  
	  // delete element from the queue
	 public void deQueue();
	  
	  // display element of the queue
	 public void display();
	  
	  //display 'first' element 
	 public String peek();
	
}
