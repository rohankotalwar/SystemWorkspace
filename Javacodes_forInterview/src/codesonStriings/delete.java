package codesonStriings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import String_Manipulation.Chromedriver;

public class delete {
	
	
	
	public static void amstrongnum(int num) {
		
		int t =num ;
		int r ;
		int sum=0 ;
		
		while(num>0) {
			
		
		r=num%10 ;
		sum = sum +(r*r*r);
		num=num/10;
		
		
		
	}
		
		
		if (t==sum) {
			System.out.println("number is amstrong num");
		}
		
		else {
			System.out.println("number is not amstrng number");
		}
	}
	
	public static void main(String[]args) {
			
		delete.amstrongnum(123);
		
		
		
}
		
		
		
		
}	
		
		
		
		
		
	            
		  
	




