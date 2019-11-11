package swea.d2;

import java.util.Scanner;

public class SWEA1926_°£´ÜÇÑ369 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			boolean flag = false;
			int temp = i;
			while (temp != 0) {
				int digit = temp % 10;
				if (digit == 0) {
					temp = temp / 10;
					continue;
				}
				if (digit % 3 == 0 || digit % 6 == 0 || digit % 9 == 0) {
					System.out.print("-");
					temp = temp / 10;
					flag = true;
				} else {
					temp = temp / 10;
				}
			}
			if (!flag)
				System.out.print(i + " ");
			else
				System.out.print(" ");
		}

		sc.close();
	}

}
