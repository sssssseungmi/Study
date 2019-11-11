package swea.d1;

import java.util.Scanner;

public class SWEA2058_자릿수더하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int sum = 0;
		while (N % 10 != 0) {
			sum += N % 10;
			N = N / 10;
		}
		System.out.println(sum);
		sc.close();
	}
}
