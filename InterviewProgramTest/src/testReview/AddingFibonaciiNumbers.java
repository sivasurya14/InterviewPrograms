package testReview;

public class AddingFibonaciiNumbers {

	public static void main(String[] args) {

		int value = 12;

		int a = 0;
		int b = 1;
		int c = 0;
		int add = 0;
		System.out.println(a);

		for (int i = 0; i <= value - 2; i++) {

			a = b;
			b = c;
			c = a + b;

			add += c;

			System.out.println(c);
		}

		System.out.println("Total : " + add);
	}
}
