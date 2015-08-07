package RecursionOneLiners;

public class CountX {

	public static int countX(String str) {
		//this is a bit much
	    return (str.length() == 0) ? 0 : (str.endsWith("x")) ? 1 + countX(str.substring(0, str.length()-1)) : countX(str.substring(0, str.length()-1));
	}
}
