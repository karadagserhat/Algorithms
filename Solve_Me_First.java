package Algoritma;

import java.util.Scanner;


public class Solve_Me_First {
	 static int fon(int n, int y) {
			return n+y;
		}

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n= sc.nextInt();
		int y= sc.nextInt();
		System.out.println(fon(n,y));
		sc.close();

	}

}
