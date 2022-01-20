package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_1149 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int r,g,b;
		int [][] rgb = new int[n+1][3];
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			r = Integer.parseInt(st.nextToken());
			g = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			rgb[i][0] = Math.min(rgb[i-1][1], rgb[i-1][2]) + r;
			rgb[i][1] = Math.min(rgb[i-1][0], rgb[i-1][2]) + g;
			rgb[i][2] = Math.min(rgb[i-1][0], rgb[i-1][1]) + b;
		}
		System.out.println(Math.min(rgb[n][0], Math.min(rgb[n][1], rgb[n][2])));
	}
}
