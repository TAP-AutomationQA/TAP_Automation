package functionlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomFunction {
	
	WebDriver driver;
	
	
	@FindBy(css = "#login")
	WebElement username;
	
	@FindBy(css = "#login-password")
	WebElement password;
	
	@FindBy(css = ".login-action")
	WebElement loginbutton;
	
	public CustomFunction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void userLogin(String un,String pw) {
		username.click();
		username.sendKeys(un);
		password.click();
		password.sendKeys(pw);
		loginbutton.click();
		
	}

	

}
