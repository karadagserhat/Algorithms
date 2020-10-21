package Algoritma;

import java.util.Arrays;
import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    sc.close();
	    char [] arreglo = new char [n+5];
	    Arrays.fill(arreglo, ' ');
	    //for(int i=0; i<=arreglo.length; i++)
	    	//arreglo[i]=' ';
	    	
	   
	    for (int i = 1; i <= n; i++){
	        arreglo[n-i] = '#';
	        System.out.println(arreglo);
	    }
	   
	}

}
