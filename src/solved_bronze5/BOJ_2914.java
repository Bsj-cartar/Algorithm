package solved_bronze5;
// input : a(�ٹ��� ���ϵ� �� ����) / i (�ٹ��� ���ϵ� � ���Ե� ���۱� ��ε� ���� / a)
// a * i�� �ϸ� �ٹ��� ���ϵ� � ���Ե� ���۱� ��ε� ������ ����  
// �ٵ� i�� �ø� ó���� �߱� ������ i-1 < i <= i ������ ����
// i-1�� ������� ��, �ø� ó���� �����ϱ� ������ �� ������� +1�� ���� ����
// �� ���� ���۱��� �ִ� ��ε������� �ּڰ� �̴�.

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
