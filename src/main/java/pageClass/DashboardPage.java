package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	@FindBy(xpath = "//span[text()='Orders']")
	private WebElement orderModule;
	 WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void Order()
	{
	  orderModule.click();
	}
	public String title()
	{
		String Title=driver.getTitle();
		return Title;
	}

}
