package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num_2562 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0,
			idx = 0,
			num;
		for (int i = 0; i < 9; i++) {
			num = Integer.parseInt(br.readLine());
			if(num>max) {
				max = num;
				idx = i+1;
			}
		}
		System.out.println(max+"\n"+idx);

	}

}
