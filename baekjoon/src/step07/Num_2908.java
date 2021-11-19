package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_2908 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split(" ");
		String first = "",
			   second = "";
		for(int i = str[0].length() - 1; i >= 0; i--) {
			first += str[0].charAt(i);
		}
		for(int j = str[1].length() - 1; j >= 0; j--) {
			second += str[1].charAt(j);
		}
		System.out.println(Integer.parseInt(first) > Integer.parseInt(second) ? first : second);
	}

}
