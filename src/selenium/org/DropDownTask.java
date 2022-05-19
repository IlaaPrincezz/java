package selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ilavarasi\\eclipse-workspace\\test\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement btnsearch=driver.findElement(By.xpath("//a[text()='Create New Account']"));
	    btnsearch.click();
	    Thread.sleep(2000);
	    WebElement dropDay=driver.findElement(By.id("day"));
	    Select select=new Select(dropDay);
	    select.selectByValue("25");
	    
	   WebElement dropMonth=driver.findElement(By.id("Month"));
	   Select select2=new Select(dropMonth);
	   select2.selectByVisibleText("Jul");
	   
	   WebElement dropYear=driver.findElement(By.id("year"));
	   Select select3=new Select(dropYear);
	   select3.selectByIndex(6);
	   
}
}	
