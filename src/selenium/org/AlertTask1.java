package selenium.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTask1 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ilavarasi\\eclipse-workspace\\test\\driver\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Alerts.html");
			driver.manage().window().maximize();
			WebElement btnSignIn=driver.findElement(By.xpath("//a[@href='#CancelTab[1]')"));
			btnSignIn.click();
			
			WebElement btnSignIn1=driver.findElement(By.xpath("//button[@class='btn btn-primary'])"));
			btnSignIn1.click();
			
			Alert alert=driver.switchTo().alert();
			Thread.sleep(2000);
			alert.accept();				
  }
}
