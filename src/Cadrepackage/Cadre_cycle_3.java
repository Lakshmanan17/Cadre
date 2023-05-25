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

public class Cadre_cycle_3 {
WebDriver driver;
	@Test(priority = 0)
	public void login() throws InterruptedException{	
		System.setProperty("webdriver.chrome.driver","\\Chromedriver\\chromedriver.exe");			
		driver=new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://dev.hirecadre.com/auth/login");
		//Change Email and password
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
		log.sendKeys("info+cadretd2@scbw.com");
		driver.findElement(By.id("login_password")).sendKeys("info+cadretd2@scbw.com");
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
		System.out.println("login TD successfully");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/traveldirector/contract/ended']")).click();/*Ended contract*/
		JavascriptExecutor je=(JavascriptExecutor)driver;
		/*WebElement eve1=driver.findElement(By.xpath("//a[@href='/traveldirector/contract/completed']"));/*completed contract*/
		/*je.executeScript("arguments[0].scrollIntoView(true);",eve1);
		eve1.click();*/
		Thread.sleep(2000);
		/*change current contract event*/
		
		WebElement eve2=driver.findElement(By.xpath("//span[@title='Delirium EIF']"));
		je.executeScript("arguments[0].scrollIntoView(true);",eve2);
		eve2.click();
		
	}
	
	@Test(priority = 1,enabled = false)
	public void TD_view_itinerary() throws InterruptedException {

		//driver.findElement(By.xpath("//button[text()='View itinerary']")).click();
		//driver.findElement(By.xpath("//div[@class='ui huge button medium-btn btn-blue']")).click();
		System.out.println("TD_view itinerary Successfully");
		
	}
	
	
	@Test(priority = 2,enabled = false)
	public void ADD_Expense1() throws InterruptedException {		
		driver.findElement(By.xpath("//button[text()='Options']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Add expenses']")).click();
		driver.findElement(By.xpath("//button[@class='ui huge button medium-btn btn-blue']")).click();
		driver.findElement(By.xpath("//input[@id='event_expense_date_picker']")).click();
		//Change date
		
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/form/div/div[6]/div/div/div/ngx-my-date-picker/div/div/table[2]/tbody/tr[5]/td[4]/div/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/form/div/div[7]/div/div[1]/div/sui-radio-button/label")).click();
		driver.findElement(By.xpath("//sui-select[@name='event_expense_type']")).click();
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/form/div/div[8]/div/div/div/sui-select/div[3]/sui-select-option[1]/span[2]")).click();
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("99");
		driver.findElement(By.xpath("//input[@id='note']")).sendKeys("demo");
		WebElement uploadElement=driver.findElement(By.xpath("//input[@id='expense_reciept']"));
		uploadElement.sendKeys("C:\\Users\\Lakshmanan\\Downloads\\invoice\\Invoice.png");		
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement but1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/form/div/div[12]/button")));
				but1.click();
				Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/a/i")).click();
		System.out.println("Successfully added Expense1");
	}
	
