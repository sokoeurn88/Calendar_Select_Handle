package canlendarselecthandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSelectHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/");
		
//		driver.findElement(By.)
		
		
		
		
		
		
		
//		driver.close();

	}

}
