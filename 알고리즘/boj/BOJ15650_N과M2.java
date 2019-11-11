package boj;

import java.util.Scanner;

public class BOJ15650_N°úM2 {

	static int N, M;
	static int[] arr;
	static boolean[] check;
	static StringBuilder sb;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[M];
		check = new boolean[N + 1];
		sb = new StringBuilder();

		dfs(0);
		System.out.println(sb);
		sc.close();
	}

	static void dfs(int index) {
		if (index == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i]);
				sb.append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 1; i <= N; i++) {
			arr[index] = i;
			dfs(index + 1);

		}

	}

}
