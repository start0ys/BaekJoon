package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_10250 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String [] str;
		int h,w;
		for(int i = 0; i < size; i++) {
			str = br.readLine().split(" ");
			if((Integer.parseInt(str[2]) % Integer.parseInt(str[0])) == 0) {
				w = Integer.parseInt(str[2]) / Integer.parseInt(str[0]);
				if(w<10) {
					System.out.println(str[0]+"0"+w);
				}else {
					System.out.println(str[0]+w);
				}
			}else {				
				h = Integer.parseInt(str[2]) % Integer.parseInt(str[0]);
				w = (Integer.parseInt(str[2]) / Integer.parseInt(str[0])) + 1;
				if(w<10) {
					System.out.println(h+"0"+w);
				}else {
					System.out.println(h+""+w);
				}
			}
			
			
		}

	}

}
