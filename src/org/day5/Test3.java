package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\HP\\\\\\\\\\\\\\\\eclipse-workspace\\\\\\\\\\\\\\\\debug\\\\\\\\\\\\\\\\driver\\\\\\\\\\\\\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
	Thread.sleep(3000);
	WebElement findElement = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
	findElement.sendKeys("sanjay");
	WebElement findElement2 = driver.findElement(By.xpath("//input[@aria-label='Password']"));
	findElement2.sendKeys("12345678");
}
}