package swea.d1;

import java.util.Scanner;

public class SWEA2050_���ĺ������ڷκ�ȯ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] input = sc.next().toCharArray();
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] - 64 + " ");
		}
		System.out.println();
		sc.close();
	}
}
