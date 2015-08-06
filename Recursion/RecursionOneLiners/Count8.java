package RecursionOneLiners;

public class Count8 {
	public int count8(int n) {
	    return (n == 0) ? 0 : (n%10 != 8) ? count8(n/10) : ((n/10)%10 == 8) ? 2 + count8(n/10) : 1 + count8(n/10);
	}
}
