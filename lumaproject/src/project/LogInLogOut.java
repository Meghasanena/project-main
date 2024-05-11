package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LogInLogOut {
 
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(1000);

//scroll the page to the bottom then to the top
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement bottom=driver.findElement(By.xpath("//ul[@class='footer links']/child::li[3]"));
		js.executeScript("arguments[0].scrollIntoView();", bottom);
		Thread.sleep(1000);
		WebElement top=driver.findElement(By.xpath("//input[@id='search']"));
		js.executeScript("arguments[0].scrollIntoView();", top);
		Thread.sleep(1000);
	
//click on SignIn
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(1000);
		
//forgot pass
		
		driver.findElement(By.xpath("//a[@class='action remind']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("Megha@gmail.com");
		Thread.sleep(1000);
		
		WebElement resetpass=driver.findElement(By.xpath("//button[@class='action submit primary']"));
		js.executeScript("arguments[0].scrollIntoView();", resetpass);
		Thread.sleep(1000);
		resetpass.click();
		Thread.sleep(1000);
		
		
//sign in
		WebElement lemail=driver.findElement(By.xpath("//input[@name='login[username]']"));
		lemail.sendKeys("Megha@gmail.com");
		Thread.sleep(1000);
		
		WebElement lpass=driver.findElement(By.xpath("//input[@name='login[password]']"));
		lpass.sendKeys("M@s1234567890");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='action login primary']")).click();
		Thread.sleep(2000);
		
//search with sign in 
		WebElement search2=driver.findElement(By.xpath("//input[@id='search']"));
		search2.click();
		Thread.sleep(1000);
		search2.sendKeys("Tops");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='action search']")).click();
		
//add to cart with sign in
		WebElement leahtop2 = driver.findElement(By.linkText("Leah Yoga Top"));
		js.executeScript("arguments[0].scrollIntoView();", leahtop2);
		Thread.sleep(1000);
		leahtop2.click();
		
//selects size
		WebElement item2 = driver.findElement(By.xpath("//div[@id='option-label-size-143-item-166']"));
		js.executeScript("arguments[0].scrollIntoView();", item2);
		Thread.sleep(1000);
		item2.click();
		Thread.sleep(1000);
		
//selects color
		WebElement color2=driver.findElement(By.xpath("//div[@id='option-label-color-93-item-56']"));
		color2.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='action primary tocart']")).click();
		Thread.sleep(2000);
	
//open cart using cart icon on homepage
		WebElement carticon2 = driver.findElement(By.xpath("//div[@class='minicart-wrapper']"));
		js.executeScript("arguments[0].scrollIntoView();", carticon2);
		Thread.sleep(1000);
		carticon2.click();
		Thread.sleep(2000);
		
//proceeds to checkout
		driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']")).click();
		Thread.sleep(2000);
		
		
//enters checkout details in the form
		WebElement street=driver.findElement(By.xpath("//input[@name='street[0]']"));
		js.executeScript("arguments[0].scrollIntoView();",street );
		Thread.sleep(2000);
		street.sendKeys("ABC bungalows, Lohiya nagar");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("PUNE");
		Thread.sleep(1000);
		
//selecting province from dropdown	
		WebElement province=driver.findElement(By.xpath("//select[@name='region_id']"));
		js.executeScript("arguments[0].scrollIntoView();",province );
		Thread.sleep(2000);
		Select s1=new Select(province);
		s1.selectByVisibleText("Alaska");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("12345-6789");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("9215472868");
		Thread.sleep(2000);

		//driver.findElement(By.xpath("//input[@name='ko_unique_1']")).click();
		//Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='button action continue primary']")).click();
		Thread.sleep(5000);
		
		WebElement discount=driver.findElement(By.xpath("//span[@id='block-discount-heading']"));
		js.executeScript("arguments[0].scrollIntoView();",discount );
		Thread.sleep(2000);
		discount.click();
		Thread.sleep(2000);
		driver.findElement(By.id("discount-code")).sendKeys("CODE");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='action action-apply']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='action primary checkout']")).click();
		
