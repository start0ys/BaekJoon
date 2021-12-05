package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_4948 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int num = Integer.parseInt(br.readLine());
		while(num > 0) {
			boolean [] chk = new boolean[num*2+1];
			int count = 0;
			chk[0] = chk[1] = true;
			for(int i = 2; i<=Math.sqrt(num*2); i++) {
				if(!chk[i]) {
					for(int j = i+i; j<=num*2; j+=i) {
						chk[j] = true;
					}
				}
			}
			for(int i = num+1; i<=num*2; i++) {
				if(!chk[i]) count++;
			}
			sb.append(count);
			num = Integer.parseInt(br.readLine());
			if(num>0) sb.append("\n");
		}
		System.out.println(sb);

	}

}
