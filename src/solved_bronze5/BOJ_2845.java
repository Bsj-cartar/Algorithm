package solved_bronze5;
import java.util.Scanner;

public class BOJ_2845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, area;
		n = sc.nextInt();
		area = sc.nextInt();
		
		int[] a = new int[5];
		for(int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int b : a) {
			System.out.print(b - (n * area)+ " ");
			
		}

	}

}
