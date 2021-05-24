package solved_bronze5;

import java.util.Scanner;

public class BOJ_2475 {

	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		int b = 0;
		for(int x : a) {
			b += Math.pow(x, 2);
		}
		System.out.println(b % 10);

	}

}
