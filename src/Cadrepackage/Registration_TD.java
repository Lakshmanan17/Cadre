package Cadrepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class Registration_TD {
WebDriver driver;
	
	@Test(priority = 0)
	public void register_TD() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","\\Chromedriver\\chromedriver.exe");		
		 driver=new ChromeDriver();
		 new WebDriverWait(driver, 10);
		 WebDriverWait wait=new WebDriverWait(driver,20);
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://dev.hirecadre.com/auth/signup");
	driver.findElement(By.xpath("//input[@id='user_first_name']")).sendKeys("Hardik");
	driver.findElement(By.id("user_last_name")).sendKeys("TD164");
	driver.findElement(By.id("register_email")).sendKeys("info+cadretd164@scbw.com");
	driver.findElement(By.id("register_password")).sendKeys("info+cadretd162\4@scbw.com");			
	driver.findElement(By.xpath("//i[@class='dropdown icon']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/app/ng-component/div/div/div[2]/div/sui-tabset/div[3]/div/form/div[7]/div/sui-select/div[3]/sui-select-option[2]/span[2]")).click();
	driver.findElement(By.xpath("//button[contains(.,'Create account')]")).click();
	
	/*driver.get("https://dev.hirecadre.com/auth/login");
		
		WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login_email']")));
		log.sendKeys("info+cadretd157@scbw.com");
		driver.findElement(By.id("login_password")).sendKeys("info+cadretd157@scbw.com");
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
			*/
	
    WebElement e=driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[1]/div[3]/div/input"));
    e.click();   
    WebElement a=driver.findElement(By.xpath("//input[@id='nick_name']"));
    a.clear();
    a.sendKeys("Sakthi");
    WebElement b=driver.findElement(By.xpath("//input[@id='mobile']"));
    b.clear();
    b.sendKeys("9873636636");
    WebElement c=driver.findElement(By.xpath("//input[@id='zipcode']"));
    c.clear();
    c.sendKeys("10001");
    
    WebElement d=driver.findElement(By.xpath("//button[text()='Male' and @class='ui button select-btn']"));

    d.click();
	driver.findElement(By.xpath("//input[@id='user_profile_agree']")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Next step']")).click();
	
	
	WebElement uploadElement=driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/div[1]/div[2]/div/div[1]/div/slim/div/input[1]"));
	uploadElement.sendKeys("C:\\Users\\Lakshmanan\\Downloads\\New folder\\model-007.jpg");
	driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/button[2]")).click();
	 driver.findElement(By.xpath("/html/body/app/ng-component/div[2]/div[3]/div/ng-component/div[4]/button[2]")).click();
	
	driver.findElement(By.xpath("//div[text()='VIP service' and @class='center-text-expertise']")).click();
	driver.findElement(By.xpath("//div[text()='Transportation' and @class='center-text-expertise']")).click();
	driver.findElement(By.xpath("//div[text()='Business Meetings' and @class='center-text-expertise']")).click();
	driver.findElement(By.linkText("Room amenities")).click();
	driver.findElement(By.linkText("Meet & Greet")).click();
	driver.findElement(By.linkText("English")).click();
	driver.findElement(By.linkText("Tamil")).click();
	driver.findElement(By.linkText("Eventbrite")).click();
	WebElement Daily_rate = driver.findElement(By.xpath("//sui-select[@name='daily_rate_budget']"));	      
			Daily_rate.click();
	driver.findElement(By.cssSelector(".item:nth-child(1)")).click();		

	WebElement target = driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[7]/div[3]/label"));
	target.click();

	WebElement target1 = driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[7]/div[8]/label"));
	target1.click();

	WebElement target2 = driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[7]/div[11]/label"));
	target2.click();
	driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[9]/textarea")).sendKeys("Demo");
	driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[11]/button[2]")).click();
	
	driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[2]/div[1]/div[1]/cui-search/div[1]/input")).sendKeys("jfk");
	driver.findElement(By.xpath("/html/body/app/ng-component/div[2]/div[3]/div/ng-component/form/div[2]/div[1]/div[1]/cui-search/div[2]/cui-search-result[1]")).click();
	WebElement Text=driver.findElement(By.xpath("//textarea[@name='comments']"));
	Text.click();
	Text.sendKeys("Window Seat");
	driver.findElement(By.id("emergency_contact_full_name")).sendKeys("Demo");
	driver.findElement(By.id("emergency_contact_phone_number")).sendKeys("9876567765");
	driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[4]/div[3]/div[1]/sui-select/i")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[4]/div[3]/div[1]/sui-select/div[3]/sui-select-option[2]/span[2]")).click();
	driver.findElement(By.xpath("/html/body/app/ng-component/div[2]/div[3]/div/ng-component/form/div[6]/div/div[1]/sui-select/i")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[6]/div/div[1]/sui-select/div[3]/sui-select-option[2]")).click();		
	
	WebElement click= wait.until(ExpectedConditions.elementToBeClickable(By.id("document_full_name")));
	click.click();
	click.sendKeys("Demo");
	WebElement click1=driver.findElement(By.id("travel_director_user_dob"));
	click1.click();
	click1.sendKeys("11/11/1990");
	WebElement click2=driver.findElement(By.id("travel_director_license_issue_date_text"));
	click2.click();
	click2.sendKeys("11/11/2000");
	WebElement click3=driver.findElement(By.id("travel_director_license_expiry_date_text"));
	click3.click();
	click3.sendKeys("11/11/2020");
	
	driver.findElement(By.xpath("//sui-select[@name='user_polo_shirt_size']")).click();
	driver.findElement(By.cssSelector(".visible > .item:nth-child(3)")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//sui-select[@name='user_device']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[8]/div[2]/div[1]/sui-select/div[3]/sui-select-option[2]")).click();	

	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Next step']")).click();	
	
	
	
	driver.findElement(By.xpath("//button[text()='Checking']")).click();
	driver.findElement(By.id("user_bank_account_name")).sendKeys("Demo");
	driver.findElement(By.id("user_bank_account_routing_number")).sendKeys("85457544884");
	driver.findElement(By.id("user_bank_account_number")).sendKeys("89547547547547848");
	/* WebElement chkcdPersist = driver.findElement(By.className("ng-untouched ng-pristine ng-invalid"));
	for (int i=0; i<2; i++) {										
	            chkcdPersist.click ();
	             System.out.println("Cadre Persists Checkbox Status is -  "+chkcdPersist.isSelected());

		}*/
	driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[4]/div/div/input")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Next step']")).click();
	Thread.sleep(3000);
    driver.findElement(By.xpath("/html/body/w-div[3]/span")).click();
	
	WebElement clic=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='container-center']/div[3]/div/ng-component/form/div[1]/div[2]/div[1]/div/button[1]")));
	clic.click();
	driver.findElement(By.id("user_legal_name")).sendKeys("Demo");
	/*Select tax = new Select(driver.findElement(By.className("selection ui dropdown ng-pristine ng-valid ng-touched")));
			tax.selectByVisibleText("S Corporation");*/
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[1]/div[6]/div[1]/sui-select/i")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[1]/div[6]/div[1]/sui-select/div[3]/sui-select-option[4]")).click();
	driver.findElement(By.id("user_tax_address")).sendKeys("Demo");
	driver.findElement(By.id("user_tax_zipcode")).sendKeys("10001");
	driver.findElement(By.id("user_tax_ein")).sendKeys("111111111");
	 WebElement chkrdPersist = driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[1]/div[12]/input"));									
	 chkrdPersist.click ();
	driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[1]/div[14]/input")).click();   
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[3]/button[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[1]/div[2]/div[1]/div/button[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[3]/button[2]")).click();
	
	driver.findElement(By.xpath("//input[@id=\"user_ssn\"]")).sendKeys("111-11-2001");
	driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[3]/button[2]")).click();
	driver.findElement(By.id("user_checkr_agree_signature")).sendKeys("Demo");
	driver.findElement(By.xpath("//button[text()='Next step']")).click();
	driver.findElement(By.id("user_checkr_disclosure_acknowledge")).click();
	
	driver.findElement(By.xpath("//button[text()='Next step']")).click();
	driver.findElement(By.id("user_checkr_fcra_agree")).click();
	
	driver.findElement(By.xpath("//button[text()='Next step']")).click();


	driver.findElement(By.id("card_number")).sendKeys("4242424242424242");
	driver.findElement(By.id("card_holder_name")).sendKeys("Demo");
	driver.findElement(By.id("card_expiry_month_year")).sendKeys("12/22");
	driver.findElement(By.id("card_cvc")).sendKeys("123");
	driver.findElement(By.xpath("//button[text()='Submit Payment']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Next step']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@id=\"container-center\"]/div[3]/div/ng-component/form/div[3]/a")).click();
	System.out.print("Registration Travel director successfully");

	
	}

	
	
	

}
