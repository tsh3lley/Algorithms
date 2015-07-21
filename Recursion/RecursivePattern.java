package Recursion;

public class RecursivePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      5
//		#####
//		####
//		###
//		##
//		#
//		 
//
//		 
//
//		#
//		##
//		###
//		####
//		#####
		draw(5);

	}
	public static void draw(int level){
		if (level == 0){
			System.out.println(" ");
		} else {
			System.out.println(hashtag(level));
			draw(level-1);
			System.out.println(hashtag(level));
		}
	}
	
	public static String hashtag(int num){
		String hash = "";
		for (int i=0;i<num;i++){
			hash = hash + "#";
		}
		return hash;
	}

}
