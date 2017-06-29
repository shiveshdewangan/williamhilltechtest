package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class bettingPage extends basePage {

	@FindBy(xpath="//*[@id='app']/div/div[4]/div/div/div[2]/div/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/button")
	WebElement enterBetButton;
	
	public bettingPage(WebDriver driver) {
		super(driver);
	}
	
	public bettingPage doClickBetValueBox(){		
		enterBetButton.click();		
		return new bettingPage(driver);
	}

}
