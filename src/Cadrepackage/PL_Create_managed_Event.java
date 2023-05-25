package Cadrepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PL_Create_managed_Event {
	WebDriver driver;
	@BeforeSuite
	public void login_pl() throws InterruptedException{		
		System.setProperty("webdriver.chrome.driver","\\Chromedriver\\chromedriver.exe");			
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://dev.hirecadre.com/auth/login");
		driver.findElement(By.xpath("//input[@id='login_email']")).sendKeys("info+cadrepl1@scbw.com");
		driver.findElement(By.id("login_password")).sendKeys("info+cadrepl1@scbw.com");
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
		System.out.print("login planner successfully");
		Thread.sleep(3000);
	   }
		@Test
		public void Create_managed_Event() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='ui button medium-button']")).click();
	   // driver.findElement(By.xpath("//a[@popuptext='Create new event']")).click();
		WebElement eventname=driver.findElement(By.id("event_name"));
		eventname.sendKeys("Demo Event in pl1");
		driver.findElement(By.xpath("//input[@class='prompt ng-untouched ng-pristine ng-valid']")).sendKeys("usa");
		driver.findElement(By.cssSelector(".result:nth-child(4) > span:nth-child(2)")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='event_start_date']")).click();
		driver.findElement(By.xpath("//span[@class='markcurrday']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='event_end_date']")).click();
		driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div[2]/div[4]/div[1]/div/div[2]/ngx-my-date-picker/div/div/table[2]/tbody/tr[5]/td[4]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("event_client_name")).sendKeys("Demo");
		driver.findElement(By.id("event_client_reference")).sendKeys("D-678866554");
		driver.findElement(By.xpath("//sui-select[@name='event_industry']")).click();
		driver.findElement(By.cssSelector(".visible > .item:nth-child(4)")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//sui-select[@name='event_fee_type']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"content\"]/div/div[2]/div[2]/div[7]/div[1]/sui-select/div[3]/sui-select-option[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//sui-select[@name='event_managed_client']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"content\"]/div/div[2]/div[2]/div[9]/div[1]/sui-select/div[3]/sui-select-option[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Managed client company']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"content\"]/div/div[2]/div[2]/div[10]/div[1]/sui-select/div[3]/sui-select-option/span[2]")).click();
		
		WebElement name=driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div[2]/div[11]/div/cui-search/div/input"));
		name.click();
		name.sendKeys("J");		
		driver.findElement(By.cssSelector(".visible span:nth-child(2)")).click();
		driver.findElement(By.id("staff_needed")).sendKeys("4");
		Thread.sleep(2000);
		driver.findElement(By.id("staff_arrival_date")).click();
		driver.findElement(By.xpath("//span[@class='markcurrday']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("staff_departure_date")).click();
		driver.findElement(By.xpath("//div[@id=\"content\"]/div/div[2]/div[3]/div[2]/div[1]/div/div[2]/ngx-my-date-picker/div/div/table[2]/tbody/tr[5]/td[4]/div")).click();
		
		
		driver.findElement(By.xpath("//sui-select[@name='event_daily_rate_budget_type']")).click();
		driver.findElement(By.cssSelector(".visible > .item:nth-child(1)")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//sui-select[@name='event_meal']")).click();
		driver.findElement(By.cssSelector(".visible > .item:nth-child(2)")).click();
		driver.findElement(By.xpath("//button[contains(.,'Next')]")).click();
		
		driver.findElement(By.xpath("//sui-select[@name='event_expense_policy_type']")).click();
		driver.findElement(By.cssSelector(".item:nth-child(1) > span:nth-child(2)")).click();
		driver.findElement(By.xpath("//sui-select[@name='event_expense_policy_type']")).click();
		driver.findElement(By.cssSelector(".large-btn")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar-sibling/div[2]/div/div/div[2]/ng-component/form/div/div/div[2]/div[3]/div/button[1]")).click();
		driver.findElement(By.xpath("//button[contains(.,'Next')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@name='public_notes']")).sendKeys("demo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name='about']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id='event_expense_policy_agree']")).click();
		driver.findElement(By.xpath("//input[@id='event_terms_policy_agree']")).click();
		driver.findElement(By.xpath("//button[text()='Post event' and @class='ui huge button large-btn btn-text button-width-height']")).click();
		
		}
 
		@AfterSuite(enabled = true)
		 public void close_browser() {
			 driver.quit();
		 }
	
	}


