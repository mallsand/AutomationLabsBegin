package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class LoginPage extends TestBase {
	// Page factory -Object repository
	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement LoginBtn;

	@FindBy(xpath = "a[contains(text(),'Sign Up')]")
	WebElement SignUpBtn;

	@FindBy(xpath = "//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;

	// Initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	// Actions:
	public String validateLoginPageTittle() {
		return driver.getTitle();

	}

	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();

	}

	public HomePage Login(String un, String pwd) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginBtn.click();
		return new HomePage();

	}
}
