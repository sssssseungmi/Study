package swea.d2;

import java.util.Scanner;

public class SWEA2001_�ĸ���ġ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt(); // �ĸ�ä ���� M*M
			int[][] area = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					area[i][j] = sc.nextInt();
				}
			}
			int max = 0;
			int sum = 0;
			for (int i = 0; i<N-M; i++) {
				for(int j=0; j<N-M; j++) {
					
				}
			}
			System.out.println();
		}

		sc.close();
	}

}
