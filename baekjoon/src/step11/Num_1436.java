package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_1436 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = 666;
		int count = 1;
		while(count != n) {
			result++;
			if(String.valueOf(result).contains("666")) count++;
		}
		System.out.println(result);
	}

}
