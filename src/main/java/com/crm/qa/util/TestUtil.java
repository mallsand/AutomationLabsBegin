package com.crm.qa.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {
	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT = 15;

	public static WebElement explicitWait(WebElement element, int time) {
		return new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOf(element));
	}
	
}
