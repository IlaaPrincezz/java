package selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ilavarasi\\eclipse-workspace\\test\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
        WebElement txtusername=driver.findElement(By.id("email"));
        txtusername.sendKeys("ilaa");
        WebElement txtpassword=driver.findElement(By.id("pass"));
        txtpassword.sendKeys("ila@2141");
        driver.quit();
}
}