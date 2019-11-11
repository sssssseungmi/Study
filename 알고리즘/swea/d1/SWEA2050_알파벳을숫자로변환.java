package swea.d1;

import java.util.Scanner;

public class SWEA2050_알파벳을숫자로변환 {
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
