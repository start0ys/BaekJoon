package step02;

import java.util.Scanner;

public class Num_1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.println(a>b?">":(a<b?"<":"=="));

	}

}
