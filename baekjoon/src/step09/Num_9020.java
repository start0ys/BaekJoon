package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_9020 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int t = Integer.parseInt(br.readLine());
		int num;
		boolean [] primeNum = new boolean[10001];
		primeNum[0] = primeNum[1] = true;
		for(int i =2; i<100; i++) {
			if(!primeNum[i]) {
				for(int j = i+i; j<10000; j+=i) {
					primeNum[j]=true;
				}
			}
		}
		for(int i = 0; i<t; i++) {
			num = Integer.parseInt(br.readLine());
			int a = num/2;
			int b = num/2;
			while(true) {
				if(!primeNum[a] && !primeNum[b]) {
					sb.append(b+" "+a).append("\n");
					break;
				}
				a+=1;
				b-=1;
			}
		}
		System.out.println(sb);

	}

}
