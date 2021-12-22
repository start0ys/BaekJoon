package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num_2108 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		int [] num = new int[n];
		int sum = 0,max=0,count=0,frequency=0;
		boolean chk = false;
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(br.readLine());
			sum += num[i];
		}
		Arrays.sort(num);
		for(int i = 0; i < n; i++) {
			if(i>0) {
				if(num[i-1] == num[i]) {
					count++;
					if(count>max) {
						max=count;
						frequency = num[i];
						chk = true;
					}else if(count == max && chk == true) {
						frequency = num[i];
						chk = false;
					}
				}else {
					count = 0;
				}
			}
		}
		if(max == 0) {
			if(num.length > 1) {				
				frequency = num[1];
			}else {
				frequency = num[0];
			}
		}
		sb.append((int)Math.round((double)sum/n)).append("\n");
		sb.append(num[n/2]).append("\n");
		sb.append(frequency).append("\n");
		sb.append(num[n-1]-num[0]);
		System.out.println(sb);
		

	}

}
