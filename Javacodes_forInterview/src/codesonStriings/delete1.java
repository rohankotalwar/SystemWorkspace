package codesonStriings;


public class delete1 {


	
	
	





public static void main(String[]args){
	String a= "rameshwarkotalwar";
	 int count =0 ;
	char b= 'r';
	
	int len = a.length();
	
	for(int i=0 ;i<len ;i++) {
		
		if(a.charAt(i)==b) {
			
			count++ ;
			
		}
		
	}
	
	System.out.println("frequency of > " +b +" < is:"+count);
	
}
}
