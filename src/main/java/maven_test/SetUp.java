package maven_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetUp {
	static WebDriver driver = null;
	static WebDriverWait myWait;

	public static void setUp(){
		System.setProperty("webdriver.chrome.driver", "webdriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		myWait = new WebDriverWait(driver, 10);
		
	}
	
}