package or.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\debug\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement findElement = driver.findElement(By.id("src"));
	findElement.sendKeys("madurai");
	WebElement findElement2 = driver.findElement(By.id("dest"));
	findElement2.sendKeys("chennai");
}
}