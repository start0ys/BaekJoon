package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_1152 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split(" ");
		int sum = 0;
		for(int i = 0; i<str.length; i++) {
			if(str[i].isEmpty()) continue;
			sum += 1;
		}
		System.out.println(sum);

	}

}
