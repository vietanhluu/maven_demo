package maven_test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Config extends SetUp {

	@BeforeClass
	public void beforeClass() {
		System.out.println("before");
		SetUp.setUp();
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after");
		driver.quit();
	}

}