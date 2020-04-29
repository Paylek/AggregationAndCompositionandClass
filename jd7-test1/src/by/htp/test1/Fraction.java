package by.htp.test1;

public class Fraction{

	private int x;
	private int y;

	public void setX(int _x) {
		x = _x;
	}

	public void setY(int _y) {
		y = _y;
	}
	
	public void print() {
		System.out.println("x = " + x + ", y = " + y);
	}

	public int sumXY() {

		int sum;
		sum = x + y;

		return sum;
	}

	public int maxXY(){

		int max;
		
		max = Math.max(x,y);
		
		return max;
	}
	
}