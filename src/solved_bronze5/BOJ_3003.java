package solved_bronze5;
import java.util.Scanner;

public class BOJ_3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = {1,1,2,2,2,8};
		int[] b = new int[6];
		for(int i = 0; i < 6; i++) {
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < 6; i++) {
			System.out.print(a[i] - b[i] + " ");
		}

	}

}
