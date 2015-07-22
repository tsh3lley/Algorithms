package Recursion;
import java.util.Scanner;

//uses various methods to check if a number is a power of two

public class PowerOfTwo{
   public static void main(String[] ags){
	  Scanner kb = new Scanner(System.in);
	  System.out.println("What number would you like to check?");
	  int n = kb.nextInt();
      System.out.println( logCheck(n) );
      System.out.println( binaryCheck(n) );
      System.out.println( recursiveCheck(n) );
      
   }
   //if log base 2 of n is a whole number, n is a power of 2
   public static boolean logCheck(int n){
	  if (n<0) n = -n;
      if((Math.log10(n)/Math.log10(2)) % 1 == 0) return true;
      else return false;
   }
   
   //bitwise &
   //1000000 = 64 (2^6)
   //0111111 = 63 (n-1)
   //-------  bitwise &
   //0000000 
   public static boolean binaryCheck(int n){
		  if (n<0) n = -n;
		  if ((n & (n - 1)) == 0) return true;
	      else return false;
   }
   
   //recursively divide n by two, if it eventually equals exactly 1, n is a whole number
   public static boolean recursiveCheck(double n){
	   
	   if (n < 1) return false;
	   else if (n==1) return true;
	   return recursiveCheck(n/2);
   }
}