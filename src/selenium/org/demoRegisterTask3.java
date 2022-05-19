package selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoRegisterTask3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ilavarasi\\eclipse-workspace\\test\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtfirstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtfirstname.sendKeys("Ilavarasi");

        WebElement txtlastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        txtlastname.sendKeys("Sekar");

        WebElement txtmail=driver.findElement(By.xpath("//input[@type='email']"));
        txtmail.sendKeys("ilaa@gmail");

        WebElement txtphone=driver.findElement(By.xpath("//input[@type='tel']"));
        txtphone.sendKeys("9500827748");  

        WebElement txtradio=driver.findElement(By.xpath("//input[@value='FeMale']"));
        txtradio.click();  

      
        
 }
}