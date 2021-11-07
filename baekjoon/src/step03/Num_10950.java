package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_10950 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String [] input = null;
		String result = "";
		for(int i = 1; i<=t; i++) {
			input = br.readLine().split(" ");
			result += Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
			if(i != t) result += "\n";
		}
		System.out.println(result);

	}

}
