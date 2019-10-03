package com.atmecs.homepage.helpers;

import com.atmecs.homepage.testbase.InvokeBrowser;
import com.atmecs.homepage.utils.PageActions;

public class ExploreNow extends InvokeBrowser {

	public void ClickOnExploreNow() {
		Xpath = read.readPropertiesFile("loc.homepage.clickonexplorenow.xpath");
		PageActions.clickOnElement(driver, Xpath);

	}

	public void ClickOnHome() {
		Xpath = read.readPropertiesFile("loc.homepage.clickonhome.xpath");
		PageActions.clickOnElement(driver, Xpath);
	}

}
