package Algoritma;



import java.util.Scanner;

public class NumberLineJumps {

	public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        
        int x1=x.nextInt();
        int v1= x.nextInt();
        int x2=x.nextInt();
        int v2=x.nextInt();
       
        if (v1 > v2) {
			
			int remainder = (x1 - x2) % (v2 - v1);
			
			if (remainder == 0) {
				System.out.println("YES");
			}
		}
        else
        	System.out.println("NO");
        
        x.close();
    }

}

