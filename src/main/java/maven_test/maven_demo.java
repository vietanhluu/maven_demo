package maven_test;

import org.testng.annotations.Test;

public class maven_demo extends Config {
	public static String Input = "Covid19";
	public static String Language = "lang_vi";
	public static String Time = "d";
	public static String SettingBtn = "//*[@id='fsettl']";
	public static String AdvSearchBtn = "//*[@id='fsett']/a[2]";
	public static String SearchField = "//*[@name='as_q']";
	public static String LanguageField = "//*[@id=':1b']";
	public static String LanguageSetting = "//*[@class='goog-menuitem' and @value= '" + Language + "']";
	public static String TimeField = "//*[@id=':84']";
	public static String TimeSetting = "//*[@class='goog-menuitem' and @value= '" + Time + "']";
	public static String SearchBtn = "//*[@id='s1zaZb']/div[5]/div[9]/div[2]/input[2]";

	
	@Test
	public void TC_01_LoginAdvanceSearch() {
		// Login Page Url 
		System.out.println("Test 1 is running");
		Action.clickElement(SettingBtn);
		Action.clickElement(AdvSearchBtn);
	}

	@Test
	public void TC_02_Search_Setting() {
		// Setting search
		System.out.println("Test 2 is running");
		Action.clickElement(SearchField);
		Action.typeText(SearchField, Input);
		Action.clickElement(LanguageField);
		Action.clickElement(LanguageSetting);
		Action.clickElement(TimeField);
		Action.clickElement(TimeSetting);
	}

	@Test
	public void TC_03_Click_SearchBtn() {
		// Show results
		System.out.println("Test 3 is running");
		Action.clickElement(SearchBtn);
	}
	

}
