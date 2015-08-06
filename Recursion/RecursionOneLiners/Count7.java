package RecursionOneLiners;

public class Count7 {

	public int count7(int n) {
		
		return (n == 0) ? 0 : (n%10 == 7) ? 1 + count7(n/10) : count7(n/10);
	}
}
