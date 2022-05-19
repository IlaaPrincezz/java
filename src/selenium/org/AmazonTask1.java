package selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ilavarasi\\eclipse-workspace\\test\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
        WebElement txtusername=driver.findElement(By.xpath("//input[@type='text']"));
        txtusername.sendKeys("ilaa@gmail");
        
        WebElement txtpassword=driver.findElement(By.xpath("//input[@type='password']"));
        txtpassword.sendKeys("ila@2141");

        WebElement btnsearch=driver.findElement(By.xpath("//button[@name='login']"));
        btnsearch.click();
}
}