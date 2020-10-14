package maven_test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class maven_demo {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing\\01 - Software\\webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@Test
	public void TC_01_ValidateCurrentUrl() {
		// Login Page Url 
		driver.get("http://www.google.com/");
		driver.findElement(By.id("fsettl")).click();
		driver.findElement(By.xpath("//*[@id='fsett']/a[2]")).click();
	}

	@Test
	public void TC_02_Input_Value() {
		// Sendkey Covid-19
		driver.findElement(By.name("as_q")).sendKeys("Covid-19");
		driver.findElement(By.id(":1b")).click();
		driver.findElement(By.xpath("//*[@id=':19']/div")).click();
	}

	@Test
	public void TC_03_LoginFormDisplayed() {
		// Click login
		driver.findElement(By.xpath("//*[@id='s1zaZb']/div[5]/div[9]/div[2]/input[2]")).click();
	}
	
	@Test
	public void TC_04_Click_News() {
		// Click 1st news
		driver.findElement(By.partialLinkText("COVID-19")).click();
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
