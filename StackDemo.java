import java.util.*;

public class StackDemo {
	public static void main(String args[]) {

		// Creating an empty Stack
		Stack<String> stack = new Stack<String>();

		// Use add() method to add elements in the Stack
		stack.add("Geeks");
		stack.add("for");
		stack.add("Geeks");
		stack.add("10");
		stack.add("20");

		// Output the Stack
		System.out.println("Stack: " + stack);

		// Creating an empty Stack
		Stack<String> stack2 = new Stack<String>();

		// Use add() method to add elements in the Stack
		stack2.add("Geeks");
		stack2.add("for");
		stack2.add("Geeks");

		// Remove the head using remove()
		boolean changed = stack.removeAll(stack2);

		// Print the result
		if (changed)
			System.out.println("Collection removed");
		else
			System.out.println("Collection not removed");

		// Print the final Stack
		System.out.println("Final Stack: " + stack);
	}
}
