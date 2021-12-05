package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_1978 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int result = 0, num;
		for(int i = 0; i<size; i++) {
			num = Integer.parseInt(st.nextToken());
			if(num == 1) continue;
			int count = 0;
			for(int j = 1; j<=num; j++) {
				if(num%j==0) count += 1;
			}
			if(count == 2) result += 1;
		}
		System.out.println(result);

	}

}
