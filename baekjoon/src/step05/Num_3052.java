package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.stream.IntStream;

public class Num_3052 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i = 0; i < 10; i++) {
			hs.add(Integer.parseInt(br.readLine())%42);
		}
		
		System.out.println(hs.size());
	}

}
