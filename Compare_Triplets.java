package Algoritma;


import java.util.Scanner;

public class Compare_Triplets {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] a= new int[3];
		int[] b = new int[3];
		
		for(int i=0; i<3; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<3; i++) {
			b[i]=sc.nextInt();
		}
		
		
		
		int x=((a[0]>b[0])?1:0)+ ((a[1]>b[1])?1:0)+((a[2]>b[2])?1:0);
		int y=((a[0]<b[0])?1:0)+ ((a[1]<b[1])?1:0)+((a[2]<b[2])?1:0);
		System.out.println(x+" "+ y);
		
		 
		sc.close();
	}

}
