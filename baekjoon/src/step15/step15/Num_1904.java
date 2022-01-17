package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_1904 {
	private static int [] arr = new int [1000001];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		arr[0] = 0; 
		arr[1] = 1; 
		arr[2] = 2;
		for(int i = 3; i < arr.length; i++) {
			arr[i] = -1;
		}
		System.out.println(result(Integer.parseInt(br.readLine())));

	}
	public static int result(int n) {
		if(arr[n] == -1) {
			arr[n] =  (result(n-2) + result(n-1))%15746;
		}
		return arr[n];
	}

}
