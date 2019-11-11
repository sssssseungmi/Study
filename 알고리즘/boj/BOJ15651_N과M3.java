package boj;

import java.util.Scanner;

public class BOJ15651_N°úM3 {

	static int N, M;
	static int[] arr;
	static boolean[] check;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[M];
		check = new boolean[N + 1];

		dfs(0,1);
		sc.close();
	}

	static void dfs(int index, int cnt) {
		if (index == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = cnt; i <= N; i++) {
			if (!check[i]) {
				arr[index] = i;
				check[i] = true;
				cnt++;
				dfs(index+1, cnt);
				check[i] = false;
			}
		}

	}

}
