package selenium.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ilavarasi\\eclipse-workspace\\test\\driver\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
    
    WebElement closebtn=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
    closebtn.click();
    
    WebElement rclick=driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
	Actions actions=new Actions(driver);

	actions.contextClick(rclick).perform();
	Robot robot=new Robot();
	for(int i=0;i<=3;i++) {
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
	}
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	}
}

