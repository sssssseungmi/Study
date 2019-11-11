package swea.d2;

import java.util.Scanner;

public class SWEA1961_숫자배열회전 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			String[] answer90 = new String[N];
			String[] answer180 = new String[N];
			String[] answer270 = new String[N];
			for (int i = 0; i < N; i++) {

				answer90[i] = "";
				answer180[i] = "";
				answer270[i] = "";

			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			// 90도
			for (int j = 0; j < N; j++) {
				for (int i = N - 1; i >= 0; i--) {
					answer90[j] = answer90[j] + arr[i][j];
				}
			}
			// 180도
			for (int j = N - 1; j >= 0; j--) {
				for (int i = N - 1; i >= 0; i--) {
					answer180[N - j - 1] = answer180[N - j - 1] + arr[j][i];
				}
			}
			// 270도
			for (int j = N - 1; j >= 0; j--) {
				for (int i = 0; i < N; i++) {
					answer270[N - j - 1] = answer270[N - j - 1] + arr[i][j];
				}
			}
			// 출력
			System.out.println("#" + t);
			for (int i = 0; i < N; i++) {
				System.out.print(answer90[i] + " ");
				System.out.print(answer180[i] + " ");
				System.out.print(answer270[i] + " ");
				System.out.println();
			}
		}

		sc.close();
	}

}
