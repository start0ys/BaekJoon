package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_3009 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str;
		StringBuffer four = new StringBuffer();
		int oneX = 0,oneY = 0,twoX = 0,twoY = 0,threeX = 0,threeY = 0;
		for(int i = 0; i<3; i++) {
			str = new StringTokenizer(br.readLine());
			switch (i) {
			case 0: oneX = Integer.parseInt(str.nextToken());
					oneY = Integer.parseInt(str.nextToken());
					break;
			case 1: twoX = Integer.parseInt(str.nextToken());
					twoY = Integer.parseInt(str.nextToken());
					break;
			default:threeX = Integer.parseInt(str.nextToken());
					threeY = Integer.parseInt(str.nextToken());
					break;
			}
		}
		if(oneX == twoX) {
			four.append(threeX+" ");
		}else {
			if(twoX == threeX) {
				four.append(oneX+" ");
			}else {
				four.append(twoX+" ");
			}
		}
		if(oneY == twoY) {
			four.append(threeY);
		}else {
			if(twoY == threeY) {
				four.append(oneY);
			}else {
				four.append(twoY);
			}
		}
		System.out.println(four);
	}

}
