package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_7568 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		int [][] people = new int[n][2];
		StringTokenizer st;
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			people[i][0] = Integer.parseInt(st.nextToken());
			people[i][1] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0; i<n; i++) {
			int rank = 1;
			for(int j=0; j<n; j++) {
				if(people[i][0]<people[j][0] && people[i][1]<people[j][1]) rank++;
			}
			sb.append(rank).append(" ");
		}
		System.out.println(sb);
	}

}
