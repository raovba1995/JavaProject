package test;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 31;
		int y = 15;
		int temp;
		System.out.println("X = " + x);
		System.out.println("Y = " + y);

		System.out.println("After swapping");
		temp = y;
		y = x;
		x = temp;
		System.out.println("X = " + x);
		System.out.println("Y = " + y);

		// swapping without using 3rd variable
		int p = 50;
		int q = 12;

		p = p + q;// 62
		q = p - q;// 62-12=50
		p = p - q;// 62=50=12

		System.out.println("P = " + p);
		System.out.println("Q = " + q);

	}

}
