package org.pages;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pract.BaseClass;

public class Gmail  extends BaseClass{
	
	public Gmail() {
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(id="identifierId")
	private WebElement gmail;
	
	@FindBy(id="identifierNext") private WebElement btnNext;
	
	public WebElement getBtnNext() {
		return btnNext;
	}

	public WebElement getGmail() {
		return gmail;
	}
	
	
	
	
}
