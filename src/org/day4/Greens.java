package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\HP\\\\\\\\eclipse-workspace\\\\\\\\debug\\\\\\\\driver\\\\\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement findElement = driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
	findElement.click();
	WebElement findElement2 = driver.findElement(By.xpath("(//p[contains(text(),'Greens Technologies Selenium training')])[1])"));
		String text = findElement2.getText();
		System.out.println(text);
}
}