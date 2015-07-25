
public class InsertSort {

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

		for (int i=1;i<list.length;i++){
			for (int j=i;j>0;j--){
				if (list[j]<list[j-1]){
					storage=list[j];
					list[j]=list[j-1];
					list[j-1]=storage;
				}
				else{
				}
			}
			lowestUnsortedIndex++;
		}
		return list;
	}

}
