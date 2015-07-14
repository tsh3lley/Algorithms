
public class BubbleSort {

	public static void main(String[] args) {
		ArrayPrint printer = new ArrayPrint();
		int[] list = {3,44,38,5,47,15,36,26,2};
		sort(list);
		System.out.println(printer.printSort(list));
	}
	
	public static int[] sort(int[] list){
		boolean done = false;
		int storage;
		
		while (done == false){
			done = true;
			for (int i=1;i<list.length;i++){
				if (list[i]<list[i-1]){
					storage=list[i];
					list[i]=list[i-1];
					list[i-1]=storage;
					done = false;
				}
			}
					
		}
		return list;
	}
}
