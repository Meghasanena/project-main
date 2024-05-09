package TestNGLuma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallingPOM {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		POM pom=new POM(driver);
		pom.launchURL();
		pom.login("Megha@gmail.com", "M@s1234567890");
		pom.addtowishlist();
		pom.clickonsidecategoriesandgobacktohomepage();
	}

}
