package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_9498 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(br.readLine());
		String result = null;
		switch (score/10) {
			case 10:
			case 9 : result = "A"; break;
			case 8 : result = "B"; break;
			case 7 : result = "C"; break;
			case 6 : result = "D"; break;
			default: result = "F"; break;
		}
		System.out.println(result);
	}

}
