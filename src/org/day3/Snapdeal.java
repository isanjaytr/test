package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\debug\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.snapdeal.com/");
		WebElement findElement = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-user']"));
	findElement.click();
	WebElement findElement2 = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
	findElement2.click();
	WebElement findElement3 = driver.findElement(By.xpath("//input[@class='col-xs-24']"));
	findElement3.sendKeys("98765432");
	WebElement findElement4 = driver.findElement(By.xpath("//input[@class='col-xs-24']"));
	findElement4.click();
	
	
	
	
	
	
	
	
	}
}