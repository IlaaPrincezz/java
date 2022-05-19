package selenium.org;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task6InstaLogin {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ilavarasi\\eclipse-workspace\\test\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");
		driver.manage().window().maximize();
		WebElement frombtn= driver.findElement(By.xpath("//input[@name='username']"));
		frombtn.sendKeys("ilaa@gmail.com");
		//WebElement passwd= driver.findElement(By.xpath("//input[@name='password']"));
		//passwd.sendKeys("ilaa@2141");		
		
}
}