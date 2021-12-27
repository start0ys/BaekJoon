package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Num_18870 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		int [] arr1 = new int [n];
		int [] arr2 = new int [n];
		int idx = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
			arr2[i] = arr1[i];
		}
		Arrays.sort(arr1);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int arr : arr1) {
			if(!map.containsKey(arr)) {
				map.put(arr,idx++);
			}
		}
		for(int arr : arr2) {			
			sb.append(map.get(arr)+ " ");
		}
		System.out.println(sb);

	}

}
