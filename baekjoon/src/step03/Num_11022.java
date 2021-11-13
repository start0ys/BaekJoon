package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Num_11022 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String a,b;
		for(int i = 1; i<=T; i++) {
			st = new StringTokenizer(br.readLine());
			a = st.nextToken();
			b = st.nextToken();
			bw.write("Case #"+i+": "+a+" + "+b+" = "+(Integer.parseInt(a) + Integer.parseInt(b)) + "\n");
		}
		bw.close();
		

	}

}
