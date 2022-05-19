package selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ilavarasi\\eclipse-workspace\\test\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
       
		WebElement txtbtn=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        txtbtn.sendKeys("iphone");
        txtbtn.click();
	}       
}
