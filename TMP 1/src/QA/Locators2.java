package QA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.Assert;



public class Locators2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\webexpert\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	}

}
