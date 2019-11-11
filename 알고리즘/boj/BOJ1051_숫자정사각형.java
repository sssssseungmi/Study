package boj;

import java.util.Scanner;

public class BOJ1051_숫자정사각형 {

	static int N, M;
	static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N][M];
		for (int i = 0; i < N; i++) {
			char[] line = sc.next().toCharArray();
			for (int j = 0; j < M; j++) {
				map[i][j] = line[j] - 48;
			}
		}
		boolean check = false;
		int ans = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				for (int k = N < M ? N : M; k >= 1; k--) {
					if (i + k < N && j + k < M) {
						if (map[i][j] == map[i + k][j] && map[i][j] == map[i][j + k]
								&& map[i][j] == map[i + k][j + k]) {
							check = true;
							if (ans < (k + 1) * (k + 1))
								ans = (k + 1) * (k + 1);
						}

					}
				}
			}
		}
		if (!check) {
			System.out.println(1);
		} else {
			System.out.println(ans);
		}
		sc.close();
	}

}
