package adactinid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\debug\\\\driver\\\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	WebElement f = driver.findElement(By.name("username"));
	f.sendKeys("Isanjaytr");
	WebElement ff = driver.findElement(By.name("password"));
	ff.sendKeys("sanjay@23");
	WebElement fff = driver.findElement(By.name("login"));
	fff.click();
	WebElement findElement = driver.findElement(By.id("location"));
	Select s=new Select(findElement);
	s.selectByIndex(1);
	WebElement findElement2 = driver.findElement(By.id("hotels"));
	Select s1=new Select(findElement2);
	s1.selectByVisibleText("Hotel Sunshine");
	WebElement findElement3 = driver.findElement(By.id("room_nos"));
	Select s3=new Select(findElement3);
	s3.selectByValue("2");
	WebElement findElement4 = driver.findElement(By.id("datepick_in"));
	findElement4.sendKeys("08/04/2022");
	WebElement findElement5 = driver.findElement(By.id("datepick_out"));
	findElement5.sendKeys("09/04/2022");
	WebElement findElement6 = driver.findElement(By.id("adult_room"));
	Select s5=new Select(findElement6);
	s5.selectByIndex(2);
	WebElement findElement7 = driver.findElement(By.id("room_nos"));
	Select s6=new Select(findElement7);
	s6.selectByIndex(1);
	WebElement findElement8 = driver.findElement(By.id("Submit"));
	findElement8.click();
	WebElement findElement9 = driver.findElement(By.id("radiobutton_1"));
	findElement9.click();
	WebElement findElement10 = driver.findElement(By.id("continue"));
	findElement10.click();
	WebElement e = driver.findElement(By.name("first_name"));
	e.sendKeys("sanjay");
	WebElement ee = driver.findElement(By.name("last_name"));
	ee.sendKeys("kumar");
	WebElement eee = driver.findElement(By.name("address"));
	eee.sendKeys("abc street, chennai");
	WebElement a = driver.findElement(By.name("cc_num"));
	a.sendKeys("1234567898745632");
	WebElement aa = driver.findElement(By.name("cc_type"));
	Select s7=new Select(aa);
	s7.selectByIndex(1);
	WebElement aaa = driver.findElement(By.name("cc_exp_month"));
	Select s8=new Select(aaa);
	s8.selectByIndex(3);
	WebElement q = driver.findElement(By.name("cc_exp_year"));
	Select s9=new Select(q);
	s9.selectByIndex(5);
	WebElement findElement11 = driver.findElement(By.name("cc_cvv"));
	findElement11.sendKeys("233");
	WebElement findElement12 = driver.findElement(By.name("book_now"));
	findElement12.click();
	}
	}

