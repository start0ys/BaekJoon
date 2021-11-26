package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_2292 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		result(input,1,1);
	}
	public static void result(int input,int num,int result) {
		if(input == 1) {
			System.out.println(1);
		}else {
			result = 6*num + result;
			num += 1;
			if(input <= result) {
				System.out.println(num);
			}else {
				result(input,num,result);
			}
		}
	
	}
}
