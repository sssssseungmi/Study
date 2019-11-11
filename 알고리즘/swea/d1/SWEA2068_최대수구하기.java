package swea.d1;

import java.util.Scanner;

public class SWEA2068_최대수구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int max = 0;
			for (int i = 0; i < 10; i++) {
				int n = sc.nextInt();
				if (max < n)
					max = n;
			}
			System.out.println("#" + t + " " + max);

		}
		sc.close();
	}
}
