package codesonStriings;

import java.io.File;
import java.util.Date;

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
		         Date d = new Date();
		         
		        String todaydate= d.toString();
		        System.out.println(todaydate);
		        
		       String todaydate1 = todaydate.replaceAll(":","/");
		       System.out.println(todaydate1);
		         
	}
	
	  
	   
		

	}


