package step01;

import java.util.Scanner;

public class Num_2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),
		    b = sc.nextInt();
		sc.close();
		System.err.println(a * (b%10));
		System.err.println(a * ((b/10)%10));
		System.err.println(a * (b/100));
		System.err.println(a * b);

	}

}
