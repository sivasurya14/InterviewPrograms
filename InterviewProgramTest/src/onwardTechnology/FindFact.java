package onwardTechnology;

public class FindFact {

	public static long factorial(int num) {

		if (num >= 1) {
			return num * factorial(num - 1);
		} else
			return 1;
	}

	public static void main(String[] args) {
           int num=5;
		System.out.println("the factorial of "+num+" is :"+ factorial(num));
 
	}

}
