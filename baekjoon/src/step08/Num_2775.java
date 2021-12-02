package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_2775 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		int k,n;
		int [][] result = new int[15][15];
		
		for(int i = 0; i<15;i++) {
			result[i][1] = 1;
			result[0][i] = i;
		}
		
		for(int i = 1; i<15; i++) {
			for(int j = 2; j<15; j++) {
				result[i][j] = result[i][j-1] + result[i-1][j];
			}
		}
		
		
		for(int i = 0; i<tc; i++) {
			k = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			System.out.println(result[k][n]);
		}

	}

}
