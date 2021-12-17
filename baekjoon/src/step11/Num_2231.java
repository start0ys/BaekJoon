package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_2231 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result = 0;
		for(int n = 1; n <num; n++) {
			int sum = n,m = n;
			while(true) {
				sum += m%10;
				m /= 10;
				if(m==0) break;				
			}
			if(sum == num) {
				result = n;
				break;
			}
		}
		System.out.println(result);

	}
}
