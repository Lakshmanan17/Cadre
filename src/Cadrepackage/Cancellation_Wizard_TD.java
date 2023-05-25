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

public class Cancellation_Wizard_TD {
	WebDriver driver;
	@BeforeSuite
	public void launch_browser() {
		System.setProperty("webdriver.chrome.driver","\\Chromedriver\\chromedriver.exe");			
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
	@Test(priority = 1)
	public void TD_Refund_Contract() throws InterruptedException {
		
		driver.get("https://dev.hirecadre.com/auth/login");
		//Change Email and password
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
		log.sendKeys("info+cadretd18@scbw.com");
		driver.findElement(By.id("login_password")).sendKeys("info+cadretd18@scbw.com");
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
		WebElement opt=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/traveldirector/contract/active']")));
		opt.click();
		/*change event*/
		
		WebElement opt1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='Beta event in pl126']")));
		opt1.click();		
		WebElement opt2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Options']")));
		opt2.click();
		Thread.sleep(3000);
		WebElement opt3=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Change contract']")));
		opt3.click();
		WebElement opt4=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='I want to refund a charge (i.e. day rate, per diem, bonus etc.)']")));
		opt4.click();
		WebElement opt5=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ui primary button cta-medium-small']")));
		opt5.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[6]/div/sui-accordion/sui-accordion-panel[1]/div[1]/div/div/div")).click();
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[6]/div/sui-accordion/sui-accordion-panel[1]/div[2]/div/div/div/button")).click();
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[6]/div/sui-accordion/sui-accordion-panel[2]/div[1]/div/div/div")).click();
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[6]/div/sui-accordion/sui-accordion-panel[2]/div[2]/div/div/div/button")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement opt6=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue']")));
		js.executeScript("arguments[0].scrollIntoView(true)",opt6);
		opt6.click();
		WebElement opt7=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
		js.executeScript("arguments[0].scrollIntoView(true)",opt7);
		opt7.click();
		Thread.sleep(3000);
	}
	@Test(priority =2,enabled = false)
	public void Pl_accept_Refund_Request() throws InterruptedException {
		driver.get("https://dev.hirecadre.com/auth/login");
		WebDriverWait wait=new WebDriverWait(driver,20);
		// Change Email and password
		
		WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
		log.sendKeys("info+cadrepl126@scbw.com");
		driver.findElement(By.id("login_password")).sendKeys("info+cadrepl126@scbw.com");
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
		System.out.println("login planner successfully");	
		Thread.sleep(3000);
		driver.findElement(By.className("bell-img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='View change request']")).click();
		Thread.sleep(2000);
		WebElement opt8=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\"main-content desktop-only\"]/div/div/div[2]/ng-component/div[2]/div[2]/div/ng-component/ng-component/div/div[2]/div/a/div")));
		opt8.click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement opt9=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div[7]/button[2]")));
		js.executeScript("arguments[0].scrollIntoView[true]",opt9);
		opt9.click();
		Thread.sleep(3000);
	}
	@Test(priority = 5)
	public void TD_cancel_Contract() throws InterruptedException {

		driver.get("https://dev.hirecadre.com/auth/login");
		WebDriverWait wait=new WebDriverWait(driver,20);
		//Change Email and Password
		
		WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
		log.sendKeys("info+cadretd18@scbw.com");
		driver.findElement(By.id("login_password")).sendKeys("info+cadretd18@scbw.com");
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
		WebElement opt=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/traveldirector/contract/active']")));
		opt.click();
		/*change event*/
		
		WebElement opt1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='Beta event in pl126']")));
		opt1.click();
		Thread.sleep(3000);
		WebElement opt12=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Options']")));
		opt12.click();
		Thread.sleep(2000);
		WebElement opt13=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Change contract']")));
		opt13.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[5]/button[1]/span[2]")).click();
		WebElement opt14=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[6]/div[1]/button")));
		opt14.click();
		Thread.sleep(2000);
		WebElement opt15=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='xxl-btn-text'and text()='Cancel entire contract']")));
		opt15.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[6]/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[7]/div[1]/button")).click();
        Thread.sleep(3000);	
}
	@Test(priority =6)
	public void Pl_accept_cancel_Request() throws InterruptedException {
		driver.get("https://dev.hirecadre.com/auth/login");
		//Change Email and password
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
		log.sendKeys("info+cadrepl126@scbw.com");
		driver.findElement(By.id("login_password")).sendKeys("info+cadrepl126@scbw.com");
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
		System.out.println("login planner successfully");	
		Thread.sleep(3000);
		driver.findElement(By.className("bell-img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='View change request']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"main-content desktop-only\"]/div/div/div[2]/ng-component/div[2]/div[2]/div/ng-component/ng-component/div/div[4]/div/a/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div[7]/button[2]")).click();
		
	}
	@Test(priority = 3,enabled = false)
	public void TD_partial_cancel_Contract() throws InterruptedException {
		driver.get("https://dev.hirecadre.com/auth/login");
		//Change Email and password
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
		log.sendKeys("info+cadretd18@scbw.com");
		driver.findElement(By.id("login_password")).sendKeys("info+cadretd18@scbw.com");
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
		WebElement opt=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/traveldirector/contract/active']")));
		opt.click();
		/*change event*/
		
		WebElement opt1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='Beta event in pl126']")));
		opt1.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Options']")).click();
		Thread.sleep(3000);
		WebElement optt1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Change contract']")));
		optt1.click();
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[5]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[6]/div[1]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[5]/button[1]")).click();
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[6]/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[5]/div[1]/div/input")).click();
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[5]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[6]/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/div[8]/div[1]/button")).click();
		
	}	
	@Test(priority =4,enabled = false )
	public void Pl_accept_partial_cancel_Request() throws InterruptedException {
		driver.get("https://dev.hirecadre.com/auth/login");
		//Change Email and password
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
		log.sendKeys("info+cadrepl126@scbw.com");
		driver.findElement(By.id("login_password")).sendKeys("info+cadrepl126@scbw.com");
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
		System.out.println("login planner successfully");	
		Thread.sleep(3000);
		driver.findElement(By.className("bell-img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='View change request']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id=\"main-content desktop-only\"]/div/div/div[2]/ng-component/div[2]/div[2]/div/ng-component/ng-component/div/div[3]/div/a/div")).click();
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div[7]/button[2]")).click();
		Thread.sleep(3000);
	}

}
