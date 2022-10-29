package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginKitePage {
	
	@FindBy(id = "userid")
	private WebElement userid;
	
	@FindBy(css = "input[type='password']")
	private WebElement password;
	
	@FindBy(css = "button[type='submit']")
	private WebElement submit;
	
	public WebDriver driver;
	public LoginKitePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public void userData(String id,String pass)
	{
		userid.sendKeys(id);
		password.sendKeys(pass);
	}
	public void Login()
	{
		submit.click();
	}
	
}
