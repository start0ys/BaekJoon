package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_4153 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		int a,b,c,max1,max2;
		while(true) {
			st = new StringTokenizer(str);
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			max1 = Math.max(a, b);
			max2 = Math.max(max1, c);
			if(max2 == a) {
				if(a*a == c*c + b*b) {
					sb.append("right");
				}else {
					sb.append("wrong");
				}
			}else if(max2 == b) {
				if(b*b == a*a + c*c) {
					sb.append("right");
				}else {
					sb.append("wrong");
				}
			}else {
				if(c*c == a*a + b*b) {
					sb.append("right");
				}else {
					sb.append("wrong");
				}
			}
			str = br.readLine();
			if(str.equals("0 0 0")) {
				break;
			}else {
				sb.append("\n");
			}	
			
		}
		System.out.println(sb);

	}

}
