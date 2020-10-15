package maven_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action extends SetUp {
	
	public static void waitForVisible(String xpath) {

		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	public static void pause (long milisecond)
	{
		try
		{
			Thread.sleep(milisecond);
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void typeText(String xpath, String value) {

		WebElement element = driver.findElement(By.xpath(xpath));
		element.clear();
		element.sendKeys(value);

	}

	public static void clickElement(String xpath) {

		WebElement element = driver.findElement(By.xpath(xpath));
		waitForVisible(xpath);
		element.click();

	}
	

	
	

}
