package Algoritma;

import java.util.Scanner;

public class Plus_Minus {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int ar[]= new int[n];
		
		for(int i=0; i<ar.length; i++)
			ar[i]= sc.nextInt();
		
		int pos=0;
		int neg=0;
		int zer=0;
		for(int i=0; i<ar.length; i++)
			if(ar[i]>0)
				pos++;
			else if(ar[i]<0)
				neg++;
			else
				zer++;
		System.out.println((float)pos/n+"\n"+(float)neg/n+"\n"+ (float)zer/n);
		
		
		sc.close();
	}

}
