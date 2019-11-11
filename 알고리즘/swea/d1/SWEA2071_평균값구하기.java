package swea.d1;

import java.util.Scanner;

public class SWEA2071_평균값구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			double sum = 0;
			for (int i = 0; i < 10; i++) {
				int n = sc.nextInt();
				sum += n;
			}
			System.out.println("#" + t + " " + Math.round(sum / 10));
		}
		sc.close();
	}

}
