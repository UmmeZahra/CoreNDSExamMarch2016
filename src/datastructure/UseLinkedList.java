package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		LinkedList<String> nameofcitys = new LinkedList();
		nameofcitys.add("New York");
		nameofcitys.add("Florida");
		nameofcitys.add("Boston");
		nameofcitys.add("Ohio");
		nameofcitys.add("California");
		nameofcitys.add("Chicago");
		nameofcitys.add("Washington");


		System.out.println("List of some citys name of USA" );

		Iterator it = nameofcitys.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("Peek thft elements of the list: "+ nameofcitys.peekFirst());
		nameofcitys.remove(3);// Removes the element at the specified position in this list.
		System.out.println("Retrieving first elements: "+ nameofcitys.peek());
		System.out.println("first city name is : " + nameofcitys.element()); //Retrieves, but does not remove, the head (first element) of this list.
		System.out.println("Ritriving data using for loop: ");
		for(String item:nameofcitys){
			System.out.println(item);
		}


	}

}
