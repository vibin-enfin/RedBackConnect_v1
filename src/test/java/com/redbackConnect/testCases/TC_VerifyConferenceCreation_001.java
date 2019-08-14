package com.redbackConnect.testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbckConnect.pageObjects.CreateConferencePage;

public class TC_VerifyConferenceCreation_001 extends CommonBaseClass
{
	@Test
	public void VerifyConferenceCreation() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
		driver.get(baseURL);
		
		CreateConferencePage ccpObj = new CreateConferencePage(driver);
		Thread.sleep(5000);
		
		ccpObj.clickInitiateConferenceEvent();
		ccpObj.clickCreateConferenceEvent();
		
		ccpObj.setConfName(cname);
		ccpObj.setConfEmail(cemail);
		ccpObj.setConfCuratorPhone(cphone);
		ccpObj.setConfStartTime(cstarttime);
		ccpObj.setConfEndTime(cendtime);
		ccpObj.setConfPassCode(cpasscode);
		ccpObj.setConfModeratorCode(cmoderatorcode);
		ccpObj.setConfEndDate(cenddate);
		ccpObj.setConfShowTCP(cshowtcp);
		
		ccpObj.clickPageSubmit();
			
		String message = "Conference start time should be greater than equal to current time";
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + message + "')]"));
		Assert.assertTrue(list.size() > 0);
		
		
	}
}
