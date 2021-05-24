package solved_bronze5;
// input : a(앨범에 수록된 곡 개수) / i (앨범에 수록된 곡에 포함된 저작권 멜로디 개수 / a)
// a * i를 하면 앨범에 수록된 곡에 포함된 저작권 멜로디 개수가 나옴  
// 근데 i가 올림 처리를 했기 때문에 i-1 < i <= i 범위가 도출
// i-1로 계산했을 시, 올림 처리를 무시하기 때문에 그 결과값에 +1을 더한 값이
// 몇 곡이 저작권이 있는 멜로디인지의 최솟값 이다.

import java.util.Scanner;

public class BOJ_2914 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, i, x;
		a = sc.nextInt();
		i = sc.nextInt();
		
		x = a * (i - 1) + 1;
		
		System.out.println(x);
		
		
	}

}
