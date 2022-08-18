package org.Question2.model;

public class PatternProgram {

	public static void main(String[] args) {
		int i,j;
		for(i=0;i<=7;i++) {
			for(j=0;j<=i;j++) {
				System.out.print(i*j);
			}
			System.out.println( );
		}
	}

}
