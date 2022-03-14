package org.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\debug\\\\driver\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenscart.in/");
	Thread.sleep(3000);
	WebElement findElement = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
	findElement.click();
	WebElement findElement1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	findElement1.sendKeys(Keys.SHIFT,"sanjay",Keys.SHIFT);
	WebElement findElement2 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	findElement2.sendKeys("sanjaytr@gmail.com");
	WebElement findElement3 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	findElement3.sendKeys("9344652658");
	WebElement findElement4 = driver.findElement(By.xpath("//input[@type='email']"));
	findElement4.sendKeys(Keys.SHIFT,"b",Keys.SHIFT);
	WebElement findElement5 = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	findElement5.sendKeys("123sanjay@");
	WebElement findElement6 = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	findElement6.sendKeys("123Rohi@");
	WebElement findElement7 = driver.findElement(By.xpath("(//option[@class='ng-star-inserted'])[13]"));
	findElement7.click();
	WebElement findElement8 = driver.findElement(By.xpath("(//option[@class='ng-star-inserted'])[35]"));
	findElement8.click();
	WebElement findElement9 = driver.findElement(By.xpath("(//option[@class='ng-star-inserted'])[107]"));
	findElement9.click();
	Thread.sleep(3000);
	WebElement findElement10 = driver.findElement(By.xpath("//div[@class='col-6 link']"));
	Actions actions=new Actions(driver);
	actions.contextClick(findElement10).perform();
	WebElement findElement11 = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
	findElement11.click();
}
}
