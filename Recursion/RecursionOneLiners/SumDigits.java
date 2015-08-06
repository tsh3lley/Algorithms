package RecursionOneLiners;

public class SumDigits {
	
	public int sumDigits(int n) {
		
	    return (n < 1) ? 0 : (n%10) + sumDigits(n/10);
	}
}
