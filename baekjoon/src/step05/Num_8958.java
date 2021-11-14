package step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Num_8958 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		String input;
		int sum,last;
		for(int i = 0; i < size; i++) {
			input = br.readLine(); 
			sum = 0;
			last = 1;
			for(int j=0; j<input.length(); j++) {
				if(input.charAt(j) == 'O') {
					sum += last;
					last +=1;
				}else {
					last = 1;
				}
			}
			bw.write(sum + "\n");
		}
		bw.close();
	}

}
