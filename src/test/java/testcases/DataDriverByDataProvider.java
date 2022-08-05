package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriverByDataProvider {
	WebDriver driver;
	@BeforeMethod
	public void launchUrl()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		this.driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
	}
	@Test(dataProvider = "userData")
	public void verifyValidLogin(String user, String pass)
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pass");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
	}
	@DataProvider(name = "userData")
	public String [][] dataProvider(){
		String [][] array= {{"user1","password1"},{"user2","password2"}};
		return array;
	}
}
