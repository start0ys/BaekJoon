package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_1712 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]),
			b = Integer.parseInt(str[1]),
			c = Integer.parseInt(str[2]);
		if(b >= c) {
			System.out.println(-1);	
		}else {
			System.out.println((a/(c-b))+1);
		}
		
		
	}

}
