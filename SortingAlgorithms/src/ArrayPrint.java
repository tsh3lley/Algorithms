//Write a method named print that accepts an array of integers as a parameter and that prints the contents of the array to
//System.out as a bracketed, comma-separated list. For example, if a variable called list stores the following values:
//
//int[] list = {3, 19, 27, 4, 98, 304, -9, 72};
//Then the call of print(list); should produce the following output:
//
//[3, 19, 27, 4, 98, 304, -9, 72]
//Your method should produce a complete line of output.
//public class ArrayPrint {
import java.util.*;

public class ArrayPrint{
	
	public ArrayPrint() {
	}
	
	public static String printSort(int[] unsorted){
		String sorted = "[";
		for (int i=0;i<unsorted.length;i++){
			sorted = sorted + unsorted[i];
			if (i == unsorted.length - 1){
				sorted = sorted + "]";
			}
			else{
				sorted = sorted + ", ";
			}
		}
		return sorted;
	}
}
