package selenium.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlertClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ilavarasi\\eclipse-workspace\\test\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement btnSignIn=driver.findElement(By.id("confirmButton"));
		btnSignIn.click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		alert.dismiss();		
		
		WebElement nxtbtnSignIn=driver.findElement(By.id("promtbutton"));
		nxtbtnSignIn.click();
		Alert alert1=driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.sendKeys("welcome");
		alert1.dismiss();		
}
}