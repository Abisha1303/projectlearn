package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pract.BaseClass;

public class ConfirmRoom extends BaseClass{
	public ConfirmRoom() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0") 
	private WebElement btnRoom;
	
	@FindBy(id="continue") private WebElement btnCont;

	public WebElement getBtnRoom() {
		return btnRoom;
	}

	public WebElement getBtnCont() {
		return btnCont;
	}
	
}
