package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_1463 {
	public static Integer [] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new Integer [n+1];
		arr[0] = arr[1] = 0;
		System.out.println(result(n));

	}
	public static int result(int n) {
		if(arr[n] == null) {
			if(n%3==0 && n%2==0) {
				arr[n] = Math.min(result(n/2),Math.min(result(n/3), result(n-1))) + 1;
			}else if(n%3==0) {
				arr[n] = Math.min(result(n/3), result(n-1)) + 1;
			}else if(n%2==0) {
				arr[n] = Math.min(result(n/2), result(n-1)) + 1;
			}else {
				arr[n] = result(n-1) + 1;
			}
		}
		return arr[n];
	}
}
