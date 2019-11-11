package boj;

import java.util.Scanner;

public class BOJ1065_ÇÑ¼ö {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int ans = 0;
		if (X < 100) {
			ans = X;
		} else {
			ans = 99;
			for (int i = 100; i <= X; i++) {
				char[] temp = (i + "").toCharArray();
				boolean check = true;
				int d = temp[1] - temp[0];
				for (int k = 1; k < temp.length - 1; k++) {
					if (temp[k] + d != temp[k + 1]) {
						check = false;
						break;
					}
				}
				if (check)
					ans++;
			}
		}
		System.out.println(ans);

		sc.close();
	}
}
