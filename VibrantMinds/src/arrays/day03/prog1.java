package arrays.day03;

import java.util.Arrays;

public class prog1 {
	public static void main(String[] args) {
		int arr[][] = new int[3][];
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		int sum = 0;
		for (int i = 0; i < 3; ++i) {  //2 < 3
			for (int j = 0; j < i + 1; ++j) {  //0 < 3
				arr[i][j] = j + 1;    //a[0][0]=1,a[1][0]=1,a[1][1]=2,a[2][0]=1,a[2][1]=2,a[2][2]=3
			}
		}
		for (int i = 0; i < 3; ++i)
			for (int j = 0; j < i + 1; ++j)
				sum += arr[i][j];
		System.out.print(Arrays.toString(arr));
	}
}