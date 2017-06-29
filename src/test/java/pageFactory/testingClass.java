package pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testingClass {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/Softies/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.williamhill.com.au/");
		driver.manage().window().maximize();		
		Thread.sleep(2000L);
		
		driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div/nav/div/div/div[2]/div[1]/div[1]/a[1]/span")).click();		
		Thread.sleep(5000L);
		
		driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div/nav/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div[3]/div[1]/a/span")).click();

		List<WebElement> links = driver.findElements(By.xpath("//*[@id='app']/div/div[4]/div/div/div[1]/div[1]/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[1]/a"));
		int linkSize = driver.findElements(By.xpath("//*[@id='app']/div/div[4]/div/div/div[1]/div[1]/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[1]/a")).size();
		
		for(int i = 0; i<=linkSize-1; i++){			
			System.out.println(links.get(i).getText());			
		}		
				
		links.get(1).click();
		
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id='app']/div/div[4]/div/div/div[2]/div/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/button")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div/input")).sendKeys("10.5");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div[2]/div/span/div[2]/button[2]")).click();
		
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div/div[1]/a[2]/span[1]")).click();
		
		Thread.sleep(2000L);
		System.out.println(driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div/div[2]/section/div/section/div/section/div[3]/div[1]/div[1]/div/div/input")).getAttribute("value"));	
								
		driver.quit();
		
	}

}