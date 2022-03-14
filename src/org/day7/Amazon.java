package org.day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\debug\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement findElement = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	findElement.sendKeys("iphone13",Keys.ENTER);
	List<WebElement> phone = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	     int size = phone.size();
System.out.println(size);
for (WebElement s: phone) {
String text = s.getText();
System.out.println(text);
}
}
}  