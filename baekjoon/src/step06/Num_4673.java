package step06;

import java.util.Arrays;

public class Num_4673 {

	public static void main(String[] args) {
		boolean [] chk  = new boolean[10001];
		for(int i = 1; i<=10000; i++) {
			if(d(i)<=10000) {
				chk[d(i)] = true;
			}
		}
		for(int i = 1; i<=10000; i++) {
			if(!chk[i]) {
				System.out.println(i);
			}
		}
	}
	
	public static int d (int n) {
		int result = 0;
		result += n;
		String [] str = Integer.toString(n).split("");
		for(int i = 0; i < str.length; i++) {
			result += Integer.parseInt(str[i]);
		}
		return result;
	}


}
