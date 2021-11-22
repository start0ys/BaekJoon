package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_5622 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int sum = 0;
		for(int i = 0; i<str.length(); i++) {
			if(64 < (str.charAt(i)+0) && (str.charAt(i)+0)  <= 67) sum += 3;
			if(67 < (str.charAt(i)+0) && (str.charAt(i)+0)  <= 70) sum += 4;
			if(70 < (str.charAt(i)+0) && (str.charAt(i)+0)  <= 73) sum += 5;
			if(73 < (str.charAt(i)+0) && (str.charAt(i)+0)  <= 76) sum += 6;
			if(76 < (str.charAt(i)+0) && (str.charAt(i)+0)  <= 79) sum += 7;
			if(79 < (str.charAt(i)+0) && (str.charAt(i)+0)  <= 83) sum += 8;
			if(83 < (str.charAt(i)+0) && (str.charAt(i)+0)  <= 86) sum += 9;
			if(86 < (str.charAt(i)+0) && (str.charAt(i)+0)  <= 90) sum += 10;
		}
		System.out.println(sum);

	}

}