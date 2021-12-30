package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_15651 {
	public static int [] arr;
	public static StringBuffer sb = new StringBuffer();
	public static int n,m;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		dfs(0);
		System.out.println(sb);

	}
	
	public static void dfs(int depth) {
		if(m == depth) {
			for(int result : arr) {
				sb.append(result + " ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i < n; i++) {
			arr[depth] = i + 1;
			dfs(depth+1);
				
		}
		return;
	}

}
