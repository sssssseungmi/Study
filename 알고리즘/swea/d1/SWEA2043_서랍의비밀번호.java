package swea.d1;

import java.util.Scanner;

public class SWEA2043_�����Ǻ�й�ȣ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int P = sc.nextInt();
		int K = sc.nextInt();
		int i = 1;
		while (true) {
			K++;
			i++;
			if (K == P)
				break;

		}
		System.out.println(i);

		sc.close();
	}

}
