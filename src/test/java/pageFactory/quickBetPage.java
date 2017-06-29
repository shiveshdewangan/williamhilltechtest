package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class quickBetPage extends basePage {

	@FindBy(xpath="html/body/div[4]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div/input")
	WebElement stakeField;
	
	@FindBy(xpath="html/body/div[4]/div/div/div[2]/div[2]/div/span/div[2]/button[2]")
	WebElement addToBetSlipButton;
	
	public quickBetPage(WebDriver driver) {
		super(driver);
	}
		
	public quickBetPage doEnterStakeValue() {		
		stakeField.sendKeys("10.5");		
		return new quickBetPage(driver);
	}
	
	public betslipPage doConfirmBet(){
		addToBetSlipButton.click();
		return new betslipPage(driver);
	}
	
}
