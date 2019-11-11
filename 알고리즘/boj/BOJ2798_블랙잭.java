package boj;

import java.util.Scanner;

public class BOJ2798_블랙잭 {

	static int N, M;
	static int[] allCards;
	static boolean[] check;
	static int max;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();// 카드의 개수
		M = sc.nextInt();
		allCards = new int[N];
		check = new boolean[N];
		max = 0;
		for (int i = 0; i < N; i++) {
			allCards[i] = sc.nextInt();
		}
		three(0, 0, 0);
		System.out.println(max);
		sc.close();
	}

	public static void three(int index, int cnt, int sum) {
		if (index == 3) {
			if (sum <= M) {
				max = max <= sum ? sum : max;
			}
			return;
		}
		for (int i = cnt; i < N; i++) {
			if (!check[index]) {
				check[index] = true;
				sum += allCards[i];
				cnt++;
				three(index + 1, cnt, sum);
				sum -= allCards[i];
				check[index] = false;
			}
		}
	}

}
