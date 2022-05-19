package selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ilavarasi\\eclipse-workspace\\test\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/ ");
		WebElement frombtn= driver.findElement(By.id("src"));
		frombtn.click();
		Thread.sleep(2000);
		WebElement toBtn= driver.findElement(By.xpath("//input[@id='dest'][1]"));
		toBtn.click();
}
}