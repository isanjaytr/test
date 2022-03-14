package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\HP\\\\\\\\eclipse-workspace\\\\\\\\debug\\\\\\\\driver\\\\\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
WebElement findElement = driver.findElement(By.xpath("//a[contains(text(),'Condition')]"));
	String text = findElement.getText();
	System.out.println(text);
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




