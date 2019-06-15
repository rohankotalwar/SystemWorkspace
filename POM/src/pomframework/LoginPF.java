package pomframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPF {

	WebDriver driver;
	
	public LoginPF(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy (name="EmailID") 
	private WebElement uid;
	
	public WebElement username()
	{
		return uid;
	}
	
	//WebElement uid = findElement(By.name("EmailID");
}
