package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num_2751 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		int [] num = new int[n];
		for(int i = 0; i<n; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(num);
		for(int i = 0; i<n; i++) {
			sb.append(num[i]).append("\n");
		}
		System.out.println(sb);
			
	}

}
