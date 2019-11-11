package boj;

import java.util.Scanner;

public class BOJ15649_N°úM1 {

	static int N, M;
	static int[] arr;
	static boolean[] check;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[M];
		check = new boolean[N + 1];

		dfs(0);
		sc.close();
	}

	static void dfs(int cnt) {
		if (cnt >= M) {
			for (int i = 0; i < M; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 1; i <= N; i++) {
			if (!check[i]) {
				arr[cnt] = i;
				check[i] = true;
				dfs(cnt + 1);
				check[i] = false;
			}
		}
	}

}
