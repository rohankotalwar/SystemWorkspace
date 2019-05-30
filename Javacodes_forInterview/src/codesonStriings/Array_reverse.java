package codesonStriings;

import java.util.Arrays;

public class Array_reverse {
	
	
	
	
	public static void main(String[]args) {
	
		
		int [] A= {1,2,3,4,5,6};
		
		
		System.out.println(Arrays.toString(A));
		
		int [] B = new int [A.length];
		
		int len =A.length ;
		
		for(int i=0;i<len ;i++) {
			
		  B[len-1-i]=A[i];
			
		}
		
		for(int i=0 ; i<len ;i++) {
			A[i]= B[i];
			
			
		}
		System.out.println(Arrays.toString(A));
		
		
	
	
		}
		
		
		
	    
	


}