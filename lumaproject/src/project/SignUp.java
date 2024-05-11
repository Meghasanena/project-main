package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(1000);
		
	//SignUp
		driver.findElement(By.linkText("Create an Account")).click();
		Thread.sleep(1000);
		
		WebElement firstname=driver.findElement(By.xpath("//input[@id='firstname']"));
		firstname.sendKeys("Megha");
		Thread.sleep(1000);
		
		WebElement lastname=driver.findElement(By.xpath("//input[@id='lastname']"));
		lastname.sendKeys("Sanena");
		Thread.sleep(1000); 
		
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("Megha@gmail.com");
		Thread.sleep(1000);
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("M@s1234567890");
		Thread.sleep(1000);
		
		WebElement cpass=driver.findElement(By.xpath("//input[@name='password_confirmation']"));
		cpass.sendKeys("M@s1234567890");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
		Thread.sleep(2000);
		
	}

}
