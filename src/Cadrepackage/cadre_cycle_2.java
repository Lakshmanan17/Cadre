package Cadrepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class cadre_cycle_2 {
WebDriver driver;

	@BeforeSuite
	public void login_pl(){		
		System.setProperty("webdriver.chrome.driver","\\Chromedriver\\chromedriver.exe");			
		driver=new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();		
		driver.get("https://dev.hirecadre.com/auth/login");
		WebDriverWait wait=new WebDriverWait(driver,20);
		//Change Email and password
		
		WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
		log.sendKeys("info+cadrepl110@scbw.com");
		driver.findElement(By.id("login_password")).sendKeys("info+cadrepl110@scbw.com");
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
		System.out.println("login planner successfully");	
		}
	
	
	
	@Test(priority = 8,groups = {"payment_method"})
	public void payment_method() throws InterruptedException {
		
		JavascriptExecutor je=(JavascriptExecutor)driver;		
		WebElement payment=driver.findElement(By.xpath("//div[@id=\"left-sidebar\"]/div/div[7]/a[3]"));
		je.executeScript("arguments[0].scrollIntoView(true);",payment);
		payment.click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Credit Card ' ]")).click();
		driver.findElement(By.xpath("//input[@id='amount' ]")).sendKeys("2000");
		driver.findElement(By.xpath("//input[@id='card_number']")).sendKeys("4242424242424242");
		driver.findElement(By.xpath("//input[@id='card_holder_name' ]")).sendKeys("Demo");
		driver.findElement(By.xpath("//input[@id='card_expiry_month_year']")).sendKeys("12/22");
		driver.findElement(By.xpath("//input[@id='card_cvc' ]")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='agree_add_cadre_credit_terms' ]")).click();
		driver.findElement(By.xpath("//input[@id='save_card' ]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='ui medium button' ]")).click();
		System.out.println("void payment Successfully");
		

	}
	

		
		/*Hire the TD */
		
	@Test(priority = 1,groups = {"Hire_td"})
	public void Hire_td() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='item' and @routerlink='/planner/events/active']")).click();
		Thread.sleep(3000);
		/*change event name*/
		
		driver.findElement(By.xpath("//span[text()='Alpha6 Event in pl110']")).click();
		driver.findElement(By.xpath("//div[@id='main-content desktop-only']/div/div/div[2]/ng-component/div[2]/div[2]/div/ng-component/ng-component/div[1]/section/nav/ol/li[3]/a")).click();
		driver.findElement(By.xpath("//div[@id='main-content desktop-only']/div/div/div[2]/ng-component/div[2]/div[2]/div/ng-component/ng-component/div[3]/div[1]/div/div/div/a")).click();
		driver.findElement(By.xpath("//div[@id='main-content desktop-only']/div/div/div[2]/ng-component/div[2]/div[2]/div/ng-component/div/div[4]/div/div/div[1]/div/div[2]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("agree_terms")).click();	
		driver.findElement(By.xpath("//button[@class='ui medium button']")).click();
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div[3]/div[6]/a")).click();
		System.out.println("Hired TD Successfully");	
	
	}  
	
	
	
	
	
	@Test(priority = 2,groups = {"Upload_itinerary"})
	public void Upload_itinerary() throws InterruptedException {
		Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[@id='main-content desktop-only']/div/div/div[2]/ng-component/div[2]/div[2]/div/ng-component/div[1]/div[1]/div/div/div/div[1]/div[2]/button[2]")).click();
	   WebElement uploadElement=driver.findElement(By.xpath("//input[@id='itinerary']"));
	   uploadElement.sendKeys("C:\\Users\\Lakshmanan\\Downloads\\sample_attachment.pdf");
	   System.out.println("Upload itinerary Successfully");
	
	}
	
	@Test(priority = 3,groups = {"ADD_transaction"})
	public void ADD_transaction() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Options']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Add bonus']")).click();
		driver.findElement(By.xpath("//sui-select[@name='transaction_type']")).click();
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/form/div/div[3]/div/div/sui-select/div[3]/sui-select-option[1]/span[2]")).click();
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("50");
		driver.findElement(By.xpath("//button[@class='ui medium button']")).click();
		System.out.println("ADD Transaction Successfully");
	}
	
	@Test(priority = 4,groups = {"private_Message_TD"})
	public void private_Message_TD() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Send message']")).click();
		driver.findElement(By.xpath("//div[@id='main-content desktop-only']/div/div/div[2]/ng-component/div[2]/div[2]/div/ng-component/ng-component/div/div[2]/div/div/div/div[3]/div/div/div/textarea")).sendKeys("demo");
		WebElement uploadElement1=driver.findElement(By.xpath("//input[@id='message_attachment']"));
		uploadElement1.sendKeys("C:\\Users\\Lakshmanan\\Downloads\\sample_attachment.pdf");
		driver.findElement(By.xpath("//button[@class='ui huge button medium-btn']")).click();
		System.out.println("Sent private Message Successfully");
	}
	
	@Test(priority = 5,groups= {"Myteam"})
