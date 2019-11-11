package swea.d1;

import java.util.Scanner;

public class SWEA2019_더블더블 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 1;
		System.out.print(ans + " ");
		for (int i = 1; i <= N; i++) {
			ans = 2 * ans;
			System.out.print(ans + " ");
		}

		sc.close();
	}

}
