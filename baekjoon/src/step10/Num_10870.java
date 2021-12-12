package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_10870 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(fibo(Integer.parseInt(br.readLine())));

	}
	
	public static int fibo(int n) {
		if(n == 1) return 1;
		if(n == 0) return 0;
		return fibo(n-2)+fibo(n-1);
	}

}
