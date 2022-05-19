package selenium.org;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTask1 {
	public static void main(String[] args) throws IOException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ilavarasi\\eclipse-workspace\\test\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenShotAs=ts.getScreenshotAs(OutputType.FILE);
		System.out.println(screenShotAs);
		Thread.sleep(5000);
		File file=new File("E:\\screenshot\\screen.png");
		FileUtils.copyFile(screenShotAs, file);		
       System.out.println(file);
	}
}