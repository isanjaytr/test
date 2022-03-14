package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\debug\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement findElement = driver.findElement(By.xpath("//input[@id='email']"));
	findElement.sendKeys("sanjay");
	WebElement findElement2 = driver.findElement(By.xpath("//input[@id='pass']"));
	findElement2.sendKeys("kumar");
	WebElement findElement3 = driver.findElement(By.xpath("//button[@value='1']"));
	findElement3.click();
}
}