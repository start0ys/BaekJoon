package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_14889 {
	public static int N;
	public static int [][] arr;
	public static int MIN = Integer.MAX_VALUE;
	public static boolean [] chk;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int [N][N];
		chk = new boolean[N];
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0,0);
		System.out.println(MIN);
	}
	public static void dfs(int idx,int count) {
		if (count == N/2) {
			int start = 0;
			int link = 0;
			for(int i = 0; i < N-1; i++) {
				for(int j = i+1; j < N; j++) {
					if(chk[i]==true&&chk[j]==true) { 
						start += arr[i][j];
						start += arr[j][i];
					}else if(chk[i]==false&&chk[j]==false) {
						link += arr[i][j];
						link += arr[j][i];
					}
				}
			}
			int result = Math.abs(start-link);
			if(result == 0) {
				System.out.println(0);
				System.exit(0);
			}
			MIN = Math.min(MIN, result);
			return;
		}
		for (int i = idx; i < N; i++) {
			if(!chk[i]) {
				chk[i] = true;
				dfs(i+1, count + 1);
				chk[i] = false;

			}
				
		}
	}

}
