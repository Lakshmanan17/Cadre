package Cadrepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Event_scroll {
	WebDriver driver;
	@BeforeSuite
	public void launch_browser() {
		System.setProperty("webdriver.chrome.driver","\\Chromedriver\\chromedriver.exe");			
		 driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://dev.hirecadre.com/auth/login");
	}
	
	@Test(priority = 0)
	public void login_pl() throws InterruptedException{		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
		log.sendKeys("info+cadrepl1@scbw.com");
		driver.findElement(By.id("login_password")).sendKeys("info+cadrepl1@scbw.com");
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
		System.out.println("login planner successfully");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='/planner/events/active']")).click();
        Thread.sleep(7000);
		JavascriptExecutor je=(JavascriptExecutor)driver;
        
       //( (JavascriptExecutor)driver).executeScript("scroll 0,400");
		
		WebElement eve1=driver.findElement(By.xpath("//span[@title='Toy Fair - New York Event in pl1']"));
		
		je.executeScript("arguments[0].scrollIntoView(true);",eve1);
		eve1.click();
		
		
	}
		

}
