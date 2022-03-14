package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenmodel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\debug\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement findElement = driver.findElement(By.xpath("//i[@class='fas fa-plus']"));
	findElement.click();
	WebElement findElement2 = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
	findElement2.click();
}
}
