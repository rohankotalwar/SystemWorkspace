package pomframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MainTest {
 
	WebDriver driver=new FirefoxDriver();
	
	LoginTest lt=new LoginTest(driver);
	
	@Test
  public void DriverTest() {
	  
	  lt.login_action();
	  
	  
	  
	  
  }
}
