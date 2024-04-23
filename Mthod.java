package practi;

import java.util.Arrays;

public class Mthod {

	public static void main(String[] args) {

	// 2_D array
//		int a[][] = { { 100, 200 }, { 300, 400 }, { 500, 600 } };
//		System.out.println("The length is " + a.length);
//
//		for (int r = 0; r <= a.length - 1; r++) {
//			for (int c = 0; c <= a[r].length - 1; c++) {
//				System.out.println(a[r][c]);
//			}
//		}
//		
		int b[][]=new int[2][2];
		
		b[0][0]=10;
		b[0][1]=20;
		b[1][0]=30;
		b[1][1]=40;
		System.out.println(b[1][1]);
//		System.out.println("///////enhanced for loop in 2d array///////");
//		for (int arr[] : b) {
//			for (int x : arr) {
//
//				System.out.println(x);
//			}
//		}
		
		for(int arr[]:b)
		{
			for(int x:arr)
			{
				System.out.println(x);
			}
		
    
		}
	}}
		
		
		

