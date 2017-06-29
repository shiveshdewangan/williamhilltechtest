package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.AssertJUnit;

public class racingPage extends basePage {

	@FindBy(xpath="//*[@id='app']/div/div[4]/div/div/div[1]/div[1]/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[1]")
	List<WebElement> allBets;
		
	int sizeOfLinks = 0;
	
	public racingPage(WebDriver driver) {
		super(driver);
	}
	
	public bettingPage doSelectAndClickAvailableBet(){
		
		if(!allBets.get(1).isEnabled()){
			AssertJUnit.fail("No available racing bet");			
		} else {
			allBets.get(1).click();
		}		
		
		return new bettingPage(driver);
	}
	
	
}