//re-order the same things ordered above using reorder functionality
		driver.findElement(By.xpath("//button[@class='action switch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='nav items']//child::li[1]")).click();
		Thread.sleep(1000);
		WebElement reorder=driver.findElement(By.xpath("//a[@class='action order']"));
		js.executeScript("arguments[0].scrollIntoView();",reorder );
		Thread.sleep(1000);
		reorder.click();
		Thread.sleep(1000);
		WebElement recheckout=driver.findElement(By.linkText("Proceed to Checkout"));
		js.executeScript("arguments[0].scrollIntoView();",recheckout );
		Thread.sleep(1000);
		recheckout.click();
		Thread.sleep(3000);
		WebElement renext=driver.findElement(By.xpath("//button[@class='button action continue primary']"));
		js.executeScript("arguments[0].scrollIntoView();",renext );
		Thread.sleep(1000);
		renext.click();
		Thread.sleep(3000);
		WebElement replaceorder=driver.findElement(By.xpath("//button[@class='action primary checkout']"));
		js.executeScript("arguments[0].scrollIntoView();",replaceorder );
		Thread.sleep(1000);
		replaceorder.click();
		Thread.sleep(3000);
		
//log out
		driver.findElement(By.xpath("//button[@class='action switch']")).click();
		Thread.sleep(1000);

		driver.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(1000);
		
//search without sign in 
		WebElement search1=driver.findElement(By.xpath("//input[@id='search']"));
		search1.click();
		Thread.sleep(1000);
		search1.sendKeys("Tops");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='action search']")).click();
		
//add to cart without sign in
		WebElement leahtop = driver.findElement(By.linkText("Leah Yoga Top"));
		js.executeScript("arguments[0].scrollIntoView();", leahtop);
		Thread.sleep(1000);
		leahtop.click();
		
		WebElement item1 = driver.findElement(By.xpath("//div[@id='option-label-size-143-item-166']"));
		js.executeScript("arguments[0].scrollIntoView();", item1);
		Thread.sleep(1000);
		item1.click();
		Thread.sleep(1000);
		
		WebElement color1=driver.findElement(By.xpath("//div[@id='option-label-color-93-item-56']"));
		color1.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='action primary tocart']")).click();
		Thread.sleep(2000);
		
		WebElement carticon = driver.findElement(By.xpath("//div[@class='minicart-wrapper']"));
		js.executeScript("arguments[0].scrollIntoView();", carticon);
		Thread.sleep(1000);
		carticon.click();
		Thread.sleep(1000);
		
//remove from cart
		WebElement removeitem=driver.findElement(By.xpath("//a[@class='action delete']"));
		removeitem.click();
		Thread.sleep(1000);
				
		driver.findElement(By.xpath("//button[@class='action-primary action-accept']")).click();

//support this project 
		
		driver.findElement(By.linkText("Support This Project")).click();
		Thread.sleep(2000);
		WebElement desc=driver.findElement(By.xpath("//input[@class='w-full tw-remove-default-styling tw-input-common cursor-text font-cr-medium placeholder:font-cr-book tw-box-common-v2 mt-4 text-sm']"));
		desc.click();
		Thread.sleep(1000);
		desc.sendKeys("MEGHA");
		Thread.sleep(2000);
		WebElement supportbtn=driver.findElement(By.xpath("//div[@class='relative group']"));
		js.executeScript("arguments[0].scrollIntoView();", supportbtn);
		Thread.sleep(1000);
		supportbtn.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("megha@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='tw-btn-bg relative flex justify-center items-center focus:outline-none ring-transparent cursor-pointer font-cr-bold w-full h-12 px-5 text-white tw-dark-color-rounded-full mt-6']")).click();
		Thread.sleep(1000);
		
//add review
		driver.navigate().to("https://magento.softwaretestingboard.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(1000);
		
		WebElement email=driver.findElement(By.xpath("//input[@name='login[username]']"));
		email.sendKeys("Megha@gmail.com");
		Thread.sleep(1000);
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='login[password]']"));
		pass.sendKeys("M@s1234567890");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='action login primary']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Radiant Tee")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='action add']")).click();
		Thread.sleep(3000);
		
		WebElement rating=driver.findElement(By.xpath("//div[@class='control review-control-vote']/child::label[1]"));
		js.executeScript("arguments[0].scrollIntoView();", rating);
		Thread.sleep(1000);
		rating.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='summary_field']")).sendKeys("test data");		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='review_field']")).sendKeys("summary details");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
		Thread.sleep(1000);	

	}

}
