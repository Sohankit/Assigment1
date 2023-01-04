package com.assignment1;
 //INEURON Assignment 1
public class Assignment1 {

	public static void main(String[] args) {
		int n=19;
		//I logic
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 && j>0) || (j==(n-1)/2 && i>0) || (i==n-1 && j>0)) {
				System.out.print("*");
			 }
				else {
					System.out.print(" ");
				
				}
			}	
		System.out.print("  ");
			//N logic
			for(int j=0;j<n;j++) {
				if(j==0 || (i==j) || j==n-1 ) {
				System.out.print("*");
			 }
				else {
					System.out.print(" ");
				}
			}	
			System.out.print("  ");
			// E logic
			for(int j=0;j<n;j++) {
				if((i==0 && j>0)||
				  (j==0 && i>0 && i<n-1)||
				  (i==(n-1)/2 && j>0 &&j<n-1)
				  ||(i==n-1 && j>0 && j<(n-1))) {
				System.out.print("*");
			 }
				else {
					System.out.print(" ");
				}
			}	
			System.out.print("  ");
			// U logic
			for(int j=0;j<n;j++) {
				if((j==0 && i>=0 && i<n-1)||
					(i==n-1 && j>0 && j<n-1)||
					(j==n-1 && i>=0 && i<n-1)) {
				System.out.print("*");
			 }
				else {
					System.out.print(" ");
				}
			}	
			System.out.print("  ");
			
			// R logic
			for(int j=0;j<n;j++) {
				if((j==0 && i>0 && i<=n-1)||
					(i==0 && j>=0 && j<(n-3))||
					(i==(n-1)/2 && j<(n-1)/2)||
					(j==(n-1) && i>0 && i<(n-3)/2)||
					(j-i==0 && i>=(n-1)/2 && j>(n-1)/2)	||
					(i==(n-2)/2) && j>(n-1)/2 && j<(n-2)) {
				System.out.print("*");
			 }
				else {
					System.out.print(" ");
				}
			}	
			System.out.print("  ");
			// O logic
			for(int j=0;j<n;j++) {
				if((i==0 && j>0 && j<(n-1)||
					(j==0 && i>0 && i<(n-1))||
					(i==(n-1) && j>0 && j<(n-1))||
					(j==(n-1) && i>0 && i<(n-1)))) {
				System.out.print("*");
			 }
				else {
					System.out.print(" ");
				}
			}	
			System.out.print("  ");
			
			//N Logic
			for(int j=0;j<n;j++) {
				if(j==0 || (i==j) || j==n-1 ) {
				System.out.print("*");
			 }
				else {
					System.out.print(" ");
				}
			}	
			System.out.println("  ");
		
		
		}
		
		}

	

}
