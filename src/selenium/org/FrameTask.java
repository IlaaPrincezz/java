package selenium.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ilavarasi\\eclipse-workspace\\test\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		List<WebElement> frameCount =driver.findElements(By.tagName("Frame"));
		int size=frameCount.size();
        System.out.println(size);
        
        //switching to frame using Index_no
        driver.switchTo().frame(0);
        
        WebElement txtUsername=driver.findElement(By.name("fldLoginUserId"));
        txtUsername.sendKeys("ilavarasi");       
}
}