package math;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 * 
		 */
		
		int i, count = -1,z = 0;
		for(i=100;i >= 0; i--){ //for loop to count 0 to 100
			if(count == 10){
				count = 0;
				z++;
			}
			count++;
			i=i - z;
			System.out.println(i);

		}

		

	}
}
