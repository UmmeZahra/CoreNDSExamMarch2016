package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Map<String,ArrayList<String>> capitelOfcountries = new HashMap<String,ArrayList<String>>();

		ArrayList<String> listOfState = new ArrayList<>();
		//Appends the specified element to the end of this list.
		listOfState.add("NY");
		listOfState.add("AR");
		listOfState.add("HI");
		listOfState.add("NJ");
		listOfState.add("VA");
		capitelOfcountries.put("USA",listOfState);
		System.out.println("Name of some citis of USA : ");

		Iterator it = capitelOfcountries.entrySet().iterator();// enter to iterator through map.entrySet
		while(it.hasNext()){
			System.out.println(it.next());

	}
		for(Map.Entry <String,ArrayList<String>> cursor:capitelOfcountries.entrySet()) {
		System.out.println("Key: " + cursor.getKey()+"  " + "Value: "+cursor.getValue());
		 }

}}
