package QA;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Selstart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\webexpert\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver1 = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
		
		
		int[] arr = new int[5];
		arr[0]= 1;
		arr[1]=5;
		arr[2]=8;
		arr[3]=2;
		arr[4]=9;
		
		for(int i=0; i< arr.length;i++)
		{
			System.out.println(arr[i]);
		}
			
				
	}

}
