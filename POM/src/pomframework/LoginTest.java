package pomframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginTest {
	
	  WebDriver driver;
	  
	 public LoginTest(WebDriver driver)
	 {
		 this.driver=driver;
	 }
  public void login_action() {
	  
	  
	
	  
	  LoginPF lpf=new LoginPF(driver);
	  
	  lpf.username().sendKeys("UID");
	  
  }
}
