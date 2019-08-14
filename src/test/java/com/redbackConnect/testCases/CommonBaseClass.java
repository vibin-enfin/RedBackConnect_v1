package com.redbackConnect.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CommonBaseClass
{
	public static WebDriver driver;
	
	public String baseURL = "https://conference.rdbk.com.au/swagger/ui/index#/";
	public String cname = "123456789";
	public String cemail = "testmail@gm.com";
	public String cphone = "123456789";
	public String cstarttime = "14/08/2019 10:50:00 am";
	public String cendtime = "14/08/2019 11:50:00 am";
	public String cpasscode = "41905897";
	public String cmoderatorcode = "45572457";
	public String cenddate = "14/08/2019 12:50:00 am";
	public String cshowtcp = "1";
	
	
	
	@BeforeClass
	public void setupChrome()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriverV76.exe");
		driver = new ChromeDriver();
	}
	
	/*@AfterClass
	public void closeChrome()
	{
		driver.quit();
	}
	*/
}
