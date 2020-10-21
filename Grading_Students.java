package Algoritma;

import java.util.Scanner;

public class Grading_Students {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] grade= new int[n];
		
		for(int i=0; i<n; i++) {
			grade[i]= sc.nextInt();
		}
		
		for(int i=0; i<n;i++) {
			System.out.println(grade[i]<38 || grade[i] % 5<3 ? grade[i]
					: grade[i] + (5 - (grade[i] % 5)));
		}
	
		
		sc.close();
	}

}
