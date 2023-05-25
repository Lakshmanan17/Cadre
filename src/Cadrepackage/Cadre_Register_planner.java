package Cadrepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cadre_Register_planner {
	WebDriver driver;
	@Test
	public void Register_PL() {
		System.setProperty("webdriver.chrome.driver","\\Chromedriver\\chromedriver.exe");		
		driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://dev.hirecadre.com/auth/signup");
	
	//change Name & Lastname
driver.findElement(By.xpath("//input[@id='user_first_name']")).sendKeys("Rahul");
driver.findElement(By.id("user_last_name")).sendKeys("pl0136");
//change Email& password
driver.findElement(By.id("register_email")).sendKeys("info+cadrepl0136@scbw.com");
driver.findElement(By.id("register_password")).sendKeys("info+cadrepl0136@scbw.com");
	
driver.findElement(By.cssSelector(".selection")).click();
driver.findElement(By.cssSelector(".transition > .item:nth-child(1)")).click();

driver.findElement(By.xpath("//button[contains(.,'Create account')]")).click();
System.out.print("Registration planner successfully");
}

}
