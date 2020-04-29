package by.htp.test1;

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		int sum;
		int max;
		
		Fraction t = new Fraction();
		
		t.setX(3);
		t.setY(4);
		
		t.print();
		sum = t.sumXY();
		max = t.maxXY();
		
		System.out.println("Сумма равна " + sum + " наибольшее значение " + max);
	}

}
