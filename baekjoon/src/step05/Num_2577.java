package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_2577 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = 1;
		for(int i = 0; i < 3; i++) {
			result *= Integer.parseInt(br.readLine());
		}
		String str = Integer.toString(result);
		for(int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (Integer.parseInt(str.substring(j, j+1)) == i) {
					count++;
				}
			}			
			System.out.println(count);
		}

	}
	

}
