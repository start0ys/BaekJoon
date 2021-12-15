package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_2798 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int [] card = new int[n];
		for(int i = 0; i<n; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		int result = 0;
		int sum = 0;
		for(int i = 0; i<n-2; i++) {
			if(sum + card[i] > m) continue;
			sum += card[i];
			for(int j=i+1; j<n-1; j++) {
				if(sum + card[j] > m) continue;
				sum += card[j];
				for(int k = j+1; k<n; k++) {
					sum += card[k];
					if(sum>result && m>=sum) result = sum;
					sum -= card[k];
				}
				sum -= card[j];
			}
			sum -= card[i];
		}
		System.out.println(result);

	}

}
