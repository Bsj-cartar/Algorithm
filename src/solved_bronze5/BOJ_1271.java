package solved_bronze5;
import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_1271 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a, b;
		a = sc.next();
		b = sc.next();
		BigInteger bigA = new BigInteger(a);
		BigInteger bigB = new BigInteger(b);
	
		
		System.out.println(bigA.divide(bigB));
		System.out.println(bigA.remainder(bigB));

	}

}
