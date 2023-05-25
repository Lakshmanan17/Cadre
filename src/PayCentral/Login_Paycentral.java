package PayCentral;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login_Paycentral {
	WebDriver driver;

	@Test(priority=0)
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","\\Chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://dev.paycentral.co.za/");
		WebDriverWait wait= new WebDriverWait(driver,20);
		WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));
		log.sendKeys("lakshmanan.n@xenovex.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("a0sYa00GKc");
		Thread.sleep(3000);
		WebElement log1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='login']")));
		log1.click();
		
	}
	@Test(priority=1,enabled = false)
	public void Create_seller() throws InterruptedException {
		Thread.sleep(7000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement Seller=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id=\"category-tabs\"]/li[4]/a/span[2]")));
		Seller.click();
		driver.findElement(By.xpath("//span[text()='Manage Resellers']")).click();	
		Thread.sleep(3000);
		WebElement Seller1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-md btn-success']")));
		Seller1.click();
		
		
	}
	@Test(priority=2)
	public void Manage_client() throws InterruptedException {
		Thread.sleep(50000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/header/nav/div[1]/div[2]/div/div")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/header/nav/div[1]/div[2]/div/div/div/ul/li[2]")).click();
		
		Thread.sleep(7000);
		WebElement Client=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='category-tabs']/li[3]/a")));
		Client.click();
		
	}
	@Test(priority=3)
	public void Create_Manage_client() throws InterruptedException {
		Thread.sleep(4000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement Client1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-success']")));
		Client1.click();
		
		WebElement comp=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='companyname']")));
		comp.sendKeys("Demo Company");
		
		WebElement compcc=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='companyccno']")));
		compcc.sendKeys("GHJJ678GHJJ78HH");
		
		WebElement vatt=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='vatno']")));
		vatt.sendKeys("FGH78GBj");
		
		WebElement address1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='address1']")));
		address1.sendKeys("746");
		
		WebElement address2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='address2']")));
		address2.sendKeys("Voortrekker St");
		
		WebElement city=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='city']")));
		city.sendKeys("Amanzimtoti");
		
		WebElement post=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='postalcode']")));
		post.sendKeys("4125");
		
		WebElement firstname=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='Client']/div/div[1]/div[5]/div[1]/div/div/input")));
		firstname.sendKeys("Satheesh");
		
		WebElement lastname=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='Client']/div/div[1]/div[5]/div[2]/div/div/input")));
		lastname.sendKeys("Kumar");
		
		WebElement email=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='Client']/div/div[1]/div[6]/div[1]/div/div/input")));
		email.sendKeys("Kumar017@mail.com");
		
		WebElement ph1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='phoneno']")));
		ph1.sendKeys("9875674657");
		
		WebElement passport=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='passport']")));
		passport.sendKeys("GHHJJ98756HJ");
		
		WebElement contact_no=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='contactnumber']")));
		contact_no.sendKeys("9348347743");
		
		Thread.sleep(2000);
		JavascriptExecutor je=(JavascriptExecutor)driver;
		WebElement submit=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='Client']/div/div[1]/div[10]/button[2]")));
		je.executeScript("arguments[0].scrollIntoView(true);",submit);
		submit.click();	
	}
	@Test(priority = 4,enabled = false) 
	public void Edit_manageclient(){
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement edit= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@id='dashboard-view']/div/div/div[4]/div/div/div/table/tbody/tr[6]/td[4]/div/div[2]/a")));
		edit.click();
		WebElement product=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@id='dashboard-view']/div/div/form/div/div[2]/ul/li[2]/a")));
		product.click();
		WebElement plus=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id=\"plus\"]/button")));
		plus.click();
	}
	
}

