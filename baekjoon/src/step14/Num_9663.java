package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_9663 {
	private static int n;
	private static int count = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		for(int i = 1; i <= n; i++) {
			int [] arr = new int[n+1];
			arr[1] = i;
			dfs(arr,1);
			
		}
		System.out.println(count);
	}
	private static void dfs(int [] arr, int depth) {
		if(n==depth) {
			count ++;
		}else {
			for(int i = 1; i <= n; i++) {
				arr[depth+1] = i;
				if(chk(arr,depth+1)) {
					dfs(arr,depth+1);
				}
			}
		}
	}
	private static boolean chk(int [] arr, int depth) {
		for(int i = 1; i < depth; i++) {
			if(arr[i] == arr[depth]) {
				return false;
			}else if(Math.abs(i - depth) == Math.abs(arr[i]-arr[depth])) {
				return false;
			}
		}
		return true;
	}

}
