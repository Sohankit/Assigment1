package com.assignment1;
//Assignment 4
public class Assignment3 {

	public static void main(String[] args) {
		int n=12;
		for(int i=0;i<n;i++) {
			for(int j=0 ;j<n;j++) {
				
				if( (i-j>=5) ||(j+i>=16) || i==n) {
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
