package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.AssertJUnit;

public class landingPage extends basePage {

	@FindBy(xpath="//*[@id='app']/div/div[2]/div/nav/div/div/div[2]/div[1]/div[1]/a[1]/span")
	WebElement racingLink;
	
	@FindBy(xpath="//*[@id='app']/div/div[2]/div/nav/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div[3]/div[1]/a/span")
	WebElement horsesLink;
	
	public landingPage(WebDriver driver) {
		super(driver);		
	}
	
	public landingPage doClickOnRacingLink(){
		
		if(!racingLink.isEnabled()){
			AssertJUnit.fail("Racing Link is not enabled");	
		} else {			
			racingLink.click();
		}
		
		return new landingPage(driver);
	}
	
	public racingPage doClickOnHorsesLink(){
		
		if(!horsesLink.isEnabled()){
			AssertJUnit.fail("Horses Link is not enabled");	
		} else {			
			horsesLink.click();
		}
		
		return new racingPage(driver);
	}	
}