	@Test(priority = 3,enabled = false)
	public void ADD_Expense2() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='ui huge button medium-btn btn-blue']")).click();
		driver.findElement(By.xpath("//input[@id='event_expense_date_picker']")).click();
		//Change date
		
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/form/div/div[6]/div/div/div/ngx-my-date-picker/div/div/table[2]/tbody/tr[5]/td[4]/div/span")).click();
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/form/div/div[7]/div/div[1]/div/sui-radio-button/label")).click();
		driver.findElement(By.xpath("//sui-select[@name='event_expense_type']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/form/div/div[8]/div/div/div/sui-select/div[3]/sui-select-option[2]/span[2]")).click();
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("50");
		driver.findElement(By.xpath("//input[@id='note']")).sendKeys("demo");
		WebElement uploadElement1=driver.findElement(By.xpath("//input[@id='expense_reciept']"));
		uploadElement1.sendKeys("C:\\Users\\Lakshmanan\\Downloads\\invoice\\sample.png");		
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement but=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/form/div/div[12]/button")));
				but.click();
				Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/a/i")).click();
		System.out.println("Successfully added Expense2");
	}
	
	@Test(priority = 4,enabled = false)
	public void ADD_Expense_3() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='ui huge button medium-btn btn-blue']")).click();
		driver.findElement(By.xpath("//input[@id='event_expense_date_picker']")).click();
		//Change date
		
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/form/div/div[6]/div/div/div/ngx-my-date-picker/div/div/table[2]/tbody/tr[5]/td[4]/div/span")).click();
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/form/div/div[7]/div/div[1]/div/sui-radio-button/label")).click();
		driver.findElement(By.xpath("//sui-select[@name='event_expense_type']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/form/div/div[8]/div/div/div/sui-select/div[3]/sui-select-option[3]/span[2]")).click();
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("70");
		driver.findElement(By.xpath("//input[@id='note']")).sendKeys("demo");
		WebElement uploadElement2=driver.findElement(By.xpath("//input[@id='expense_reciept']"));
		uploadElement2.sendKeys("C:\\Users\\Lakshmanan\\Downloads\\invoice\\invoice1.gif");
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement but=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/form/div/div[12]/button")));
				but.click();
				Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/a/i")).click();
		System.out.println("Successfully added Expense3");
	}
	
	@Test(priority = 5,enabled = false)
	public void ADD_Expense_4() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='ui huge button medium-btn btn-blue']")).click();
		driver.findElement(By.xpath("//input[@id='event_expense_date_picker']")).click();
		//Change date
		
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/form/div/div[6]/div/div/div/ngx-my-date-picker/div/div/table[2]/tbody/tr[5]/td[4]/div/span")).click();
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/form/div/div[7]/div/div[1]/div/sui-radio-button/label")).click();
		driver.findElement(By.xpath("//sui-select[@name='event_expense_type']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/form/div/div[8]/div/div/div/sui-select/div[3]/sui-select-option[5]/span[2]")).click();
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("70");
		driver.findElement(By.xpath("//input[@id='note']")).sendKeys("demo");
		WebElement uploadElement2=driver.findElement(By.xpath("//input[@id='expense_reciept']"));
		uploadElement2.sendKeys("C:\\Users\\Lakshmanan\\Downloads\\invoice\\Invoice3.png");
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement but=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/form/div/div[12]/button")));
				but.click();
				Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/a/i")).click();
		System.out.println("Successfully added Expense4");
	}
	@Test(priority = 6,enabled = false)
	public void ADD_Expense_Mileage() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='ui huge button medium-btn btn-blue']")).click();
		driver.findElement(By.xpath("//input[@id='event_expense_date_picker']")).click();
		//Change date
		
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/form/div/div[6]/div/div/div/ngx-my-date-picker/div/div/table[2]/tbody/tr[5]/td[4]/div/span")).click();
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/form/div/div[7]/div/div[1]/div/sui-radio-button/label")).click();
		driver.findElement(By.xpath("//sui-select[@name='event_expense_type']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/form/div/div[8]/div/div/div/sui-select/div[3]/sui-select-option[4]/span[2]")).click();
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,40);
		WebElement loc1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[3]")));
		loc1.sendKeys("usa");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".result:nth-child(2) > span:nth-child(2)")).click();		
		WebElement loc=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[4]")));
		loc.sendKeys("usa");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".visible > .item:nth-child(3) > span:nth-child(2)")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='note']")).sendKeys("demo");		
		WebElement but=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Save')]")));
				but.click();
		System.out.println("Added Mileage Expenses Successfully ");
	}
	
	@Test(priority = 7,enabled = false)
	public void Edit_Update_Expense() throws InterruptedException {
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[text()='Edit']")).click();/*Active contract*/
		driver.findElement(By.xpath("//a[text()='View']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='color-blue' and text()='Edit']")).click();
		driver.findElement(By.xpath("//sui-select[@name='event_expense_type']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/form/div/div[8]/div/div/div/sui-select/div[2]/sui-select-option[5]/span[2]")).click();
		WebElement amount=driver.findElement(By.xpath("//input[@id='amount']"));
		amount.clear();
		amount.sendKeys("90");
		WebElement desc=driver.findElement(By.xpath("//input[@id='note']"));
		desc.clear();
		desc.sendKeys("demo sample");
		driver.findElement(By.xpath("//button[@class='ui medium button']")).click();
		System.out.println("Edit & Update Expense successfully");
	}
	@Test(priority = 8,enabled = false)
	public void withdraw_Expense() throws InterruptedException {
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[text()='Edit']")).click();/*Active contract*/
		driver.findElement(By.xpath("//a[text()='View']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app/ng-component/sui-sidebar-container/sui-sidebar/div/div/div/div[10]/button[1]")).click();
		System.out.println("withdraw_Expense successfully");
	}
	
	@Test(priority = 9,enabled = false)
	public void Submit_expense() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(.,'Submit for approval')]")).click();
		driver.findElement(By.xpath("//button[contains(.,'Complete contract')]")).click();
		System.out.println("TD submit expense Successfully");
	}
	@Test(priority = 10)
	public void Leave_feedback() throws InterruptedException {
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Options']")).click();
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement leav=driver.findElement(By.xpath("/html/body/sui-popup/div/div[2]/a[2]"));
		leav.click();
		WebElement leav1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='main-content']/div/div/div[2]/ng-component/div/div[2]/div/ng-component/ng-component/div/div[2]/div/div/div[2]/form/div/div[2]/div/sui-rating/i[4]")));
		leav1.click();
		driver.findElement(By.xpath("//textarea[@name='contract_feedback_public']")).sendKeys("demo");
		driver.findElement(By.name("contract_feedback_private")).sendKeys("Demo");
		driver.findElement(By.xpath("//button[contains(.,'Submit')]")).click();
		driver.quit();
	}
	
	@Test(priority = 11,enabled = false)
	public void Approve_expense() throws InterruptedException {
		driver.get("https://dev.hirecadre.com/auth/login");
		//change Email and password
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
		log.sendKeys("info+cadrepl126@scbw.com");
		driver.findElement(By.id("login_password")).sendKeys("info+cadrepl126@scbw.com");
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
		System.out.println("login planner successfully");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='/planner/events/active']")).click();
        Thread.sleep(5000);
		JavascriptExecutor je=(JavascriptExecutor)driver;        
       //( (JavascriptExecutor)driver).executeScript("scroll 0,400");	
		//change Contract Event name
		
		WebElement eve1=driver.findElement(By.xpath("//span[@title='Alpha Event in pl126']"));		
		je.executeScript("arguments[0].scrollIntoView(true);",eve1);
		eve1.click();
		WebElement eve2=driver.findElement(By.xpath("//div[text()='Jessie Black']"));
		je.executeScript("arguments[0].scrollIntoView(true);",eve2);
		eve2.click();
		WebElement log1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Complete contract']")));
		log1.click();
		driver.findElement(By.xpath("//div[@id='main-content desktop-only']/div/div/div[2]/ng-component/div[2]/div[2]/div/ng-component/ng-component/div/div[2]/div/div/div/div[1]/sui-accordion/sui-accordion-panel/div[2]/div/div/div/table/thead/tr/th[1]/div/input")).click();
		driver.findElement(By.xpath("//button[text()='Approve & pay (1)']")).click();
		driver.findElement(By.xpath("//input[@id='bonus_amount']")).sendKeys("100");
		driver.findElement(By.xpath("//span[text()='Complete contract']")).click();
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		/*Leave feedback*/
		driver.findElement(By.xpath("//div[@id='main-content desktop-only']/div/div/div[2]/ng-component/div[2]/div[2]/div/ng-component/ng-component/div/div[2]/div/div/div[2]/form/div/div[2]/div/sui-rating/i[4]")).click();
		driver.findElement(By.xpath("//textarea[@name='contract_feedback_public']")).sendKeys("demo");
		driver.findElement(By.xpath("//div[@id='main-content desktop-only']/div/div/div[2]/ng-component/div[2]/div[2]/div/ng-component/ng-component/div/div[2]/div/div/div[2]/form/div/div[5]/div/sui-rating/i[4]")).click();
		driver.findElement(By.xpath("//textarea[@name='contract_feedback_private']")).sendKeys("demo");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}
	
}
