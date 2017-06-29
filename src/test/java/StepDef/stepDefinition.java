package StepDef;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageFactory.betslipPage;
import pageFactory.bettingPage;
import pageFactory.landingPage;
import pageFactory.quickBetPage;
import pageFactory.racingPage;

public class stepDefinition {
	
	public WebDriver driver;
	
	public landingPage lp;
	public racingPage rp;
	public bettingPage bp;
	public quickBetPage qb;
	public betslipPage bsp;
	
	String URL = "https://www.williamhill.com.au/";
	
	@Before
	public void setUp() throws InterruptedException{
		System.out.println("Initiliazation");
		System.setProperty("webdriver.chrome.driver", "D:/Softies/chromedriver.exe");
	}
	
	@After
	public void cleanUp() throws InterruptedException{
		
		lp = null;
		rp = null;
		bp = null;
		qb = null;
		bsp = null;
		
		System.out.println("Cleaning");
		Thread.sleep(5000L);
		driver.quit();
	}
	
	@Given("^User is on william hill home page$")
	public void User_is_on_william_hill_home_page() throws Throwable {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
		Thread.sleep(5000L);
		
	}

	@When("^User clicks on Racing link or dropdown$")
	public void User_clicks_on_Racing_link_or_dropdown() throws Throwable {
		
		lp = new landingPage(driver);
		lp.doClickOnRacingLink();
		Thread.sleep(2000L);
		
	}

	@Then("^User clicks on horses link$")
	public void User_clicks_on_horses_link() throws Throwable {
		
		lp.doClickOnHorsesLink();
		Thread.sleep(2000L);
	}

	@Then("^User chooses a quick bet and adds a stake$")
	public void User_chooses_a_quick_bet_and_adds_a_stake() throws Throwable {
		
		bp = new bettingPage(driver);
		bp.doClickBetValueBox();
		Thread.sleep(2000L);
		
	}

	@Then("^User adds the bet to Bet Slip$")
	public void User_adds_the_bet_to_Bet_Slip() throws Throwable {
		
		qb = new quickBetPage(driver);
		qb.doEnterStakeValue();
		qb.doConfirmBet();
		Thread.sleep(2000L);
		
	}
	
	@Then("^User clicks on bet slip$")
	public void User_clicks_on_bet_slip() throws Throwable {
		
		bsp = new betslipPage(driver);
		bsp.doClickOnBetSlipLink();
		Thread.sleep(2000L);
	 
	}

	@Then("^User validates the bet value$")
	public void User_validates_the_bet_value() throws Throwable {
		
		bsp.doValidateStakeValue();
		Thread.sleep(2000L);	 
	}
	
}