package orgday10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\HP\\\\\\\\eclipse-workspace\\\\\\\\debug\\\\\\\\driver\\\\\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.facebook.com/");
driver.manage().window().maximize();
TakesScreenshot ss=(TakesScreenshot)driver;
File s=ss.getScreenshotAs(OutputType.FILE);
File d=new File("C:\\Users\\HP\\Pictures");
Thread.sleep(3000);
FileUtils.copyFile(s,d);
driver.quit();



   









}
}