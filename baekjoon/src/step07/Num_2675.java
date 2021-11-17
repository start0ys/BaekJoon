package step07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Num_2675 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int num;
		String [] str;
		for(int i = 0; i < size; i++) {
			st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken());
			str = st.nextToken().split("");
			for(int j = 0; j<str.length; j++) {
				for(int k = 0; k<num; k++) {
					bw.write(str[j]);
				}
			}
			bw.write("\n");
			
		}
		br.close();
		bw.close();

	}

}
