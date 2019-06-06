package codesonStriings;

public class LeapYear {
	
	
	
	public static void leapyear(int num) {
		
		if((num %400 ==0) ||((num% 100!=0) && (num%4==0))){
		
			System.out.println("this is leap year");	
			
	     }
        
		else {	
			System.out.println("this is not leap year");
		}
}
	

	
	public static void main(String[]args) {
		LeapYear.leapyear(2000);
		
	
		
		
	}
}
