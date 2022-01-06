package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_1003 {
	private static int one,zero,zeroPlus;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			fiboCount(Integer.parseInt(br.readLine()));
			sb.append(zero+" "+one+"\n");
		}
		System.out.println(sb);

	}
	private static void fiboCount(int n) {
		zero = 1;
		one = 0;
		for(int i = 0; i < n; i++) {
			zeroPlus = zero;
			zero = one;
			one = zero+zeroPlus;
		}
		
	}

}
