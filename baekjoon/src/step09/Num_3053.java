package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_3053 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double num = Double.parseDouble(br.readLine());
		System.out.println(String.format("%.5f", num*num*Math.PI)+"\n"+String.format("%.5f", num*num*2));
		

	}

}
