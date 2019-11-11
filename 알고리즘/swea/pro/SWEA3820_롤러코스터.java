package swea.pro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SWEA3820_롤러코스터 {

	static class Rail {
		int a;
		int b;

		public Rail() {
			super();
		}

		public Rail(int a, int b) {
			super();
			this.a = a;
			this.b = b;
		}
	}

	static int N;
	static long V;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			N = sc.nextInt();
			V = 1;
			Rail[] rails = new Rail[N];
			for (int i = 0; i < N; i++) {
				rails[i] = new Rail(sc.nextInt(), sc.nextInt());
			}
			Arrays.sort(rails, new Comparator<Rail>() {
				@Override
				public int compare(Rail x, Rail y) {
					if ((long) (y.a - 1) * (long) x.b <= (long) (x.a - 1) * (long) y.b) {
						return -1;
					} else
						return 1;
				}
			});
			for (int i = 0; i < N; i++) {
				V = (rails[i].a * V + rails[i].b) % 1000000007;
			}

			System.out.println("#" + t + " " + V % 1000000007);
		}

		sc.close();
	}

}
