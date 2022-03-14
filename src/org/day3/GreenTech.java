package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTech {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\debug\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement findElement = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
	findElement.click();
	WebElement findElement2 = driver.findElement(By.xpath("//input[@type='text'][2]"));
	findElement2.click();
}
}
