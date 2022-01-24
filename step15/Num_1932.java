package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_1932 {
	public static int [][] arr;
	public static Integer [][] dp;
	public static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		arr = new int[n][n];
		dp = new Integer[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j <= i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
			
		}
		for(int i = 0; i<n; i++) {
			dp[n-1][i] = arr[n-1][i];
		}
		System.out.println(dfs(0,0));

	}
	public 	static int dfs(int depth, int idx) {
		if(depth == n - 1) return dp[depth][idx];
 
		if (dp[depth][idx] == null) {
			dp[depth][idx] = Math.max(dfs(depth + 1, idx), dfs(depth + 1, idx + 1)) + arr[depth][idx];
		}
		return dp[depth][idx];
 
	}

}
