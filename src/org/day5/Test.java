package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\HP\\\\\\\\eclipse-workspace\\\\\\\\debug\\\\\\\\driver\\\\\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(" http://greenstech.in/selenium-course-content.html");
	WebElement findElement = driver.findElement(By.xpath("//a[@id='overview-tab']"));
	findElement.click();
	Thread.sleep(3000);
	WebElement findElement1 = driver.findElement(By.xpath("(//p[contains(text(),'Greens ')])[1]"));
	String text = findElement1.getText();
	System.out.println(text);
}
}