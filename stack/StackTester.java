package stack;

public class StackTester {

	public static void main(String[] args) {

		Stack stack = new StackImpl(8);					//initializes the Stack
		stack.push("John Doe");							//add rider
		stack.push("Bob McDonald");						//add rider
		stack.push("Billy Kennedy");					//add rider
		stack.push("Jane Foe");							//add rider
		stack.push("Zach Don");							//add rider
		stack.push("Mia Thompson");						//add rider
		stack.display();								//print stack
		System.out.println();
		stack.peek();									//peek at stack
		System.out.println();
		stack.pop();									//pop top item
		stack.display();								//print stack
		System.out.println();
		stack.peek();									//peek at stack
		System.out.println();
		stack.push("Jeremy West");						//add rider
		stack.push("Frank kay");						//add rider
		stack.peek();									//peek at stack
		System.out.println();
		while (stack.isEmpty() == false) {				//while stack is not empty
			stack.pop();								//pop top item
		}
		System.out.println(stack.isEmpty());			//prints if stack is empty
	
	}
}
