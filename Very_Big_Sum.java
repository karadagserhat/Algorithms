package Algoritma;

import java.util.Scanner;

public class Very_Big_Sum {
	static long sum;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		long[] ar= new long[n];
		
		for(int i=0; i<n; i++)
			ar[i]= sc.nextLong();
		
		
		
		for(int i=0; i<n; i++)
			sum+=ar[i];
		System.out.println( sum);
		
		sc.close();

	}

}
