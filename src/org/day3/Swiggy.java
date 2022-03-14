package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\debug\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		WebElement findElement = driver.findElement(By.xpath("//a[@class='r2iyh']"));
	findElement.click();
	WebElement findElement2 = driver.findElement(By.xpath("//input[@name='mobile']"));
	findElement2.sendKeys("987654321");
	WebElement findElement3 = driver.findElement(By.xpath("//input[@id='name']"));
	findElement3.sendKeys("sanjay");
	WebElement findElement4 = driver.findElement(By.xpath("//input[@name='email']"));
	findElement4.sendKeys("sanjaykumar");
	WebElement findElement5 = driver.findElement(By.xpath("//input[@name='password']"));
	findElement5.sendKeys("kumar");
	}
}
