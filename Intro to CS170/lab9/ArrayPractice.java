/*
THIS CODE IS MY OWN WORK. IT WAS WRITTEN WITHOUT CONSULTING CODE WRITTEN BY OTHER STUDENTS OR MATERIALS OTHER THAN THIS SEMESTER'S COURSE MATERIALS. TAMER_AVCI
*/

import java.util.Random;
import java.util.Arrays;

public class ArrayPractice {
	public static void printReverse(int[] a) {
		/*TODO: write code to print number in array in reverse */
                int[] b = new int[a.length];
 	        int x = 0;
                for (int i = a.length-1; i > -1; i--) {
                    b[x]=a[i];
                    x++;
                }
                System.out.println(Arrays.toString(b));
	}

	public static int minGap(int[] a) {
		/*TODO: complete this method to find the minimum gap between
		two elements as defined in the lab handout*/
                int minGap = Math.abs(a[0] - a[1]);
                for (int i=0; i<a.length-1; i++) {
                    for (int b=i+1; b<a.length; b++) {
                        minGap = Math.min(minGap, Math.abs(a[i]-a[b]));
                    }
                }
                return minGap;
	}

	public static int[] collapse(int[] a) {
		/*TODO: write code to "collapse" the array (as defined in the lab handout*/
                int[] b = new int [a.length/2];           
                int x = 0;
                for (int i=0; i+1<a.length; i+=2) {
                    b[x] = a[i] + a[i+1];
                    x++;
                }
                return b;
	}

	public static void main(String[] args) {
		Random generator = new Random();

		//declare our initial array
		int[] a; 
		
		//check to make sure user enters a command line argument
		if (args.length != 1) {
			System.out.println("You must enter an integer as a command line argument to run this program.");
			System.exit(1);
		}

                // I added this to make sure user enters an int greater than 1
                if (Integer.parseInt( args [0] ) < 2 ) {
                        System.out.println("You must enter an integer greater than 1 to run the minGap method.");
			System.exit(1);
	
                } 
	
		/*TODO: modify program so that it takes a command line argument specifying
		the number of integers to put into an array*/
                a = new int[Integer.parseInt( args[0] )];
                


		//populate array with random numbers between 0 and 99
		for (int i = 0; i < a.length; i++) {
			a[i] = generator.nextInt(100);
		}

		System.out.println(Arrays.toString(a));

		/*TODO: uncomment the function calls below as you complete the related 
		functions. You should test each function to make sure it works before 
		moving on to the next one. */

		printReverse(a);

		int min = minGap(a);
		System.out.println("The minimum gap is: " + min);
		
		int[] c = collapse(a);
		System.out.println(Arrays.toString(c));

	}
}
