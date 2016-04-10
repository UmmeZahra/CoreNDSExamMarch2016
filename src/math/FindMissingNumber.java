package math;

import java.util.ArrayList;

/**
 * Created by mrahman on 4/9/16.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Use some static helper method to find it.
         */

        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int length = array.length;
        int n = 10;
        int values = 0;

        for (int i = 0; i < length; i++) {
            n += i+1;
            values += array[i];
        }
        int result = n - values;
        System.out.println("Missing number is: "+result);
    }
}
