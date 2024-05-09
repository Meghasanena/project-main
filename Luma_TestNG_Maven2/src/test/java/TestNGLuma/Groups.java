package TestNGLuma;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groups {

   WebDriver driver;
   
	@BeforeTest
	public void launchurl() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);		
	}
	
	
	@Test(groups={"group 1"})
	public void alogin() throws InterruptedException {
	
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(1000);
		WebElement lemail=driver.findElement(By.xpath("//input[@name='login[username]']"));
		lemail.sendKeys("Megha@gmail.com");
		Thread.sleep(1000);
		
		WebElement lpass=driver.findElement(By.xpath("//input[@name='login[password]']"));
		lpass.sendKeys("M@s1234567890");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='action login primary']")).click();
		Thread.sleep(2000);
	}
	
	@Test(groups={"group 1"})

public void bupdateaccountinfo() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='action switch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='nav items']//child::li[7]")).click();
		Thread.sleep(1000);
		WebElement changepass=driver.findElement(By.xpath("//input[@id='change-password']"));
		changepass.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='current-password']")).sendKeys("M@s1234567890");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("M@s1234567890");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("M@s1234567890");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='action save primary']")).click();
		Thread.sleep(1000);
	}
	
	
	@Test(groups={"group 2"})
	public void compareproducts() throws InterruptedException {
		driver.navigate().to("https://magento.softwaretestingboard.com/");
		driver.findElement(By.linkText("Radiant Tee")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='action tocompare']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Gwyn Endurance Tee")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='action tocompare']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='action compare']")).click();
		Thread.sleep(2000);
		}
	
	@Test(groups={"group 2"})
	public void dremovefromcompare() throws InterruptedException {
		driver.findElement(By.xpath("//table[@id='product-comparison']/child::thead/child::tr/child::td[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='action-primary action-accept']")).click();
		Thread.sleep(2000);
		
		
	}
	@AfterTest
public void closebrowser() {
	driver.quit();
	}
	
}
