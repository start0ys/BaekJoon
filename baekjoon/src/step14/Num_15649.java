package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_15649 {
	public static int [] arr;
	public static boolean [] chk;
	public static StringBuffer sb = new StringBuffer();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		chk = new boolean[n];
		dfs(n,m,0);
		System.out.println(sb);

	}
	
	public static void dfs(int n,int m,int depth) {
		if(m == depth) {
			for(int result : arr) {
				sb.append(result + " ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(!chk[i]) {
				chk[i] = true;
				arr[depth] = i + 1;
				dfs(n,m,depth+1);
				chk[i] = false;
			}
		}
		return;
	}

}
