package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pract.BaseClass;

public class Login extends BaseClass {

		public Login() {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="username")
		private WebElement txtUser;
		
		@FindBy(id="password")
		private WebElement txtPass;
		
		@FindBy(id="login")
		private WebElement bthLogin;
		
		
		@FindBy(className="login_register")
		private WebElement btnReg;


		public WebElement getTxtUser() {
			return txtUser;
		}


		public WebElement getTxtPass() {
			return txtPass;
		}


		public WebElement getBthLogin() {
			return bthLogin;
		}


		public WebElement getBtnReg() {
			return btnReg;
		}
		
		
		
		
		
		
		
		
}

