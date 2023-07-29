package testReview;

import java.util.Arrays;

public class Ca2bd3ca4 {

	public static void main(String[] args) {

		String value = "ca3bd2ab4";
	
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) >= 'a' && value.charAt(i) <= 'z') {
				System.out.print(value.charAt(i));
			} else {
				int a = Integer.parseInt(String.valueOf(value.charAt(i)));
				for (int j = 1; j < a; j++) {
					
					System.out.print(value.charAt(i - 2));
					System.out.print(value.charAt(i - 1));
				}
			}
		}

	}

}
