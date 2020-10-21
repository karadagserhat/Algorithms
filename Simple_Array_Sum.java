package Algoritma;

import java.util.Scanner;

public class Simple_Array_Sum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] x= new int[n];
		int s=0;
		for(int i=1; i<=x.length;i++) {
			int y= sc.nextInt();
			s+=y;}
		System.out.println(s);
		sc.close();

	}

}
