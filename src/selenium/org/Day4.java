package selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ilavarasi\\eclipse-workspace\\test\\driver\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
    driver.manage().window().maximize();
    //WebElement btncreateNewAcct=driver.findElement("")
    
    WebElement btnCreateNewAcct=driver.findElement(By.xpath("//a[text()='Create New account']"));
    btnCreateNewAcct.click();
    Thread.sleep(3000);
    
    WebElement txtFname=driver.findElement(By.name("firstname"));
    txtFname.sendKeys("Ilavarasi");
    
	}
}