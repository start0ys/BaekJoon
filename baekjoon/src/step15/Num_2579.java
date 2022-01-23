package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_2579 {
	public static int [] arr;
	public static Integer [] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		dp = new Integer[n+1];
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());			
		}
		dp[0] = arr[0];
		dp[1] = arr[1];
		if(n>=2) {
			dp[2] = arr[1] + arr[2];
		}
		System.out.println(dfs(n));

	}
	public 	static int dfs(int n) {
		if (dp[n] == null) {
			dp[n] = Math.max(dfs(n-2), dfs(n-3) + arr[n-1]) + arr[n];
		}
		return dp[n];
 
	}

}