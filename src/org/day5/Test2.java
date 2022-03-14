package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\HP\\\\\\\\eclipse-workspace\\\\\\\\debug\\\\\\\\driver\\\\\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement f = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	f.click();
	Thread.sleep(3000);
	WebElement f1= driver.findElement(By.xpath("//input[@name='firstname']"));
	f1.sendKeys("sanjay");
}
}