package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_2884 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] input = br.readLine().split(" ");
		int h = Integer.parseInt(input[0]),
			m = Integer.parseInt(input[1]),
			hour = h,
			min = m - 45;
		if(min<0) { hour -= 1; min += 60; }
		if(hour<0) { hour = 23; }
		System.out.println(hour+" "+min);
		
	}

}
