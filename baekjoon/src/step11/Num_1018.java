package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_1018 {
	public static boolean [][] chess;
	public static int result = 64;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		chess = new boolean[m][n];
		for(int i = 0; i<m;i++) {
			String str = br.readLine();
			for(int j = 0; j<n; j++) {
				if(str.charAt(j) == 'W') {
					chess[i][j] = true;
				}
			}
		}
		for(int i = 0; i<m-7;i++) {
			for(int j = 0; j<n-7; j++) {
				getCount(i,j);
			}
		}
		System.out.println(result);

	}
	public static void getCount(int x, int y) {
		boolean wb = chess[x][y];
		int count = 0;
		for(int i = x; i < x+8; i++) {
			for(int j = y; j < y+8; j++) {
				if(chess[i][j] != wb) count++;
				wb=!wb;
			}
			wb=!wb;
		}
		count = Math.min(count, 64-count);
		result = Math.min(result, count);
	}

}
