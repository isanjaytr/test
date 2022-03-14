package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\debug\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		WebElement findElement = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
	findElement.sendKeys("876543219");
	WebElement findElement2 = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
	findElement2.click();
}
}