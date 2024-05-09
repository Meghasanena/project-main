package TestNGLuma;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HoverTheMouseAndOpenMultipleWindows {
	
 WebDriver driver;
 
	@BeforeTest
	public void invokebrowser() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(1000);
		
	}
	
//used navigation command plus takes screenshot of what's new
	
	@Test(priority=1)
	public void screenshot() throws IOException, InterruptedException {
		
		driver.navigate().to("https://magento.softwaretestingboard.com/what-is-new.html");
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\DELL\\Desktop\\EXCELR PPTS\\project.png");
		
		FileHandler.copy(src, destination);
		Thread.sleep(1000);
		driver.navigate().back();
	}
	
	//hover on categories
	@Test (priority=2)
	public void hoveroncategories() throws InterruptedException {
		
		List <WebElement> links=driver.findElements(By.xpath("//ul[@id='ui-id-2']//child::li"));
		Actions hover=new Actions(driver);
		
		for(int i=1;i<links.size();i++) {
			hover.moveToElement(links.get(i)).build().perform();
			Thread.sleep(1000);
		}
		
	}
	
	//opens links in multiple windows
	
	@Test(priority=3)
	public void multiplewindows() throws InterruptedException {
		
		driver.findElement(By.linkText("What's New")).click();
		Thread.sleep(1000);
		List <WebElement> menu=driver.findElements(By.xpath("//div[@class='categories-menu']//child::ul[1]//child::li"));
		for(int i=0;i==5;i++) {
			menu.get(i).click();
		}
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows);
		
		 Iterator<String> itr=windows.iterator();
	     while(itr.hasNext()) {
	    	 driver.switchTo().window(itr.next());
			 Thread.sleep(1000);
	}
	}
	
	@AfterTest
	public void closebrowser() {
		driver.quit();
	}
}
