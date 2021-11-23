package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_1316 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int count = 0;
		int nextNum = 0;
		int chk = 0;
		String str;
		for(int i = 0; i < size; i++) {
			str = br.readLine();
			if(str.length() == 2 || str.length() == 1) {
				count++;
				continue;
			}
			for(int j = 0; j<str.length(); j++) {
				nextNum = j+1;
				for(int k = j+1; k<str.length();k++) {
					if(str.charAt(j) != str.charAt(k)) {
						nextNum = k;
						break;
					}
					nextNum = 0;
				}
				if(nextNum == 0) break;
				for(int a = nextNum; a<str.length(); a++) {
					if(str.charAt(j) == str.charAt(a)) {
						chk = 1;
						break;
					}
				}
				if(chk == 1) break;	
			}
			if(chk == 0) count++;
			chk = 0;
		}
		System.out.println(count);

	}

}
