package com.assignment1;

public class Assignment2 {
 //assignment 3
	public static void main(String[] args) {
		int n=15;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i+j<=7) || (j-i>=7)||j==0 || j==(n-1) ||i==(n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

}
