package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_8393 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int n = Integer.parseInt(br.readLine());
		for(int i = 1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}
