package RecursionOneLiners;

public class Triangle {
	
	public int triangle(int rows) {
		
	    return (rows == 0) ? 0 : rows + triangle(rows -1);
	}
}
