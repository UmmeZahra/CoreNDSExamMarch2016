package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		List<String> listOfState = new ArrayList<>();
		//Appends the specified element to the end of this list.
		listOfState.add("NY");
		listOfState.add("AR");
		listOfState.add("HI");
		listOfState.add("NJ");
		listOfState.add("VA");
		System.out.println("Some of the State of USA");
		Iterator it = listOfState.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		// retrieving data from string list array in for loop
		System.out.println("Use For Each loop to retrieve data: ");
		for(String item:listOfState){

			System.out.println(item);
		}


		//Returns the element at the specified position in this list.
		System.out.println("This one of the populer state of USA"+"\n"+listOfState.get(2));
		System.out.println(listOfState.remove(3)); // Removes the element at the specified position in this list.
		System.out.println(listOfState.size()); //Returns the number of elements in this list.

	}

	}

