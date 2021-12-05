package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_2581 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int sum=0,min=0;
		boolean chk = true;
		for(int i = m; i<=n; i++) {
			if(i == 1) continue;
			for(int j = 2; j < i; j++) {
				if(i%j==0) {
					chk = false;
					break;
				}
			}
			if(chk) {
				sum += i;
				if(min == 0) min = i;
			}
			chk = true;
		}
		if(sum>0) {
            System.out.println(sum+"\n"+min);
		}else {
			System.out.println(-1);
		}

	}

}