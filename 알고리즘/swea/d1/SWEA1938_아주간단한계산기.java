package swea.d1;

import java.util.Scanner;

public class SWEA1938_아주간단한계산기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);

		sc.close();
	}

}
