package stack;

public class StackTester {

	public static void main(String[] args) {

		Stack stackTester = new StackImpl(5);
		System.out.println(stackTester.isEmpty());
		stackTester.push("thing in stack");
		stackTester.push("another thing");
		stackTester.push("third thing");
		stackTester.size();
		System.out.println(stackTester.isFull());
		stackTester.push("yet another thing");
		stackTester.size();
		stackTester.push("last thing");
		System.out.println(stackTester.isFull());
		stackTester.peek();
		
		stackTester.display();
		

	}
	
	public static void runTests(Stack stack) {
	 	
	}

}
