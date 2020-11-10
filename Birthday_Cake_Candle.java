package Algoritma;

import java.util.Scanner;

public class Birthday_Cake_Candle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] c = new int[n];
		int max= 0;
		int count = 0;
		for(int i = 0; i < c.length; i++) {
			c[i] = sc.nextInt();
			if(c[i] > max) 
				max = c[i];
			}
		for(int i = 0; i < c.length ; i++) {
			if(c[i] == max)
				count++;
			
		}
		System.out.println(count);
		sc.close();		
		}
		

	}


	
