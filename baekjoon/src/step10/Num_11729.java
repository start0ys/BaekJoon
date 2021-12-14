package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_11729 {

	public static StringBuffer sb = new StringBuffer();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		sb.append((int)Math.pow(2, n)-1+"\n");
		hanoi(n,1,2,3);
		System.out.println(sb);
	}
	public static void hanoi(int n,int x,int y, int z) {		
		if(n==1) {
			sb.append(x+" "+z+"\n");
			return;
		}
		hanoi(n-1,x,z,y);
		sb.append(x+" "+z+"\n");
		hanoi(n-1,y,x,z);
		
	}
	
}
