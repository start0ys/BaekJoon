package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num_10814 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		String [][] arr = new String[n][2];
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		Arrays.sort(arr,(e1,e2)->{
			if(e1[0].equals(e2[0])) {
				return 0;
			}else {				
				return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
			}
		});
		for(int i = 0; i < n; i++) {
			sb.append(arr[i][0]+" "+arr[i][1]+"\n");
		}
		System.out.println(sb);
	}

}
