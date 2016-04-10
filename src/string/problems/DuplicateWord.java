package string.problems;

import javax.swing.*;
import java.util.*;

/**
 * Created by mrahman on 4/9/16.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        List< String > paraList = new ArrayList < String > ();
        paraList = Arrays.asList(st.split(" "));
        int size = paraList.size();

        int i = 0;
        Map < String, Integer > duplicatCountMap = new HashMap < String, Integer > ();
        for (int j = 0; size > j; j++) {
            int count = 0;
            for (i = 0; size > i; i++) {
                if (paraList.get(j).equals(paraList.get(i))) {
                    count++;
                    duplicatCountMap.put(paraList.get(j), count);
                }
            }
        }
        System.out.println(duplicatCountMap);
        System.out.println("length of the sentence: "+ size);
        int total = st.length()/size;
        System.out.println("Average length of the words: " + total);
    }

    }


