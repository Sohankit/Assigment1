package com.assignment1;
//Assignment 4
public class Assignment4 {

	public static void main(String[] args) {
		 int n=15;
		 for(int i=0;i<n;i++) {
			 for(int j=0;j<n;j++) {
				 if(i+j<=7 || i-j>=7 || i==0 || i==(n-1)) {
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
