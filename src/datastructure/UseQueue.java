package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> customer = new LinkedList<>();
		// customer.add("Tom");
		customer.add("Jony");
		customer.add("Ceara");
		customer.add("Mohammer");
		customer.add("Sharmin");
		Iterator it = customer.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("Remove the hof the queue: "+ customer.remove()); //Retrieves and removes the head of this queue.
		System.out.println("Retrieve the hade of the queue: "+customer.peek()); //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		System.out.println("Use For Each loop to retrieve data.");
		for(String item:customer){
			System.out.println(item);
		}
	}

}
