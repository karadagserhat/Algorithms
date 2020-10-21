package Algoritma;

import java.util.Scanner;

public class Mini_Max_Sum {
	static void miniMaxSum(int[] ar) {
		int sum=0;
		int max=ar.length-1;
		int min=500;
		for(int i=0; i<ar.length; i++) {
			
			
			if(ar[i]>max)
				max=ar[i];
			if(ar[i]<min)
				min=ar[i];
			sum+=ar[i];
			
		}
		System.out.println((sum-max)+" "+ (sum-min));
	}
	public static void main(String[] args) {
		int[] ar= new int[5];
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<ar.length;i++)
			ar[i]= sc.nextInt();
		miniMaxSum(ar);
		sc.close();
		
	}

}
