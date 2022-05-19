package selenium.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ilavarasi\\eclipse-workspace\\test\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		WebElement btnSignIn=driver.findElement(By.name("proceed"));
		btnSignIn.click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();		
}
}