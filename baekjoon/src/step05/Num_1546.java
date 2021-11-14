package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num_1546 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String [] str = br.readLine().split(" ");
		int max = 0;
		double sum = 0;
		for(int i = 0; i < size; i++) {
			if(max < Integer.parseInt(str[i])) max = Integer.parseInt(str[i]);
		}
		for(int i = 0; i < size; i++) {
			sum += ((double)Integer.parseInt(str[i])/max)*100;
		}
		System.out.println(sum/size);

	}

}
