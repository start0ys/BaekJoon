package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_1011 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String [] str;
		for(int i = 0; i < T; i++) {
			str = br.readLine().split(" ");
			int d = Integer.parseInt(str[1]) - Integer.parseInt(str[0]);
			int max = (int)Math.sqrt(d);
			int count = 0;
			if(max == Math.sqrt(d)) {
				count = max * 2 -1;
			}else {
				int minD = (int) Math.pow(max, 2);
				if(minD+max>=d) {
					count = max * 2;
				}else{
					count = max * 2 +1;
				}
			}
			System.out.println(count);
		}
	}

}
