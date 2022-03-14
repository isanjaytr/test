package orgday10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\seliniumday1\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://demo.automationtesting.in/Alerts.html");
    WebElement btnclk = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
    btnclk.click();
    WebElement btnclk1 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
    btnclk1.click();
    Alert a1=driver.switchTo().alert();
    a1.sendKeys("sanjay");
      a1.accept();
    
WebElement f = driver.findElement(By.xpath("//p[contains(text(),'Hello sanjay How are you today')]"));
String text = f.getText();
System.out.println(text); 













}
}