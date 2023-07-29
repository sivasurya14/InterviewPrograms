package testReview;

public class RemoveCommaFromArray {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6, 7 };
		int res = 0, t = 1, m = 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			t = arr[i] * m;
			res = res + t;
			m = m * 10;
		}
		System.out.println(res);
		
		
		int total=0;
		for(int i:arr) {
			total=total*10+i;
		}
		System.out.println(total);

	}
}