package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pract.BaseClass;

public class GmailPass extends BaseClass{
	public GmailPass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="password") private WebElement txtpass;
	@FindBy(xpath="(//div[@class='ZFr60d CeoRYc'])[1]")  private WebElement btnNext;
	
	
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnNext() {
		return btnNext;
	}
}
