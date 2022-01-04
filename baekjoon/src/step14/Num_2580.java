package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_2580 {
	private static int [][] arr = new int[9][9];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		sudoku(0,0);

	}
	
	private static void sudoku(int row,int col) {
		if(row == 9) {
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					sb.append(arr[i][j]+" ");
				}
				sb.append("\n");
			}
			System.out.println(sb);
			System.exit(0);
		}
		if(col == 9) {
			sudoku(row+1,0);
			return;
		}
		if(arr[row][col] == 0) {
			for(int i = 1; i <= 9; i++) {
				if(chk(row,col,i)) {
					arr[row][col] = i;
					sudoku(row,col+1);
				}
			}
			arr[row][col] = 0;
			return;
		}
		sudoku(row,col+1);
	}
	
	private static boolean chk(int row,int col,int val) {
		for(int i = 0; i < 9; i++) {
			if(arr[row][i] == val) {
				return false;
			}
		}
		for(int i = 0; i < 9; i++) {
			if(arr[i][col] == val) {
				return false;
			}
		}
		for(int i = (row/3)*3; i < (row/3)*3+3; i++) {
			for(int j = (col/3)*3; j < (col/3)*3+3; j++) {
				if(arr[i][j] == val) {
					return false;
				}
			}
		}
		return true;
	}

}
