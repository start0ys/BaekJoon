package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_1929 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		boolean [] chk = new boolean[n+1];
		chk[0] = chk[1] = true;
		for(int i = 2; i<=Math.sqrt(n); i++) {
			if(!chk[i]) {
				for(int j = i+i; j<=n; j+=i) {
					chk[j] = true;
				}
			}
		}
		for(int i=m; i<=n; i++) {
			if(!chk[i]) sb.append(i).append("\n");
		}
		System.out.println(sb);

	}

}
