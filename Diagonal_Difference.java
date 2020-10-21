package Algoritma;

import java.util.Scanner;

public class Diagonal_Difference {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[][] ar= new int[n][n];
		
		for(int i=0;i<n; i++) {
			for(int j=0; j<n; j++) {
				ar[i][j]= sc.nextInt();
			}
			}
		
		int soltop=0;
		int sagtop=0;
		for(int i=0;i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j)
					soltop+=ar[i][j];
				if(i+j==n-1)
					sagtop+=ar[i][j];
			}
		}
		System.out.println(Math.abs(soltop - sagtop));
		
		/*
		int diag1Sum = 0; //TL > BR
		int diag2Sum = 0; //TR > BL
		int col = 0;

		for (int row = 0; row < ar.length; row++)
		{
		    diag1Sum += ar[row][col];
		    diag2Sum += ar[row][ar[row].length - 1 - col];
		    col++;
		}

		System.out.println(Math.abs(diag1Sum - diag2Sum));
		*/
		
		sc.close();
	}

}
