package pageClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PinPage {
	@FindBy(xpath = "//input[@type='password']")
	private WebElement Pin;
	
	@FindBy(css = "button[type='submit']")
	private WebElement cotinue;

	
	public WebDriver driver;
	
	public PinPage(WebDriver driver) {
		
	     this.driver=driver;
	     
		PageFactory.initElements(driver, this);
	}
	
	
	public void pin(String pin)
	{
		try {
			Pin.sendKeys(pin);
		} catch (Exception e) {
		   e.printStackTrace();
		}
	
	}
	public void cotinue()
	{
		cotinue.click();
	}
	

}
