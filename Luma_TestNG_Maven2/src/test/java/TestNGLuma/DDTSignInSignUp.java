package TestNGLuma;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDTSignInSignUp {

//SignUp and Sign In with Invalid credentials using DDT concept
	
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Create an Account")).click();
		Thread.sleep(1000);
		
		String filepath="C:\\Users\\DELL\\Desktop\\EXCELR PPTS\\DDT.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook Excelworkbook=new XSSFWorkbook(fis);
		XSSFSheet LUMAsheet1=Excelworkbook.getSheet("LUMA1");
		
		int rows1=LUMAsheet1.getLastRowNum();
		System.out.println("Number of rows "+rows1);
		
		for(int r=1;r<=rows1;r++) {
			XSSFRow row1=LUMAsheet1.getRow(r);
			XSSFCell firstname=row1.getCell(0); 
			XSSFCell lastname=row1.getCell(1);
			XSSFCell email=row1.getCell(2);
			XSSFCell password=row1.getCell(3);
			XSSFCell cpassword=row1.getCell(4);
			
			driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname.toString());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname.toString());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email.toString());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password.toString());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='password_confirmation']")).sendKeys(cpassword.toString());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
			Thread.sleep(2000);	
	}
	
	//log in with invalid data
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(1000);
		
		String filepath1="C:\\Users\\DELL\\Desktop\\EXCELR PPTS\\DDT.xlsx";
		FileInputStream fis1=new FileInputStream(filepath1);
		XSSFWorkbook Excelworkbook1=new XSSFWorkbook(fis1);
		XSSFSheet LUMAsheet2=Excelworkbook1.getSheet("LUMA2");
		
		int rows2=LUMAsheet1.getLastRowNum();
		System.out.println("Number of rows "+rows2);
		
		for(int r2=1;r2<=rows2;r2++) {
			XSSFRow row2=LUMAsheet2.getRow(r2);
			XSSFCell email2=row2.getCell(0);
			XSSFCell password2=row2.getCell(1);
			
			driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys(email2.toString());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys(password2.toString());
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@class='action login primary']")).click();
			Thread.sleep(2000);
			
			driver.quit();
			

}
}
}
