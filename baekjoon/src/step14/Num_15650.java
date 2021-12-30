package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_15650 {
	public static int [] arr;
	public static StringBuffer sb = new StringBuffer();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		dfs(n,m,0,0);
		System.out.println(sb);

	}
	
	public static void dfs(int n,int m,int depth,int idx) {
		if(m == depth) {
			for(int result : arr) {
				sb.append(result + " ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = idx; i < n; i++) {
			arr[depth] = i + 1;
			dfs(n,m,depth+1,i+1);
				
		}
		return;
	}

}
