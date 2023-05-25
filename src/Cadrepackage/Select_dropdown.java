package Cadrepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Select_dropdown {
WebDriver driver;
	
	@Test(priority = 0)
	public void register_TD() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","\\Chromedriver\\chromedriver.exe");		
		 driver=new ChromeDriver();
		 new WebDriverWait(driver, 10);
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://dev.hirecadre.com/auth/signup");
	driver.findElement(By.xpath("//input[@id='user_first_name']")).sendKeys("Sathya");
	driver.findElement(By.id("user_last_name")).sendKeys("TD00139");
	driver.findElement(By.id("register_email")).sendKeys("info+cadretd00139@scbw.com");
	driver.findElement(By.id("register_password")).sendKeys("info+cadretd00139@scbw.com");	
	Thread.sleep(5000);/*
	WebElement element=driver.findElement(By.className("selection ui dropdown ng-pristine ng-invalid ng-touched"));
	 
	Select sel1=new Select(element);
	sel1.selectByVisibleText("Travel Director - Looking for jobs");
	WebElement sel=sel1.getFirstSelectedOption();
	System.out.println("first element="+sel.getText());
	*/
	try {
		Thread.sleep(5000);
		Select dropdown=new Select(driver.findElement(By.xpath("/html/body/app/ng-component/div/div/div[2]/div/sui-tabset/div[3]/div/form/div[7]/div/sui-select/div[3]")));
		
		dropdown.selectByVisibleText("Travel Director - Looking for jobs");
	}
	catch(Exception e){
		System.out.println(e);
	}
	/*
	driver.findElement(By.xpath("//i[@class='dropdown icon']")).click();
	driver.findElement(By.xpath("/html/body/app/ng-component/div/div/div[2]/div/sui-tabset/div[3]/div/form/div[7]/div/sui-select/div[3]/sui-select-option[2]/span[2]")).click();
	*/
	
	//driver.findElement(By.xpath("//span[contains(.,'Travel Director - Looking for jobs')]")).click();
	driver.findElement(By.xpath("//button[contains(.,'Create account')]")).click();
}
}
