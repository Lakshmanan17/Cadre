package Cadrepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Cadre_Cycle_1 {
	WebDriver driver;
	
	
	@Test(priority = 0)
	public void login_pl(){		
		System.setProperty("webdriver.chrome.driver","\\Chromedriver\\chromedriver.exe");			
		 driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://dev.hirecadre.com/auth/login");
		//Change Name & Last name
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
		log.sendKeys("info+cadrepl110@scbw.com");
		driver.findElement(By.id("login_password")).sendKeys("info+cadrepl110@scbw.com");
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
		System.out.println("login planner successfully");		
		
	}
		
	
	@Test(priority = 1,groups = {"Create_Event"})
	public void Create_Event() throws InterruptedException {
		Thread.sleep(2000);
	//driver.findElement(By.xpath("//a[@class='ui button medium-button']")).click();
	WebDriverWait wait=new WebDriverWait(driver,20);
	WebElement eve=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@popuptext='Create new event']")));
	eve.click();
	//change Event name
	
	WebElement eventname=driver.findElement(By.id("event_name"));
	eventname.sendKeys("Alpha6 Event in pl110");
	driver.findElement(By.xpath("//input[@class='prompt ng-untouched ng-pristine ng-valid']")).sendKeys("usa");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div[2]/div[2]/div[1]/cui-search/div[2]/cui-search-result[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='event_start_date']")).click();
	driver.findElement(By.xpath("//span[@class='markcurrday']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='event_end_date']")).click();
	//change End date
	
	driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div[2]/div[4]/div[1]/div/div[2]/ngx-my-date-picker/div/div/table[2]/tbody/tr[5]/td[4]/div")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("event_client_name")).sendKeys("Demo");
	driver.findElement(By.id("event_client_reference")).sendKeys("D-67886655");
	driver.findElement(By.xpath("//sui-select[@name='event_industry']")).click();
	driver.findElement(By.cssSelector(".visible > .item:nth-child(4)")).click();
	driver.findElement(By.id("staff_needed")).sendKeys("4");
	Thread.sleep(2000);
	driver.findElement(By.id("staff_arrival_date")).click();
	driver.findElement(By.xpath("//span[@class='markcurrday']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("staff_departure_date")).click();
	//change End date
	
	driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div[3]/div[2]/div[1]/div/div[2]/ngx-my-date-picker/div/div/table[2]/tbody/tr[5]/td[4]/div")).click();
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
	driver.findElement(By.xpath("//button[contains(.,'Next')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@name='public_notes']")).sendKeys("demo");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@name='about']")).sendKeys("demo");
	driver.findElement(By.xpath("//input[@id='event_expense_policy_agree']")).click();
	driver.findElement(By.xpath("//input[@id='event_terms_policy_agree']")).click();
	driver.findElement(By.xpath("//button[text()='Post event' and @class='ui huge button large-btn btn-text button-width-height']")).click();
	
	}
	@Test(priority = 2,groups={"invite_TD"})
	public void invite_TD() throws InterruptedException{
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement cli=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".item-box-child:nth-child(6) > .item:nth-child(1)")));
		cli.click();		
		/*WebElement element=driver.findElement(By.xpath("//span[@title='Private Event in pl123']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;  /*element hide and disable to find using this code*/
		/*executor1.executeScript("arguments[0].click()",element);
		WebDriverWait wait1=new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.elementToBeClickable(element));
		element.click();*/
		Thread.sleep(2000);
		//Change Event name
		
		WebElement  element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='Alpha6 Event in pl110']")));  
		element.click();
		Thread.sleep(2000);
		//Change invited TD
		
		driver.findElement(By.xpath("//input[@id='search_candidate']")).sendKeys("Kimberly");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ui right floated button button-invite invite']")).click();
		System.out.println("invite_TD successfully");
		

}
	@Test(priority = 3,groups = {"sent_QA"})
	public void sent_QA() throws InterruptedException {
		Thread.sleep(1000);
		WebDriverWait wait= new WebDriverWait(driver, 20);
		WebElement qa =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\"main-content desktop-only\"]/div/div/div[2]/ng-component/div[2]/div[2]/div/ng-component/ng-component/div[1]/section/nav/ol/li[2]/a")));
		qa.click();
		WebElement text=driver.findElement(By.xpath("//textarea[@class='ui-text-area ng-untouched ng-pristine ng-valid' ]"));
		text.click();
		text.sendKeys("demo");
		driver.findElement(By.xpath("//button[@class='ui huge button medium-btn' ]")).click();
		System.out.println("Sent_QA Message successfully");
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	
	@Test(priority = 4)
	public void TD_invite_Place_bid() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","\\Chromedriver\\chromedriver.exe");			
		 driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://dev.hirecadre.com/auth/login");
		//Change Email and password
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
		log.sendKeys("info+cadretd12@scbw.com");
		driver.findElement(By.id("login_password")).sendKeys("info+cadretd12@scbw.com");
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
		System.out.println("login TD successfully");
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//a[@href='/traveldirector/events/invited']")).click();
		//Change Event name
		
		WebElement  element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='Alpha6 Event in pl110']")));  
		element.click();
		driver.findElement(By.cssSelector(".big-button")).click();
	    driver.findElement(By.xpath("//div[@id=\"main-content\"]/div/div/div[2]/ng-component/div[2]/div[2]/div/ng-component/ng-component/div[3]/div[2]/div[2]/div/sui-accordion/sui-accordion-panel/div[2]/div/div/div/div[1]/table/tbody/tr[1]/td[6]/div/input")).click();
	    driver.findElement(By.xpath("//div[@id=\"main-content\"]/div/div/div[2]/ng-component/div[2]/div[2]/div/ng-component/ng-component/div[3]/div[2]/div[2]/div/sui-accordion/sui-accordion-panel/div[2]/div/div/div/div[1]/table/tbody/tr[1]/td[6]/div/input")).sendKeys("200");
	    driver.findElement(By.xpath("//div[@id='main-content']/div/div/div[2]/ng-component/div[2]/div[2]/div/ng-component/ng-component/div[3]/div[2]/div[2]/div/sui-accordion/sui-accordion-panel/div[2]/div/div/div/div[1]/table/tbody/tr[2]/td[6]/div/input")).click();
	    driver.findElement(By.xpath("//div[@id='main-content']/div/div/div[2]/ng-component/div[2]/div[2]/div/ng-component/ng-component/div[3]/div[2]/div[2]/div/sui-accordion/sui-accordion-panel/div[2]/div/div/div/div[1]/table/tbody/tr[2]/td[6]/div/input")).sendKeys("200");
	    driver.findElement(By.cssSelector(".teal")).click();
	    driver.findElement(By.id("event_bid_expiry_date_picker")).click();
	    //change Expiry date
	    
	    driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/form/div[3]/div[6]/div[1]/ngx-my-date-picker/div/div/table[2]/tbody/tr[5]/td[4]/div/span")).click();
	    driver.findElement(By.xpath("//textarea[@name='comments']")).sendKeys("Demo");
	    driver.findElement(By.xpath("//button[text()='Airplane']")).click();
	    driver.findElement(By.id("agree_terms")).click();
	    driver.findElement(By.xpath("//button[@class='ui right floated teal small button']")).click();
	    driver.findElement(By.xpath("//button[text()='Done']")).click();    
	    System.out.println("Travel director successfully placed bid");	 
		}
		@Test(priority = 5)
	    public void Edit_update_bids() {
	    driver.findElement(By.xpath("//a[text()='Offer sent']")).click();
	    driver.findElement(By.xpath("//button[@class='ui button btn-text btn-blue']")).click();
	    WebElement edit_bid= driver.findElement(By.xpath("//input[@name='event_bid_amount']"));
	    edit_bid.click();
	    edit_bid.clear();
	    edit_bid.sendKeys("500");
	    WebElement date_picker= driver.findElement(By.id("event_bid_expiry_date_picker"));
	    date_picker.click();
	    //change date picker date
	    
	    driver.findElement(By.xpath("//tr[6]/td[7]")).click();
	    WebElement edit_pitch= driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div/form/div[3]/div[6]/textarea"));
	    edit_pitch.clear();
	    edit_pitch.sendKeys("Sample demo");
	    driver.findElement(By.xpath("//button[text()='Train']")).click();
	    driver.findElement(By.id("agree_terms")).click();
	    driver.findElement(By.xpath("//button[text()='Submit']")).click();
	    System.out.println("Edit & update bids is successfully ");	
	}
	    @Test(priority = 6)
	    public void withdraw_bids() throws InterruptedException {
	    	Thread.sleep(5000);
	    	/*driver.get("https://dev.hirecadre.com/auth/login");
			driver.findElement(By.id("login_email")).sendKeys("info+cadretd21@scbw.com");
			driver.findElement(By.id("login_password")).sendKeys("info+cadretd21@scbw.com");
			driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
			System.out.println("Travel director login Successfully");*/
	   
	 
		WebElement button=driver.findElement(By.xpath("//a[text()='Available']"));   
	    button.click();   
	    WebElement button2=driver.findElement(By.xpath("//a[text()='Offer sent']"));   
	    button2.click();    
	    WebElement button3=driver.findElement(By.xpath("//button[text()='Edit offer']"));   
	    button3.click();   
	    Thread.sleep(2000);
	    WebElement button1=driver.findElement(By.xpath("//button[@class='ui primary basic btn-text delete-btn']"));
	    button1.click();
	    System.out.println("withdraw bids is successfully ");
	    
	   
	    

	}
		@Test(priority = 7,enabled = false)
	public void QA() throws InterruptedException{
			Thread.sleep(3000);
			//change Event number 
			
			driver.findElement(By.xpath("//a[@href='/traveldirector/events/invited/58372/qa']")).click();
			driver.findElement(By.xpath("//textarea[@class='ui-text-area ng-untouched ng-pristine ng-valid']")).sendKeys("demo");
			driver.findElement(By.xpath("//button[@class='ui huge button medium-btn']")).click();
			System.out.println("Q/A sent to planner successfully");
			
		}
		
		@Test(priority = 8)
	public void promote_your_self() throws InterruptedException {
			Thread.sleep(3000);
			JavascriptExecutor js= (JavascriptExecutor)driver;
			WebElement invite=driver.findElement(By.xpath("//a[text()='Promote yourself']"));
			js.executeScript("arguments[0].scrollIntoView(true);",invite);
			invite.click();
			driver.findElement(By.xpath("//a[text()='Promote yourself']")).click();
			WebDriverWait wait=new WebDriverWait(driver,20);
			WebElement inv=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='full_name']")));
			inv.sendKeys("demo");
			WebElement inv1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));
			inv1.sendKeys("demo@scbw.com");
			WebElement inv2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='note']")));
			inv2.sendKeys("demo");
			WebElement inv3=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ui medium button']")));
			inv3.click();
			
			driver.quit();
		}
	
	
}
