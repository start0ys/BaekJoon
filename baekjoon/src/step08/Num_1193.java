package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_1193 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		result(input,2,1);
	}
	public static void result(int input,int num,int result) {
		if(input == 1) {
			System.out.println("1/1");
		}else {
			result = num+result;
			if(input <= result) {
				int loc = input-result+num;
				if(num%2==0) {
					System.out.println(loc+"/"+(num+1-loc));
				}else {
					System.out.println((num+1-loc)+"/"+loc);
				}
			}else {
				num += 1;
				result(input,num,result);
			}
		}
	
	}
}
