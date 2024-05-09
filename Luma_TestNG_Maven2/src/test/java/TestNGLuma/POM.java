package TestNGLuma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM {

	WebDriver driver;
	public POM(WebDriver driver){
		this.driver=driver;
	}
	
	By email=(By.xpath("//input[@name='login[username]']"));
	By password=(By.xpath("//input[@name='login[password]']"));
	By loginbtn=(By.xpath("//button[@class='action login primary']"));
	By item=(By.linkText("Radiant Tee"));
    By wishlist=(By.xpath("//a[@class='action towishlist']"));
    By whatsnew=(By.xpath("//a[@id='ui-id-3']"));
    By subcategory=(By.linkText("Hoodies & Sweatshirts"));
    
  
    
   
    
	public void launchURL() throws InterruptedException {
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(1000);
	}
	
	
//login with valid credentials
	public void login(String emails,String pass) throws InterruptedException {
		driver.findElement(email).sendKeys(emails); 
		Thread.sleep(1000);
		driver.findElement(password).sendKeys(pass);
		Thread.sleep(1000);
		driver.findElement(loginbtn).click();
	}

	public void addtowishlist() throws InterruptedException {
		driver.findElement(item).click();
		Thread.sleep(1000);
		driver.findElement(wishlist).click();
		Thread.sleep(1000);
	}
	public void clickonsidecategoriesandgobacktohomepage() throws InterruptedException {
		
		driver.findElement(whatsnew).click();
		Thread.sleep(1000);
		driver.findElement(subcategory).click();
		Thread.sleep(1000);
		driver.navigate().to("https://magento.softwaretestingboard.com/");
	}
	
}
