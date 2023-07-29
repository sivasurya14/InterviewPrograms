package onwardTechnology;

public class FinallyBlockTest {

	int cal(int a) {

		try {

			return a / 0;
		}

		catch (Exception e) {
			return a * 5;

		}
//		finally {
//			return a * 10;
//		}

	}

	public static void main(String[] args) {

		FinallyBlockTest calc = new FinallyBlockTest();

		System.out.println(calc.cal(10));

	}

}
