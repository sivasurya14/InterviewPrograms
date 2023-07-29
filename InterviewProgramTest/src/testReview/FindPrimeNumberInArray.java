package testReview;

public class FindPrimeNumberInArray {

	public static void main(String[] args) {

		int arr[] = { 8, 7, 0, 5, 3, 9, 11, 7 };

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0 || arr[i] == 1) {

				System.out.println(arr[i] + " is not prime number. ");
			}

		}

	}
}
