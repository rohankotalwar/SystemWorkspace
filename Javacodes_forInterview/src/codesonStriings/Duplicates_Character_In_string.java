package codesonStriings;

public class Duplicates_Character_In_string {

	
	
	
	public static void main(String[]args) {
	
	String a= "SAKKEETT" ;
	int count =0;
	
	 int len = a.length();
	 
	 for(int i=0 ;i<len ; i++) {
		 
		 for( int j=i+1 ;j<len ;j++) {
			 
			 if(a.charAt(i)==a.charAt(j)) {
				 
				 System.out.println(a.charAt(j));
				 count++ ;
				 
				 }
		 }
	 }
	
	       
	
	
	
	
}

}