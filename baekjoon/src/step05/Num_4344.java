package step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Num_4344 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		String [] str;
		double avg;
		int sum = 0;
		int count = 0;
		for(int i = 0; i < size; i++) {
			str = br.readLine().split(" ");
			for(int j = 1; j <= Integer.parseInt(str[0]); j++) {
				sum += Integer.parseInt(str[j]);
			}
			avg = (double) sum/Integer.parseInt(str[0]);
			sum = 0;
			for(int j = 1; j <= Integer.parseInt(str[0]); j++) {
				if(avg < Integer.parseInt(str[j])) count++;
			}
			bw.write(String.format("%.3f",(double)count/Integer.parseInt(str[0]) * 100)+"%"+"\n");
			count = 0;
			avg = 0;
			
		}
		br.close();
		bw.close();

	}

}
