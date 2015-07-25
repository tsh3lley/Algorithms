import java.util.Random;
import java.util.Scanner;


public class BinarySearch {

	public static void main(String[] args) {
		Random rng = new Random();
		Scanner kb = new Scanner(System.in);
		System.out.println("How big should the array be?");
		int max = kb.nextInt();
		int theNum = rng.nextInt(max);
		System.out.println("Search should take no more than " + Math.ceil((Math.log(max)/Math.log(2))) + " guesses (log(x))");
		int[] numbers = new int[max+1];
		System.out.println("Number to find: " + theNum);
		
		
		for (int i=0;i<numbers.length;i++){
			numbers[i] = i;
		}
		System.out.println("Your number: " + guess(numbers,theNum));
		
	}
	
	public static int guess(int[] numbers, int theNum){
		int counter = 0;
		int min = 0;
	    int max = numbers.length - 1;
	        while (min <= max) {
	        	counter ++;
	            int mid = min + (max - min) / 2;
	            if (theNum < numbers[mid]){
	            	max = mid - 1;
	            } else if (theNum > numbers[mid]) {
	            	min = mid + 1;
	            } else {
	            	System.out.println("Required num guesses: " + counter);
	            	return mid;
	            }
	        }
	        return -1;
	}
}
