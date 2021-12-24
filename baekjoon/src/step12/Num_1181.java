package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num_1181 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		String [] arr = new String[n];
		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		Arrays.sort(arr);
		Arrays.sort(arr, (e1, e2)->{
			return e1.length()-e2.length();
		});
		for(int i = 0; i < n; i++) {
			if(i>0&&arr[i-1].equals(arr[i])) continue;
			sb.append(arr[i]+"\n");
		}
		System.out.println(sb);
	}

}
