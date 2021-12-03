package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_2839 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result=0,three,five;
		if(num == 1 || num == 2 || num == 4 || num == 7) { result = -1;}
		else {
			int chk = num/5;
			if(chk > 1) {
				switch(num%5) {
					case 0:  three = 0;
							 five = 2 + (chk-2);
							 break;
					case 1:  three = 2;
							 five = 1 + (chk-2);
							 break;
					case 2:  three = 4;
							 five = 0 + (chk-2);
							 break;
					case 3:  three = 1;
							 five = 2 + (chk-2);
							 break;
					default: three = 3;
							 five = 1 + (chk-2);
							 break;
				}
				result = three + five;
			}else {
				switch(num) {
					case 3:  result = 1;
							 break;
					case 5:  result = 1;
							 break;
					case 6:  result = 2;
							 break;
					case 8:  result = 2;
							 break;
					default: result = 3;
							 break;
				}
			}
		}
		System.out.println(result);

	}

}
