package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pract.BaseClass;

public class Register extends BaseClass {
	public Register() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtuser;
	
	@FindBy(id="password")
	private WebElement txtPass;
	
	public WebElement getCaptch() {
		return captch;
	}
	@FindBy(id="re_password")
	private WebElement txtRePass;
	
	
	@FindBy(id="full_name")
	private WebElement txtFullName;
	
	@FindBy(id="email_add")
	private WebElement txtEmail;
	
	@FindBy(id="captcha")
	private WebElement captch;
	
	@FindBy(id="captcha-form")
	private WebElement txtCap;
	
	
	@FindBy(id="tnc_box")
	private WebElement chckTnc;
	
	@FindBy(id="Submit")
	private WebElement btnReg;
	
	@FindBy(id="Reset")
	private WebElement btnReset;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getTxtRePass() {
		return txtRePass;
	}

	public WebElement getTxtFullName() {
		return txtFullName;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtCap() {
		return txtCap;
	}

	public WebElement getChckTnc() {
		return chckTnc;
	}

	public WebElement getBtnReg() {
		return btnReg;
	}

	public WebElement getBtnReset() {
		return btnReset;
	}
}