public void Myteam() throws InterruptedException {
		Thread.sleep(10000);
	driver.findElement(By.xpath("//a[text()='My Team']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='main-content desktop-only']/div/div/div[2]/ng-component/div/div[3]/div[2]/div/div/div[2]/div[2]/button")).click();
	//driver.findElement(By.xpath("//a[text()='My Team']")).click();/*playing profile video*/
	driver.findElement(By.xpath("//button[@class='ui medium button']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='ui huge button small-btn btn-blue ']")).click();/*invite*/
	driver.findElement(By.id("full_name")).sendKeys("Demo");
	driver.findElement(By.id("email")).sendKeys("demo1@scbw.com");
	driver.findElement(By.id("note")).sendKeys("demo");
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/form/div[4]/div[2]/button")).click();
	driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/a/i")).click();
	System.out.println("invited MY TEAM Successfully");
	
}
@Test(priority = 6,groups = {"contact"})
public void contact() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver,20); 
	WebElement contacts=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='item' and text()='Contact']")));
	contacts.click();
	WebElement com=driver.findElement(By.xpath("//input[@id='company_name']"));
	com.clear();
	com.sendKeys("Demo company");
	WebElement mob=driver.findElement(By.xpath("//input[@id='mobile']"));
	mob.clear();
	mob.sendKeys("9876565434");
	
	WebElement uploadElement=driver.findElement(By.xpath("//div[@id='main-content desktop-only']/div/div/div[2]/ng-component/div/div/form/div[2]/div/div[1]/div[1]/slim/div/input[1]"));
	uploadElement.sendKeys("C:\\Users\\Lakshmanan\\Downloads\\New folder\\model-007.jpg");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@title='Confirm']")).click();
	WebElement del=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ui huge button large-btn btn-text']")));
	del.click();
	System.out.println("Contact updated Successfully");
	
}

@Test(priority = 7,groups = {"settings"},enabled = false)
public void settings() throws InterruptedException {
	Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,20); 
	WebElement Setting=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='item' and text()='Settings']")));
	Setting.click();
	//Change Email
	
	driver.findElement(By.xpath("//input[@id='old_password' ]")).sendKeys("info+cadrepl111@scbw.com");
	driver.findElement(By.xpath("//input[@id='new_password' ]")).sendKeys("info+cadrepl111@scbw.com");
	driver.findElement(By.xpath("//input[@id='confirm_password' ]")).sendKeys("info+cadrepl111@scbw.com");
	driver.findElement(By.xpath("//button[text()='Change password']")).click();
	System.out.println("Updated Settings Successfully");
	
	 driver.quit();
}
 @AfterSuite(enabled = false)
 public void close_browser() {
	 driver.quit();
 }





@Test(priority = 3,enabled = false)
public void TD_request_itinerary() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","\\Chromedriver\\chromedriver.exe");			
	 driver = new ChromeDriver();		
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://dev.hirecadre.com/auth/login");
	//Change Email and password
	
	WebDriverWait wait=new WebDriverWait(driver,20);
	WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
	log.sendKeys("info+cadretd11@scbw.com");
	driver.findElement(By.id("login_password")).sendKeys("info+cadretd11@scbw.com");
	driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
	System.out.println("login TD successfully");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='/traveldirector/contract/active']")).click();
	/*change current contract event*/
	
	driver.findElement(By.xpath("//span[@title='Alpha event in pl97']")).click();
	driver.findElement(By.xpath("//button[text()='Request itinerary']")).click();
	driver.findElement(By.xpath("ui huge button medium-btn btn-blue")).click();
	System.out.println("TD_request_itinerary sucessfully");
	driver.quit();
}
}
