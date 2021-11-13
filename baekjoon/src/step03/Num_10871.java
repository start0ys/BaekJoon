package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Num_10871 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String [] str = br.readLine().split(" ");
		String [] str2 = br.readLine().split(" ");
		for(int i = 0; i<Integer.parseInt(str[0]); i++) {
			if(Integer.parseInt(str2[i])<Integer.parseInt(str[1])) {
				bw.write(str2[i]);
				if(i<Integer.parseInt(str[0])-1) bw.write(" ");
			}
		}
		bw.close();
	}

}
