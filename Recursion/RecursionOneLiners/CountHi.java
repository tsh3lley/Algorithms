package RecursionOneLiners;

public class CountHi {
	public int countHi(String str) {
		
		return (str.length() == 0) ? 0 : (str.endsWith("hi")) ? 1 + countHi(str.substring(0, str.length()-1)) : countHi(str.substring(0, str.length()-1));
	}
}
