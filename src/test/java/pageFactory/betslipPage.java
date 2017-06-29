package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.AssertJUnit;

public class betslipPage extends basePage {

	@FindBy(xpath="//*[@id='app']/div/div[3]/div/div[1]/a[2]/span[1]")
	WebElement betSlipLink;
	
	@FindBy(xpath="//*[@id='app']/div/div[3]/div/div[2]/section/div/section/div/section/div[3]/div[1]/div[1]/div/div/input")
	WebElement stakeValueBox;
	
	public betslipPage(WebDriver driver) {
		super(driver);
	}

	public betslipPage doClickOnBetSlipLink(){		
		betSlipLink.click();		
		return new betslipPage(driver);
	}
	
	public betslipPage doValidateStakeValue(){
		
		System.out.println(stakeValueBox.getAttribute("value"));		
		
		if(stakeValueBox.getAttribute("value").equalsIgnoreCase("10.50")){
			System.out.println("Bet values validation passed!!");
		} else {
			AssertJUnit.fail("Expected and Actual Bet values are not equal");
		}		
		
		return new betslipPage(driver);
	}
	
}
