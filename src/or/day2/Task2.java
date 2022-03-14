package or.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\seliniumday3\\\\driver\\\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement findElement = driver.findElement(By.id("email"));
	findElement.sendKeys("sanjay");
	WebElement findElement2 = driver.findElement(By.id("pass"));
	findElement2.sendKeys("kumar");
	
	
	
	
	
	
}	 
}
