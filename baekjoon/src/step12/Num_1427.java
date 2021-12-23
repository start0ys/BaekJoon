package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Num_1427 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String [] str = br.readLine().split("");
		Arrays.sort(str,Collections.reverseOrder());
		for(String arr : str) {
			sb.append(arr);
		}
		System.out.println(sb);

	}

}
