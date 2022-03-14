package or.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\debug\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/ ");
		WebElement findElement = driver.findElement(By.xpath("//input[@id='username']"));
	findElement.sendKeys("sanjay");
	WebElement findElement2 = driver.findElement(By.xpath("//input[@id='password']"));
	findElement2.sendKeys("kumar");
}
}