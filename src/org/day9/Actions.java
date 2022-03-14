package org.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\debug\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenscart.in/");
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.xpath("//input[@id='loginEmailId']"));
	findElement.sendKeys("trsanjaykumar23@gmail.com");
	WebElement findElement2 = driver.findElement(By.xpath("//input[@id='loginPassword']"));
	findElement2.sendKeys("sanjay@23");
	WebElement findElement3 = driver.findElement(By.xpath("//input[@class='btnRegister form-control']"));
	findElement3.click();
	Thread.sleep(3000);
	WebElement findElement4 = driver.findElement(By.xpath("//input[@class='form-control mobInput ng-pristine ng-valid ng-touched'"));
	findElement4.sendKeys("iphone",Keys.ENTER);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
