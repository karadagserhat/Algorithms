package Algoritma;

import java.util.Scanner;

public class Apple_And_Orange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int applesOnHouse = 0;
		for(int i = 0; i < m; i++) {
			int applePosition = a + sc.nextInt();
			if(applePosition >= s && applePosition <= t)
				applesOnHouse++;
		}
		//System.out.println(applesOnHouse);
		
		int orangeOnHouse = 0;
		for(int i = 0; i < n; i++) {
			int orangePosition = b + sc.nextInt();
			if(orangePosition >= s && orangePosition <= t)
				orangeOnHouse++;
		}
		
		System.out.println(applesOnHouse);
		System.out.println(orangeOnHouse);

		
		sc.close();

	}

}
