package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\debug\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		WebElement findElement = driver.findElement(By.xpath("//input[@title='From station']"));
	findElement.sendKeys("madurai");
	WebElement findElement2 = driver.findElement(By.xpath("//input[@title='To station']"));
	findElement2.sendKeys("chennai central");
	WebElement findElement3 = driver.findElement(By.xpath("//button[@id='trainFormButton']]"));
	findElement3.click();
}
}
