package swea.d1;

import java.util.Scanner;

public class SWEA2072_Ȧ�������ϱ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int sum = 0;
			for (int i = 0; i < 10; i++) {
				int n = sc.nextInt();
				if (n % 2 == 1)
					sum += n;
			}
			System.out.println("#" + t + " " + sum);
		}

		sc.close();
	}

}
