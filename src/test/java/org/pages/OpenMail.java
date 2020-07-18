package org.pages;

import java.util.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pract.BaseClass;

public class OpenMail extends BaseClass{
	
	public OpenMail() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="yX xY")
	private List<WebElement> btnInbox;
	
	public List<WebElement> getBtnInbox() {
		return btnInbox;
	}
	
	
 }
