package selenium.org;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task4 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ilavarasi\\eclipse-workspace\\test\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/");
		WebElement userId=driver.findElement(By.xpath("//input[@type='text']"));
		userId.sendKeys("hdfc20131");
	}
}
 