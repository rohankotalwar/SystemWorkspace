package codesonStriings;

public class Sum_of_digits {
	
	
	
	public static void digitadd(int num) {
		
		
		int sum =0 ;
		
                while (num>0) {		
                	
		       sum =sum+num%10;
		       num= num/10 ;
		       
                }
                System.out.println("addition of digit is:" + sum);
                
	}

	public static void main(String[] args) {
		
		digitadd(123);
		

	}

}
