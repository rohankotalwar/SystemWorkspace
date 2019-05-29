package codesonStriings;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Reverse_Integer_number {

	WebDriver driver ;
	public static void main(String[] args) {
		int num = 1234567  ;
		int rev =0 ;
		int sum=0;		
		
	                   
		         while(num>0) {
		         sum=sum +num%10 ;
		         num=num/10 ;
		         
		         }	 
		         
		         System.out.println(sum);
	}
	
	  
	   
		

	}


