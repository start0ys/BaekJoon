package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_1157 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		int [] chk = new int[26];
		for(int i = 0; i < str.length(); i++) {
			chk[str.charAt(i)-'A']++;
		}
		char result = '?';
		int max = 0;
		for(int j = 0; j < chk.length; j++) {
			if(max < chk[j]) {
				max = chk[j];
				result = (char) (j+'A');
			}else if (max == chk[j]) {
				result = '?';
			}
		}
		System.out.println(result);
	}
	
}
