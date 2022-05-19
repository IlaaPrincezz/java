package selenium.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10Task2WebTable {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ilavarasi\\eclipse-workspace\\test\\driver\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.guru99.com/test/write-xpath-table.html");
			WebElement tableName=driver.findElement(By.id("//table[@border='l']"));
			List<WebElement> allRows=tableName.findElements(By.tagName("tr"));
	        
			for(int i=0;i<allRows.size();i++) {
				WebElement row=allRows.get(i);
				String text=row.getText();
			    System.out.println(text);
			}
		}	
}

