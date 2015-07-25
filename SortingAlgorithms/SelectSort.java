import java.util.*;

public class SelectSort {

	public static void main(String[] args) {
		ArrayPrint printer = new ArrayPrint();
		int[] list = {3,44,38,5,47,15,36,26,2};
		sort(list);
		System.out.println(printer.printSort(list));
	}
	
	public static int[] sort(int[] list){
		int minimumUnsortedValue;
		int lowestUnsortedIndex = 0;
		int storage;
		minimumUnsortedValue = list[0];
		
		for (int j=0;j<list.length;j++){
			minimumUnsortedValue = list[lowestUnsortedIndex];
			for (int i=lowestUnsortedIndex;i<list.length;i++){
				if (list[i]<minimumUnsortedValue){
					storage = list[i];
					list[i] = minimumUnsortedValue;
					list[lowestUnsortedIndex] = storage;
					minimumUnsortedValue = list[lowestUnsortedIndex];
				}
			}
			lowestUnsortedIndex++;
		}
		return list;
	}
}
