package POMs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject {
	
	public HomePageObject(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#logo > p > a")
	public WebElement linkHome;
	
	public static HomePageObject NavigateAndInitialize(WebDriver driver, String baseUrl){
		driver.get(baseUrl);
		return new HomePageObject(driver);
	}
}
