package swea.d2;

import java.util.Scanner;

public class SWEA1859_백만장자프로젝트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int[] arr = new int[N];

			long answer = 0;

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = N - 1; i > 0; i--) {
				int max = arr[i];
				for (int j = i - 1; j >= 0; j--) {
					if (max > arr[j])
						answer += (max - arr[j]);
					else {
						i = j + 1;
						break;
					}
					if (j == 0)
						i = 0;
				}

			}
			System.out.println("#" + t + " " + answer);

		}

		sc.close();
	}

}
