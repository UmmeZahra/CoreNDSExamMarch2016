package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack<String> studentname = new Stack<String>();
		studentname.push("Syeda");
		studentname.push("Imran");
		studentname.push("Nobel");
		studentname.push("Fatima");

		System.out.println("Picking the top eliment of the sack" + studentname.peek());//Looks at the object at the top of this stack without removing it from the stack.
		System.out.println("Removing the top eliment of ths: "+ studentname.pop());//Removes the object at the top of this stack and returns that object as the value of this function.
		System.out.println("List of the eliment in ths: ");
		Iterator it = studentname.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Useing For Each loop to retrieve data.");
		for (String item : studentname) {
			System.out.println(item);
		}

	}

}
