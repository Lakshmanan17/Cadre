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

import com.sun.jdi.connect.Connector.Argument;

public class Cancellation_Wizard_Pl {
WebDriver driver;
@BeforeSuite
public void launch_browser() {
	System.setProperty("webdriver.chrome.driver","\\Chromedriver\\chromedriver.exe");			
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();	
}
	@Test(priority = 1,enabled = false)
	public void change_date() throws InterruptedException {
		driver.get("https://dev.hirecadre.com/auth/login");
		//Change Email and password
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
		log.sendKeys("info+cadrepl1@scbw.com");
		driver.findElement(By.id("login_password")).sendKeys("info+cadrepl1@scbw.com");
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
		System.out.println("login planner successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/planner/events/active']")).click();
		Thread.sleep(3000);
		JavascriptExecutor je=(JavascriptExecutor)driver;
		/*need to change event Name*/
		
		WebElement eve=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='World Aviation Training in pl1']")));
		je.executeScript("arguments[0].scrollIntoView(true);",eve);
		eve.click();
		Thread.sleep(2000);
		/*need to change event No & position no*/
		
		driver.findElement(By.xpath("//a[@href='/planner/events/active/51049/contract/1']")).click();
		driver.findElement(By.xpath("//button[text()='Options']")).click();
		Thread.sleep(3000);
		WebElement opt=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Change contract']")));
		opt.click();
		WebElement change=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='I want to change the dates of this contract']")));
		change.click();
		WebElement ch=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ui primary button cta-medium-small']")));
		ch.click();
		driver.findElement(By.xpath("//input[@name='contract_event_position_end_date']")).click();
		Thread.sleep(3000);
		//change date
		
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[5]/div[3]/div/ngx-my-date-picker/div/div/table[2]/tbody/tr[3]/td[1]/div/span")).click();
		//driver.findElement(By.xpath("//div[contains(.,'3') and @class='datevalue currmonth highlight']")).click();/*Need to change date*/
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='ui primary button cta-medium-small']")).click();
		Thread.sleep(5000);
		

		
	}
	
	@Test(priority = 2,enabled = false)
	public void TD_accept_Dispute() {
		
			driver.get("https://dev.hirecadre.com/auth/login");
			//Change Emails and password
			
			WebDriverWait wait=new WebDriverWait(driver,20);
			WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
			log.sendKeys("info+cadretd32@scbw.com");
			driver.findElement(By.id("login_password")).sendKeys("info+cadretd32@scbw.com");
			driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();			
			driver.findElement(By.className("bell-img")).click();
			driver.findElement(By.xpath("//a[text()='View change request']")).click();
			driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar-sibling/div[2]/div/div/div[2]/ng-component/div/div[2]/div/ng-component/ng-component/div/div[2]/div/a/div")).click();
			JavascriptExecutor je=(JavascriptExecutor)driver;
			WebElement s1=driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div[6]/button[2]"));
			je.executeScript("arguments[0].scrollIntoView(true);",s1);	
			s1.click();	
				}
				
	@Test(priority = 3,enabled = false)
	public void PL_Refund_Transaction() throws InterruptedException {
		driver.get("https://dev.hirecadre.com/auth/login");
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
		log.sendKeys("info+cadrepl1@scbw.com");
		driver.findElement(By.id("login_password")).sendKeys("info+cadrepl1@scbw.com");
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
		System.out.println("login planner successfully");		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/planner/events/active']")).click();
		Thread.sleep(3000);
		JavascriptExecutor je=(JavascriptExecutor)driver;
		/*need to change event Name*/
		
		WebElement eve=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='World Aviation Training in pl1']")));
		je.executeScript("arguments[0].scrollIntoView(true);",eve);
		eve.click();
		Thread.sleep(2000);
		/*need to change event No*/
		
		driver.findElement(By.xpath("//a[@href='/planner/events/active/51049/contract/1']")).click();
		driver.findElement(By.xpath("//button[text()='Options']")).click();
		Thread.sleep(3000);
		WebElement opt1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Change contract']")));
		opt1.click();
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[5]/button[3]")).click();
		WebElement ch1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ui primary button cta-medium-small']")));
		ch1.click();
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[6]/div/sui-accordion/sui-accordion-panel[1]/div[1]/div/div/div")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[6]/div/sui-accordion/sui-accordion-panel[1]/div[2]/div/div/div/table/tbody/tr[1]/td[1]/div/input")).click();
	    driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[6]/div/sui-accordion/sui-accordion-panel[1]/div[2]/div/div/div/table/tbody/tr[2]/td[1]/div/input")).click();
	    Thread.sleep(3000);
	    WebElement butt=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[7]/div[1]/button")));
	    butt.click();
	    Thread.sleep(2000);
	    WebElement but=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
	    je.executeScript("arguments[0].scrollIntoView(true);",but);
	    but.click();
	    Thread.sleep(5000);
	}
	@Test(priority = 4)
	public void TD_accept_Dispute_refund() throws InterruptedException {
		
			driver.get("https://dev.hirecadre.com/auth/login");
			//Change Email and password
			
			WebDriverWait wait=new WebDriverWait(driver,20);
			WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
			log.sendKeys("info+cadretd32@scbw.com");
			driver.findElement(By.id("login_password")).sendKeys("info+cadretd32@scbw.com");
			driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
			driver.findElement(By.className("bell-img")).click();
			driver.findElement(By.xpath("//a[text()='View change request']")).click();
			driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar-sibling/div[2]/div/div/div[2]/ng-component/div/div[2]/div/ng-component/ng-component/div/div[3]/div/a/div")).click();
			JavascriptExecutor je=(JavascriptExecutor)driver;
			WebElement button1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div[6]/button[2]")));
			je.executeScript("arguments[0].ScrollIntoView(true);",button1);
			button1.click();		
			Thread.sleep(3000);
		}
	@Test(priority = 5)
	public void PL_partial_cancel() throws InterruptedException {
		driver.get("https://dev.hirecadre.com/auth/login");
		//Change Email and password
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
		log.sendKeys("info+cadrepl1@scbw.com");
		driver.findElement(By.id("login_password")).sendKeys("info+cadrepl1@scbw.com");
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
		System.out.println("login planner successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/planner/events/active']")).click();
		Thread.sleep(3000);
		JavascriptExecutor je=(JavascriptExecutor)driver;
		/*need to change event Name*/
		
		WebElement eve=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='World Aviation Training in pl1']")));
		je.executeScript("arguments[0].scrollIntoView(true);",eve);
		eve.click();
		Thread.sleep(2000);
		/*need to change event No*/
		
		driver.findElement(By.xpath("//a[@href='/planner/events/active/51049/contract/1']")).click();
		driver.findElement(By.xpath("//button[text()='Options']")).click();
		Thread.sleep(3000);
		WebElement opt1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Change contract']")));
		opt1.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[5]/button[2]")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[6]/div[1]/button")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[5]/button[1]")).click();
	    driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[6]/div[1]/button")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[5]/div[1]/div/input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[5]/div[2]/div/input")).click();
	    driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[6]/div[1]/button")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[9]/div[1]/button")).click();
	    Thread.sleep(5000);
	}
	
	@Test(priority = 6)
	public void TD_accept_Dispute_partial_cancel() throws InterruptedException {
		
			driver.get("https://dev.hirecadre.com/auth/login");
			//Change Email and Password
			
			WebDriverWait wait=new WebDriverWait(driver,20);
			WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
			log.sendKeys("info+cadretd32@scbw.com");
			driver.findElement(By.id("login_password")).sendKeys("info+cadretd32@scbw.com");
			driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
			driver.findElement(By.className("bell-img")).click();
			driver.findElement(By.xpath("//a[text()='View change request']")).click();
			driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar-sibling/div[2]/div/div/div[2]/ng-component/div/div[2]/div/ng-component/ng-component/div/div[4]/div/a/div")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div[6]/button[2]")).click();		
			
		}
	@Test(priority = 7)
	public void PL_entire_cancel() throws InterruptedException {
		driver.get("https://dev.hirecadre.com/auth/login");
		//Change Email and password
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
		log.sendKeys("info+cadrepl1@scbw.com");
		driver.findElement(By.id("login_password")).sendKeys("info+cadrepl1@scbw.com");
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
		System.out.println("login planner successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/planner/events/active']")).click();
		Thread.sleep(3000);
		JavascriptExecutor je=(JavascriptExecutor)driver;
		/*need to change event Name*/
		
		WebElement eve=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='World Aviation Training in pl1']")));
		je.executeScript("arguments[0].scrollIntoView(true);",eve);
		eve.click();
		Thread.sleep(2000);
		/*need to change event No*/
		
		driver.findElement(By.xpath("//a[@href='/planner/events/active/51049/contract/1']")).click();
		driver.findElement(By.xpath("//button[text()='Options']")).click();
		Thread.sleep(3000);
		WebElement opt1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Change contract']")));
		opt1.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[5]/button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[6]/div[1]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[5]/button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[6]/div[1]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[9]/div[1]/button")).click();
		Thread.sleep(5000);
	}
	@Test(priority = 8)
	public void TD_accept_Dispute_entire_cancel() throws InterruptedException {
		
			driver.get("https://dev.hirecadre.com/auth/login");
			//Change Email and password
			
			WebDriverWait wait=new WebDriverWait(driver,20);
			WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
			log.sendKeys("info+cadretd32@scbw.com");
			driver.findElement(By.id("login_password")).sendKeys("info+cadretd32@scbw.com");
			driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();			
			driver.findElement(By.className("bell-img")).click();
			driver.findElement(By.xpath("//a[text()='View change request']")).click();
			driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar-sibling/div[2]/div/div/div[2]/ng-component/div/div[2]/div/ng-component/ng-component/div/div[5]/div/a/div")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div[6]/button[2]")).click();		
			
		}
	
}
