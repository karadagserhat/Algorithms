package Algoritma;

import java.util.Scanner;

public class Time_Conversion {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int hh= sc.nextInt();
		int mm= sc.nextInt();
		int ss= sc.nextInt();
		
		String t= sc.next();
	
		
		if(t.equals("PM") && hh!=12)
			hh+=12;
		if(t.equals("AM") && hh==12)
			hh=0;
		
		System.out.printf("%02d:%02d:%02d",hh,mm,ss);
		sc.close();
			
		
		
	}

}
