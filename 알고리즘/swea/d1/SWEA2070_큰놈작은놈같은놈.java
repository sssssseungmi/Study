package swea.d1;

import java.util.Scanner;

public class SWEA2070_Å«³ğÀÛÀº³ğ°°Àº³ğ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			System.out.print("#"+t+" ");
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n<m) System.out.println("<");
			if(n==m) System.out.println("=");
			if(n>m) System.out.println(">");
		}
		sc.close();
	}
}
