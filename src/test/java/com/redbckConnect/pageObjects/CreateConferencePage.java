package com.redbckConnect.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateConferencePage 
{
	WebDriver ldriver;
	
//Creating constructor - It will take driver as parameter	
	public CreateConferencePage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
//Specifying the web element location,Then only the web elements are initialized when a page object is created. 	
	@FindBy(linkText="ConferenceEventRestApi")
	@CacheLookup
	WebElement initiateConferenceEvent;
	
	@FindBy(xpath="//a[contains(text(),'/api/ConferenceEventRest/create')]")
	@CacheLookup
	WebElement createConferenceEvent;
	
	@FindBy(name="co.conferenceName")
	@CacheLookup
	WebElement confName;
	
	@FindBy(name="co.curatorEmail")
	@CacheLookup
	WebElement confEmail;
	
	@FindBy(name="co.curatorPhone")
	@CacheLookup
	WebElement confCuratorPhone;
	
	@FindBy(name="co.startTime")
	@CacheLookup
	WebElement confStartTime;
	
	@FindBy(name="co.endTime")
	@CacheLookup
	WebElement confEndTime;
	
	@FindBy(name="co.passCode")
	@CacheLookup
	WebElement confPassCode;
	
	@FindBy(name="co.moderatorCode")
	@CacheLookup
	WebElement confModeratorCode;
	
	@FindBy(name="co.endDate")
	@CacheLookup
	WebElement confEndDate;
	
	@FindBy(name="co.showTCP")
	@CacheLookup
	WebElement confShowTCP;
	
	@FindBy(xpath="//input[@value='Try it out!']")
	@CacheLookup
	WebElement pageSubmit;
	
//Creating action methods
	public void clickInitiateConferenceEvent()
	{
		initiateConferenceEvent.click();
	}
	
	public void clickCreateConferenceEvent()
	{
		createConferenceEvent.click();
	}
	
	public void setConfName(String cname)
	{
		confName.sendKeys(cname);
	}
	
	public void setConfEmail(String cemail)
	{
		confEmail.sendKeys(cemail);
	}
	
	public void setConfCuratorPhone(String cphone)
	{
		confCuratorPhone.sendKeys(cphone);
	}
	
	public void setConfStartTime(String cstarttime)
	{
		confStartTime.sendKeys(cstarttime);
	}
	
	public void setConfEndTime(String cendtime)
	{
		confEndTime.sendKeys(cendtime);
	}
	
	public void setConfPassCode(String cpasscode)
	{
		confPassCode.sendKeys(cpasscode);
	}
	
	public void setConfModeratorCode(String cmoderatorcode)
	{
		confModeratorCode.sendKeys(cmoderatorcode);
	}
	
	public void setConfEndDate(String cenddate)
	{
		confEndDate.sendKeys(cenddate);
	}
	
	public void setConfShowTCP(String cshowtcp)
	{
		confShowTCP.sendKeys(cshowtcp);
	}
	
	public void clickPageSubmit()
	{
		pageSubmit.click();
	}
}
