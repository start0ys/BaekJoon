package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_1110 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String result = str;
		String str2;
		int count = 0;
		while(true) {
			if(Integer.parseInt(str) < 10) {
				str = "0"+str;
			}
			str2 = Integer.toString(Integer.parseInt(str.substring(0, 1)) + Integer.parseInt(str.substring(1, 2)));
			str = str.substring(1, 2) + str2.substring(str2.length()-1, str2.length());
			count+=1;
			if(str.substring(0, 1).equals("0")) str = str.substring(1, 2);
			if(str.equals(result)) break;
		}
		System.out.println(count);

	}

}
