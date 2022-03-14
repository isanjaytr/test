package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\debug\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement findElement = driver.findElement(By.xpath("//input[@dir='auto']"));
	findElement.sendKeys("iphone");
	WebElement findElement2 = driver.findElement(By.xpath("//input[@type='submit']"));
	findElement2.click();
}
}