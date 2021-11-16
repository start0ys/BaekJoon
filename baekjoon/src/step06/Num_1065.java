package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_1065 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 1; i<=size; i++) {
			if(hansu(i)) count +=1;
		}
		System.out.println(count);

	}
	
	public static boolean hansu(int n) {
		boolean result = false;
		String [] str = Integer.toString(n).split("");
		if(str.length < 3) return true;
		int a,b,c=0,d=0;
		for(int i = 1; i<str.length; i++) {
			a = Integer.parseInt(str[i-1]);
			b = Integer.parseInt(str[i]);
			if(i>1 && b-a != c) d=1;
			c = b-a;
		}
		if(d==0) result = true;
		return result;
	}

}
