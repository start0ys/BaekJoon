package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_9461 {
	private static Long [] arr = new Long [101];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int T = Integer.parseInt(br.readLine());
		arr[0] = (long)1; 
		arr[1] = (long)1; 
		arr[2] = (long)1;
		for(int i = 0; i < T; i++) {
			sb.append(p(Integer.parseInt(br.readLine())-1)+"\n");
		}
		System.out.println(sb);

	}
	public static long p(int n) {
		if(arr[n] == null) {
			arr[n] =  p(n-3) + p(n-2);
		}
		return arr[n];
	}

}
