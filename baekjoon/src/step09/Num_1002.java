package step09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Num_1002 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		int x1,y1,r1,x2,y2,r2,dPow,result;
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			r1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			r2 = Integer.parseInt(st.nextToken());
			
			dPow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			if(x1 == x2 && y1 == y2 && r1 == r2)  result = -1;
			else if(dPow > Math.pow(r1 + r2, 2))  result = 0;
			else if(dPow < Math.pow(r2 - r1, 2))  result = 0;
			else if(dPow == Math.pow(r2 - r1, 2)) result = 1;
			else if(dPow == Math.pow(r1 + r2, 2)) result = 1;
			else result = 2;
			
			sb.append(result);
			if(i < t-1) sb.append("\n");
		}
		System.out.println(sb);

	}

}
