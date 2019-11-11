package boj;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2503_숫자야구 {

	static int N, S, B;
	static int[] ANS;
	static int[][] QUEST;
	static boolean[] check;
	static int ansCnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		ANS = new int[3];
		check = new boolean[10];
		QUEST = new int[N][5];
		ansCnt = 0;
		for (int i = 0; i < N; i++) {
			int q = sc.nextInt();
			QUEST[i][0] = q / 100;
			QUEST[i][1] = (q % 100) / 10;
			QUEST[i][2] = q % 10;
			QUEST[i][3] = sc.nextInt();
			QUEST[i][4] = sc.nextInt();

		}
		dfs(0);

		sc.close();
	}

	static void dfs(int cnt) {
		if (cnt == 3) {
			for(int i=0; i<N; i++) {
				if(QUEST[i][3]==3) ansCnt++;
			}
			return;
		}
		for (int i = 1; i < 10; i++) {
			if(!check[i]) {
				ANS[cnt]=i;
				check[i]=true;
				dfs(cnt+1);
				check[i]=false;
			}
		}
	}

}
