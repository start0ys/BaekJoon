package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_11653 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int a = 2;
		boolean chk = true;
		StringBuffer sb = new StringBuffer();
		while(chk) {
			if(num%a == 0) {
				num = num/a;
				sb.append(a);
				if(num > 1) {
					sb.append("\n");
				}else {
					chk = false;
				}
			}else {
				a += 1;
			}
			if(num == 1) chk = false;
		}
		System.out.println(sb);
	}

}
